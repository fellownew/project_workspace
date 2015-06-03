package kr.co.taommall.cart.controller;

import java.util.List;

import kr.co.taommall.cart.dao.CartDAO;
import kr.co.taommall.cart.vo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	@Qualifier("cartDAO")
	CartDAO dao;

	public List selectCartByerId(String buyerId) {
		return dao.selectCartByBuyerId(buyerId);
	}

	public int updateCart(Cart cart) {
		return dao.updateCartByProductId(cart);
	}

	public int insertCart(Cart cart) {
		return dao.insertCart(cart);
	}
	
	public int deleteCart(Cart cart){
		return dao.deleteCartByProductId(cart);
	}
}
