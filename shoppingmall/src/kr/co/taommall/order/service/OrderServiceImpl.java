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
	public int insertOrder(Order order) {
		return dao.insertOrder(order);
	}

	@Override
	public int updateOrder(Order order) {
		return dao.updateOrder(order);
	}

	@Override
	public int deleteOrderById(int orderId) {
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
