package kr.co.taommall.board.service;

import java.util.List;

import kr.co.taommall.board.vo.Board;

import org.springframework.ui.Model;

public interface BoardService {
	public int insertBoard(Board board);
	public int deleteBoard(int boardNo);
	public List<Board> selectBoardByProductId(int productId,Model model);
	public List<Board> selectAllBoard(int page,Model model);
}
