package kr.co.taommall.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.order.service.OrderService;
import kr.co.taommall.order.vo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/auth")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@RequestMapping("/buyerOrderForm.do")
	public String orderList(@RequestParam("productId")String[] productId, int amount,HttpServletRequest request, HttpSession session) {

		
		return "buyer/buyer_order_form.form";
	}
}
