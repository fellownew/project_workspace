package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

public class OrderDAOImpl implements OrderDAO{

	private static OrderDAOImpl instance = new OrderDAOImpl();

	@Autowired
	private SqlSessionTemplate session;
	private String namespace = "order.dao.order.";

	private OrderDAOImpl() {
	}

	public static OrderDAOImpl getInstance() {
		return instance;
	}

	public List<Order> selectAllOrder() {
		return session.selectList(namespace + "selectAllOrder");
	}

	public Order selectOrderByOrderId(String orderId) {
		return session.selectOne(namespace + "selectOrderByOrderId", orderId);
	}

	public List<Order> selectOrderByBuyerId(String buyerId) {
		return session.selectList(namespace + "selectOrderByBuyerId", buyerId);
	}

	public List<Order> selectOrderByStatus(String status) {
		return session.selectList(namespace + "selectOrderByStatus", status);
	}

	public int deleteOrderById(String id) {
		return session.delete(namespace + "deleteOrderById", id);
	}

	public int updateOrder(Order order) {
		return session.update(namespace + "updateOrderById", order);
	}

	public int insertOrder(Order order) {
		return session.insert(namespace + "insertOrder", order);
	}

=======
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
	
	
	
>>>>>>> d8f172b7dee6e0f4d2960577365e4df149aec429
}
