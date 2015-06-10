package kr.co.taommall.order.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.common.PagingBean;
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
		Map map = new HashMap();
		map.put("status",status);
		return session.selectList(namespace + "selectOrderByStatus", map);
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

	@Override
	public List<Order> selectOrderByRecipientId(int recipientId) {
		
		return session.selectList(namespace+"selectOrderByRecipientId",recipientId);
	}
	public List<Order> selectOrderBySellerId(String sellerId){
		return session.selectList(namespace+"selectOrderBySellerId",sellerId);
	}

	public List<Order> selectOrderByStatusPaging(int page, String status) {
		Map map = new HashMap();
		map.put("page", page);
		map.put("status", status);
		map.put("contentsPerPage",PagingBean.CONTENTS_PER_PAGE);
		return session.selectList(namespace+"selectOrderByStatusPaging",map);
	}

	public int selectOrderCount(String status) {
		Map map = new HashMap();
		return session.selectOne(namespace+"selectOrderCount",status);
	}
}
