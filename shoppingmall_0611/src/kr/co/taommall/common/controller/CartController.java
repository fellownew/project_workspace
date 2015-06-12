package kr.co.taommall.common.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.cart.service.CartService;
import kr.co.taommall.cart.vo.Cart;
import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cart/auth")
public class CartController {

	@Autowired
	@Qualifier("cartService")
	CartService service;
	
	@Autowired
	ProductService productService;

	
	@RequestMapping("/cartInput.do")
	public String cartInput(@ModelAttribute Cart cart, HttpSession session) {
		String buyerId = ((Buyer) session.getAttribute("loginInfo")).getBuyerId();
		cart.setBuyerId(buyerId);

		service.insertCart(cart);
		return "redirect:cartList.do";

	}

	@RequestMapping("/cartList.do")
	public String cartList(HttpServletRequest request, HttpSession session) {
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");
		String buyerId = buyer.getBuyerId();
		List<Cart> list = service.selectCartByerId(buyerId);
		request.setAttribute("cart_list", list);
		request.setAttribute("buyerId", buyerId);
		return "cart/cartList.form";
	}

	@RequestMapping("modifyAmount.do")
	@ResponseBody
	public String modifyAmount(@ModelAttribute Cart cart) {
		int count = service.updateCart(cart);
		if (count != 0) {
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping("deleteCartList.do")
	public String deleteCartList(@ModelAttribute Cart cart,
			HttpServletRequest request) {
		int count = service.deleteCart(cart);
		
		if (count != 0) {
			return "redirect:cartList.do";
		} else {
			request.setAttribute("error", "실패");
			return "cart/cartList.form";
		}
	}

}