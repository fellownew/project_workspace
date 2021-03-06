package kr.co.taommall.order.dao;

import java.util.List;

import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.order.vo.Order;

public interface OrderDAO {


	public int insertOrder(Order order);
	public int updateOrder(Order order);
	public int deleteOrderById(int orderId);
	public Order selectOrderByOrderId(int orderId);
	public List<Order> selectAllOrder();
	public List<Order> selectOrderByProductId(String productId);
	public List<Order> selectOrderByBuyerId(String buyerId);
	public List<Order> selectOrderByStatus(String status);
	public List<Order> selectOrderByRecipientId(int recipientId);
	public List<Order> selectOrderBySellerId(String sellerId);
	public List<Order> selectOrderByStatusPaging(int page, String status);
	public int selectOrderCount(String status);
	public List<Order> selectOrderListByStatus(Order order);

}
