package kr.co.taommall.board.dao;

import java.util.List;

import kr.co.taommall.board.vo.Board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSessionTemplate session;
	private String nameSpace = "kr.co.taommall.board.dao.";
	
	@Override
	public int insertBoard(Model model) {
		return session.insert(nameSpace+"insertBoard",model);
	}

	@Override
	public int deleteBoard(Model model) {
		return session.insert(nameSpace+"deleteBoard",model);
	}

	@Override
	public List<Board> selectBoardByProductId(Model model) {
		return session.selectList(nameSpace+"selectBoardByProductId",model);
	}

}
