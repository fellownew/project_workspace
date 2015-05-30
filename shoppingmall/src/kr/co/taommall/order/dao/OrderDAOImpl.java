package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO{
	
	@Autowired
	private SqlSessionTemplate session;
	private String namespace = "kr.co.taommall.order.dao.";

	@Override
	public int insertOrder(Order order) {
		int cnt = session.insert(namespace+"insertOrder",order);
		return cnt;
	}

	@Override
	public int updateOrder(Order order) {
		int cnt = session.update(namespace+"updateOrder",order);
		return cnt;
	}

	@Override
	public int deleteOrder(String order) {
		int cnt = session.delete(namespace+"deleteOrder",order);
		return cnt;
	}

	@Override
	public List<Order> selectAllOrder() {
		return session.selectList(namespace+"SelectAllOrder");
	}
	
	
	
}
