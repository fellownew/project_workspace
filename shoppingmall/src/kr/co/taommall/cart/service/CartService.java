package kr.co.taommall.cart.service;

import java.util.List;

import kr.co.taommall.cart.vo.Cart;

public interface CartService {

	
	public List selectCartByerId(String buyerId);

	public int updateCart(Cart cart);

	public int insertCart(Cart cart);
	
	public int deleteCart(Cart cart);
	
	public Cart selectCartByProductId(Cart cart);
	
	
}
