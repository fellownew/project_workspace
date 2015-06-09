package kr.co.taommall.order.service;

import java.util.HashMap;
import java.util.List;

import kr.co.taommall.common.PagingBean;
import kr.co.taommall.order.dao.OrderDAO;
import kr.co.taommall.order.vo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

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
	public List<Order> selectOrderByBuyerId(String buyerId) {

		return dao.selectOrderByBuyerId(buyerId);
	}

	@Override
	public List<Order> selectOrderByProductId(String productId) {
		return dao.selectOrderByProductId(productId);
	}

	public Order selectOrderByOrderId(int orderId) {
		return dao.selectOrderByOrderId(orderId);
	}

	@Override
	public List<Order> selectOrderByRecipientId(int recipientId) {
		return dao.selectOrderByRecipientId(recipientId);
	}

	public List<Order> selectOrderBySellerId(String sellerId) {
		return dao.selectOrderBySellerId(sellerId);
	}

	@Override
	public List<Order> selectOrderByStatus(String status) {
		if (status.equals("모두보기")) {
			status = null;
		}
		return dao.selectOrderByStatus(status);
	}

	@Override
	public HashMap selectOrderByStatusPaging(int page, String status) {
		if (status.equals("모두보기")) {
			status = null;
		}
		int totalContent = dao.selectOrderCount(status);
		List<Order> list = dao.selectOrderByStatusPaging(page, status);
		if(status==null){
			status="모두보기";
		}
		// PagingBean 생성
		PagingBean pagingBean = new PagingBean(totalContent, page);
		// 두개의 값(List, PagingBean)을 Map에 넣어 return
		HashMap map = new HashMap();
		map.put("list", list);
		map.put("pagingBean", pagingBean);
		map.put("status", status);
		map.put("pageNo", page);
		return map;
	}

}
