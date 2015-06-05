package kr.co.taommall.common.controller;

import java.util.List;

import kr.co.taommall.board.service.BoardService;
import kr.co.taommall.board.vo.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/auth/insertBoard")
	public String insertBoard(@ModelAttribute Board board,@RequestParam int productId){
		System.out.println("보드 컨트롤러"+board);
		service.insertBoard(board);
		return "redirect:/productInfo.do?productId="+productId;
	}
	
	public String deleteBoard(@RequestParam int boardNo,@RequestParam int productId,Model model){
		service.deleteBoard(boardNo);
		return "redirect:/productInfo.do?productId="+productId;
	}
	
	@RequestMapping("/selectBoardByProductId.do")
	@ResponseBody
	public List<Board> selectBoardByProductId(@RequestParam int productId,Model model){
		List<Board> list = service.selectBoardByProductId(productId,model);
		model.addAttribute("boardList",list);
		return list;
	}
	
	@RequestMapping("/boardList.do")
	public String selectAllBoard(Model model){
		
		
		return "product/board_list.form";
	}
}