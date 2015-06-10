package kr.co.taommall.common.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.note.service.NoteService;
import kr.co.taommall.note.vo.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/auth")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	
	//쪽지 보내기
	@RequestMapping("/sendMessage.do")
	public String insertNote(@ModelAttribute Note note,Model model,HttpSession session){
		String user = (String)session.getAttribute("user");
		if(user.equals("buyer")){
			Buyer buyer = (Buyer)session.getAttribute("loginInfo");
			note.setSendId(buyer.getBuyerId());
		}else{
			Seller seller = (Seller)session.getAttribute("loginInfo");
			note.setSendId(seller.getSellerId());
		}
		service.insertNote(note);

		return "redirect:sendNoteList.do";
	}
	//쪽지 삭제
	@RequestMapping("/deleteNote.do")
	@ResponseBody
	public String deleteNote(@RequestParam ArrayList<Integer> list){
		service.deleteNote(list);
		return "success";
	}
	//보관처리-등록
	@RequestMapping("/storeNote.do")
	@ResponseBody
	public String updateNoteStore(@RequestParam ArrayList<Integer> list){
		service.updateNoteStore(list);
		return "success";
	}
	
	
	//받은 쪽지함 조회
	@RequestMapping("/receiveNoteList.do")
	public String selectReceiveNote(@RequestParam(defaultValue="1")int pageNo,Model model,HttpSession session){
		String user = (String)session.getAttribute("user");
		String receiveId = null;

		if(user.equals("buyer")){
			Buyer buyer = (Buyer)session.getAttribute("loginInfo");
			receiveId = buyer.getBuyerId();
		}else{
			Seller seller = (Seller)session.getAttribute("loginInfo");
			receiveId = seller.getSellerId();
		}
		model.addAttribute("receiveId", receiveId);
		List<Note> list = service.selectReceiveNote(pageNo,receiveId,model);
		model.addAttribute("noteList", list);
		return "note.do?folder=receive";
	}
	
	//보낸 쪽지함 조회
	@RequestMapping("/sendNoteList.do")
	public String selectSendNote(@RequestParam(defaultValue="1")int pageNo,Model model,HttpSession session){
		String user = (String)session.getAttribute("user");
		String sendId = null;
		if(user.equals("buyer")){
			Buyer buyer = (Buyer)session.getAttribute("loginInfo");
			sendId = buyer.getBuyerId();

		}else{
			Seller seller = (Seller)session.getAttribute("loginInfo");
			sendId = seller.getSellerId();		
		}
		model.addAttribute("sendId", sendId);
		List<Note> list = service.selectSendNote(pageNo,sendId,model);
		model.addAttribute("noteList", list);
		return "note.do?folder=send";
	}
	
	//보관 쪽지함 조회
	@RequestMapping("/storeNoteList.do")
	public String selectStoreNote(@RequestParam(defaultValue="1")int pageNo,Model model,HttpSession session){
		String receiveId = null;
		String user = (String)session.getAttribute("user");
		if(user.equals("buyer")){
			Buyer buyer = (Buyer)session.getAttribute("loginInfo");
			receiveId = buyer.getBuyerId();
		}else{
			Seller seller = (Seller)session.getAttribute("loginInfo");
			receiveId = seller.getSellerId();	
		}
		model.addAttribute("receiveId", receiveId);
		List<Note> list = service.selectStoreNote(pageNo,receiveId,model);
		model.addAttribute("noteList", list);
		return "note.do?folder=store";
	}
	
	//쪽지 보기
	@RequestMapping("/viewNote.do")
	public String selectNoteByNo(@RequestParam int noteNo,Model model,HttpSession session){
		Note note = (Note)service.selectNoteByNo(noteNo,session);
		model.addAttribute("note",note);
		return "note.do?folder=view";
	}
	
}
