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
	public int insertBoard(Board board) {
		return session.insert(nameSpace+"insertBoard",board);
	}

	@Override
	public int deleteBoard(int boardNo) {
		return session.insert(nameSpace+"deleteBoard",boardNo);
	}

	@Override
	public List<Board> selectBoardByProductId(int productId,Model model) {
		return session.selectList(nameSpace+"selectBoardByProductId",productId);
	}
	@Override
	public List<Board> selectAllBoard(Model model){
		return session.selectList(nameSpace+"selectAllBoard",model);
	}
	
	@Override
	public int selectBoardCount(){
		return session.selectOne(nameSpace+"selectBoardCount");
	}

}
