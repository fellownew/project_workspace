package kr.co.taommall.order.service;

import java.util.List;

import kr.co.taommall.order.vo.Order;

public interface OrderService {
	public void insertOrder(Order order);
	public void updateOrder(Order order);
	public int deleteOrder(String orderId);
	public List<Order> selectAllOrder();

}