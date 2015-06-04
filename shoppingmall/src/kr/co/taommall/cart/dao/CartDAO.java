package kr.co.taommall.cart.dao;

import java.util.List;

import kr.co.taommall.cart.vo.Cart;

public interface CartDAO {

	public List selectCartByBuyerId(String buyerId);
	public int deleteCartByProductId(Cart cart);
	public int insertCart(Cart cart);
	public int updateCartByProductId(Cart cart);
}
