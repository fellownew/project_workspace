package kr.co.taommall.account.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.cart.service.CartService;
import kr.co.taommall.cart.vo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cart/auth")
public class CartController {

	
	@Autowired
	@Qualifier("cartService")
	CartService service;
	
	@RequestMapping("/cartList.do")
	public String cartList(HttpServletRequest request,HttpSession session){
		Buyer buyer = (Buyer)session.getAttribute("loginInfo");
		String buyerId = buyer.getBuyerId();
		List<Cart> list = service.selectCartByerId(buyerId);
		request.setAttribute("cart_list", list);
		request.setAttribute("buyerId", buyerId);		
		return "/WEB-INF/view/body/cart/cartList.jsp";
	}
	@RequestMapping("modifyAmount.do")
	@ResponseBody
	public String modifyAmount(@ModelAttribute Cart cart){
		int count = service.updateCart(cart);
		if(count !=0){
			return "success";			
		}else{
			return "fail";
		}
	}
	@RequestMapping("deleteCartList.do")
	public String deleteCartList(@ModelAttribute Cart cart,HttpServletRequest request){
		System.out.println(cart);
		int count = service.deleteCart(cart);
		System.out.println(count);
		List<Cart> list = service.selectCartByerId(cart.getBuyerId());
		request.setAttribute("cart_list", list);
		if(count !=0){
			return "/WEB-INF/view/body/cart/cartList.jsp";			
		}else{
			request.setAttribute("error", "잘못된 접근입니다.");
			return "/WEB-INF/view/body/cart/cartList.jsp";
		}
	}
}
