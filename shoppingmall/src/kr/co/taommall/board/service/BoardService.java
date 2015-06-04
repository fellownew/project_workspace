package kr.co.taommall.board.service;

import java.util.List;

import kr.co.taommall.board.vo.Board;

import org.springframework.ui.Model;

public interface BoardService {
	public int insertBoard(Model model);
	public int deleteBoard(Model model);
	public List<Board> selectBoardByProductId(Model model);
	
}
