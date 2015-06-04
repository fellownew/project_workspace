package kr.co.taommall.common.controller;

import java.util.List;

import kr.co.taommall.board.service.BoardService;
import kr.co.taommall.board.vo.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	public String insertBoard(@ModelAttribute Board board,@RequestParam int productId,Model model){
		model.addAttribute("board", board);
		service.insertBoard(model);
		return "redirect:productInfo.do?productId="+productId;
	}
	
	public String deleteBoard(@RequestParam int boardNo,@RequestParam int productId,Model model){
		model.addAttribute("boardNo", boardNo);
		service.deleteBoard(model);
		return "redirect:productInfo.do?productId="+productId;
	}
	
	public String selectBoardByProductId(@RequestParam int productId,Model model){
		model.addAttribute("productId", productId);
		List<Board> list = service.selectBoardByProductId(model);
		model.addAttribute("boardList",list);
		return "productInfo.do?productId="+productId;
	}
	
}
