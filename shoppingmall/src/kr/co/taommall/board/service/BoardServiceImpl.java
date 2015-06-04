package kr.co.taommall.board.service;

import java.util.List;

import kr.co.taommall.board.dao.BoardDAO;
import kr.co.taommall.board.vo.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;
	
	@Override
	public int insertBoard(Model model) {
		return dao.insertBoard(model);
	}

	@Override
	public int deleteBoard(Model model) {
		return dao.deleteBoard(model);
	}

	@Override
	public List<Board> selectBoardByProductId(Model model) {
		List<Board> list = dao.selectBoardByProductId(model);
		return list;
	}

}
