package kr.co.taommall.board.service;

import java.util.List;

import kr.co.taommall.board.dao.BoardDAO;
import kr.co.taommall.board.vo.Board;
import kr.co.taommall.common.PagingBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;
	
	
	@Override
	public int insertBoard(Board board) {
		
		return dao.insertBoard(board);
	}

	@Override
	public int deleteBoard(int boardNo) {
		return dao.deleteBoard(boardNo);
	}

	@Override
	public List<Board> selectBoardByProductId(int productId,Model model) {
		List<Board> list = dao.selectBoardByProductId(productId,model);
		return list;
	}

	@Override
	public List<Board> selectAllBoard(int pageNo,Model model){
		int totalContent = dao.selectBoardCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pagingBean", pagingBean);
		List<Board> list = dao.selectAllBoard(model);
		return list;
	}
}
