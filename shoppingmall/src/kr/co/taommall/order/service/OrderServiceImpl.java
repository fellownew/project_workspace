package kr.co.taommall.order.service;

import java.util.List;

import kr.co.taommall.order.dao.OrderDAO;
import kr.co.taommall.order.vo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDAO dao;

	@Override
	public void insertOrder(Order order) {
		dao.insertOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		dao.updateOrder(order);
	}

	@Override
	public int deleteOrder(String orderId) {
		return dao.deleteOrderById(orderId);
	}

	@Override
	
	public List<Order> selectOrderByBuyerId(String buyerId){
		
		return dao.selectOrderByBuyerId(buyerId);
	}

	@Override
	public List<Order> selectOrderByProductId(String productId) {
		System.out.println("OrderService");
		return dao.selectOrderByProductId(productId);
	}
}
