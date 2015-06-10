package kr.co.taommall.note.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.common.PagingBean;
import kr.co.taommall.note.dao.NoteDAO;
import kr.co.taommall.note.vo.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	private NoteDAO dao;

	@Override
	public void insertNote(Note note) {
			dao.insertNote(note);
	}

	@Override
	@Transactional
	public void deleteNote(ArrayList<Integer> list) {
		for(int noteNo : list){
			dao.deleteNote(noteNo);			
		}
	}

	@Override
	@Transactional
	public void updateNoteStore(ArrayList<Integer> list) {
		for(int noteNo : list){
		dao.updateNoteStore(noteNo);
		}
	}


	@Override
	public List<Note> selectReceiveNote(int pageNo,String receiveId,Model model) {		
		int totalContent = dao.selectNoteCountReceive(receiveId);
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		return dao.selectReceiveNote(model);
	}


	@Override
	public List<Note> selectSendNote(int pageNo,String sendId,Model model) {
		int totalContent = dao.selectNoteCountSend(sendId);
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		return dao.selectSendNote(model);
	}


	@Override
	public List<Note> selectStoreNote(int pageNo,String receiveId,Model model) {
		int totalContent = dao.selectNoteCountStore(receiveId);
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		return dao.selectStoreNote(model);
	}
	
	//읽기를 시행했기 때문에 읽기 처리도 함.
	@Override
	@Transactional
	public Note selectNoteByNo(int noteNo,HttpSession session){
		String id=null;
		String user = (String)session.getAttribute("user");
		if(user.equals("buyer")){
			Buyer buyer = (Buyer)session.getAttribute("loginInfo");
			id = buyer.getBuyerId();
		}else{
			Seller seller = (Seller)session.getAttribute("loginInfo");
			id = seller.getSellerId();	
		}
		
		Note note = dao.selectNoteByNo(noteNo);
		
		if(note.getReceiveId().equals(id)){
			dao.updateNoteRead(noteNo);		
			note = dao.selectNoteByNo(noteNo);
		}
		return note;
	}

	@Override
	public int selectNoteCountReceiveNoRead(String receiveId) {
		// TODO Auto-generated method stub
		return dao.selectNoteCountReceiveNoRead(receiveId);
	}
	
}
