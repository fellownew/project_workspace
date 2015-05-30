package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

public interface OrderDAO {
	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrder(String orderId);
	public List<Order> selectAllOrder();
}
