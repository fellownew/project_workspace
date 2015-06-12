package kr.co.taommall.order.service;

import java.util.HashMap;
import java.util.List;

import kr.co.taommall.order.vo.Order;

public interface OrderService {
	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrderById(int orderId);
	public List<Order> selectOrderByBuyerId(String buyerId);
	public List<Order> selectOrderByProductId(String productId);
	public Order selectOrderByOrderId(int orderId);
	public List<Order> selectOrderByRecipientId(int recipientId);
	public List<Order> selectOrderBySellerId(String sellerId);
	public List<Order> selectOrderByStatus(String status);
	public HashMap selectOrderByStatusPaging(int page,String status);
	public List<Order> selectOrderListByStatus(Order order);

}
