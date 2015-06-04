package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.order.vo.Order;

public interface OrderDAO {
<<<<<<< HEAD

	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrderById(String orderId);
	public Order selectOrderByOrderId(String orderId);
	public List<Order> selectAllOrder();
	public List<Order> selectOrderByBuyerId(String buyerId);
	public List<Order> selectOrderByStatus(String status);
	
=======
	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrder(String orderId);
	public List<Order> selectAllOrder();
>>>>>>> d8f172b7dee6e0f4d2960577365e4df149aec429
}
