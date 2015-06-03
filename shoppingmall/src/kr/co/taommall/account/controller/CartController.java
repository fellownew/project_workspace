package kr.co.taommall.account.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.cart.controller.CartService;
import kr.co.taommall.cart.vo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		return "/WEB-INF/view/body/cart/cartList.jsp";
	}
	@RequestMapping("modifyAmount.do")
	public String modifyAmount(){
		return "success";
	}
}
