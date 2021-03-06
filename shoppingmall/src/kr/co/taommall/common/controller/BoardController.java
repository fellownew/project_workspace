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
	
	@RequestMapping("/auth/insertBoard.do")
	public String insertBoard(@ModelAttribute Board board,@RequestParam(required=true) int productId){
		service.insertBoard(board);
		return "redirect:/productInfo.do?productId="+productId;
	}
	
	@RequestMapping("/auth/deleteBoard.do")
	public String deleteBoard(@RequestParam(required=true) int boardNo,Model model){
		service.deleteBoard(boardNo);
		return "redirect:/board/auth/boardList.do";
	}
	
	@RequestMapping("/selectBoardByProductId.do")
	@ResponseBody
	public List<Board> selectBoardByProductId(@RequestParam(required=true) int productId,Model model){
		List<Board> list = service.selectBoardByProductId(productId,model);
		model.addAttribute("boardList",list);
		return list;
	}
	
	@RequestMapping("/auth/boardList.do")
	public String selectAllBoard(@RequestParam(defaultValue="1")int page,Model model){
		List<Board> list = service.selectAllBoard(page,model);
		model.addAttribute("boardList",list);
		return "product/board_list.form";
	}
}
