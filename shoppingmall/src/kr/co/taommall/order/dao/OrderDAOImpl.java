package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("OrderDAO")
public class OrderDAOImpl implements OrderDAO{

	private static OrderDAOImpl instance = new OrderDAOImpl();

	@Autowired
	private SqlSessionTemplate session;
	private String namespace = "kr.co.taommall.order.dao.";

	private OrderDAOImpl() {
	}

	public static OrderDAOImpl getInstance() {
		return instance;
	}

	public List<Order> selectAllOrder() {
		return session.selectList(namespace + "selectAllOrder");
	}

	public List<Order> selectOrderByProductId(String productId) {
		System.out.println("DAOImpl"+productId);
		return session.selectOne(namespace + "selectOrderByProductId", productId);
	}
	
	@Override
	public Order selectOrderByOrderId(int orderId) {
		return session.selectOne(namespace + "selectOrderByOrderId", orderId);
	}

	public List<Order> selectOrderByBuyerId(String buyerId) {
		return session.selectList(namespace + "selectOrderByBuyerId", buyerId);
	}

	public List<Order> selectOrderByStatus(String status) {
		return session.selectList(namespace + "selectOrderByStatus", status);
	}

	public int deleteOrderById(int id) {
		return session.delete(namespace + "deleteOrderById", id);
	}

	public int updateOrder(Order order) {
		return session.update(namespace + "updateOrderById", order);
	}

	public int insertOrder(Order order) {
		return session.insert(namespace + "insertOrder", order);
	}
}
