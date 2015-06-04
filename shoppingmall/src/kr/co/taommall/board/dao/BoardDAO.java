package kr.co.taommall.board.dao;

import java.util.List;

import kr.co.taommall.board.vo.Board;

import org.springframework.ui.Model;

public interface BoardDAO {
	public int insertBoard(Model model);
	public int deleteBoard(Model model);
	public List<Board> selectBoardByProductId(Model model);
}
