package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

public interface OrderDAO {


	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrderById(String orderId);
	public Order selectOrderByOrderId(String orderId);
	public List<Order> selectAllOrder();
	public List<Order> selectOrderByProductId(String productId);
	public List<Order> selectOrderByBuyerId(String buyerId);
	public List<Order> selectOrderByStatus(String status);


}
