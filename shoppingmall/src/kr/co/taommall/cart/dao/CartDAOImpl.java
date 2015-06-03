package kr.co.taommall.cart.dao;

import java.util.List;

import kr.co.taommall.cart.vo.Cart;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	private static CartDAOImpl instance = new CartDAOImpl();
	
	@Autowired
	private SqlSessionTemplate session;

	private String namespace = "kr.co.taommall.cart.dao.";

	private CartDAOImpl() {

	}

	public static CartDAOImpl getInstance() {
		return instance;
	}

	public List selectCartByBuyerId(String buyerId) {
		return session.selectList(namespace + "selectCartByBuyerId", buyerId);

	}

	public int insertCart(Cart cart) {
		return session.insert(namespace + "insertCart", cart);

	}

	public int deleteCartByProductId(Cart cart) {
		return session.delete(namespace + "deleteCartByProductId", cart);

	}

	public int updateCartByProductId(Cart cart) {
		return session.update(namespace + "updateCartByProductId", cart);

	}
}
