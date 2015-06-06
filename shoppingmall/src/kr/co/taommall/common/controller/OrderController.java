package kr.co.taommall.common.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Address;
import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.cart.vo.Cart;
import kr.co.taommall.order.service.OrderService;
import kr.co.taommall.order.vo.Order;
import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;
import kr.co.taommall.recipient.service.RecipientService;
import kr.co.taommall.recipient.vo.Recipient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/auth")
public class OrderController {
	
	@Autowired
	OrderService service;
	@Autowired 
	ProductService productService;
	@Autowired
	RecipientService recipientService;
	
	@RequestMapping("/memberOrderForm.do")
	public String memberOrderForm(@RequestParam("productId") String[] cartList,@RequestParam("amount") String[] amountList,HttpServletRequest request, HttpSession session){
		List list = new ArrayList();
		for(int idx = 0 ; idx<cartList.length;idx++){
			int productId = Integer.parseInt(cartList[idx]);
			int amount = Integer.parseInt(amountList[idx]);
			Product product = productService.selectProductByIdNoPaging(productId, null);
			if(product !=null){
				Cart cart = new Cart();
				cart.setProductId(productId);
				cart.setAmount(amount);
				cart.setProduct(product);
				Buyer buyer = (Buyer)session.getAttribute("loginInfo");
				cart.setBuyerId(buyer.getBuyerId());
				list.add(cart);
			}
		}
		request.setAttribute("list", list);
		return "buyer/buyer_order_form.form";
	}

	
	@RequestMapping("/payment.do")
	public String payment(@RequestParam("productId") String[] pIds,@RequestParam("amount") String[] amounts,@ModelAttribute() Recipient recipient,@ModelAttribute Address address,  HttpServletRequest request, HttpSession session){
		recipient.setAddress(address);
		Buyer buyer = (Buyer)session.getAttribute("loginInfo");
		if(recipient.getDetail()==null){
			recipient.setDetail("빠른 배송 부탁드립니다");
		}	
			recipientService.insertRecipient(recipient);
			
		if(pIds!=null && amounts !=null && pIds.length==amounts.length){
			for(int idx =0; idx<pIds.length;idx++){
				int productId = Integer.parseInt(pIds[idx]);
				int amount = Integer.parseInt(amounts[idx]);
				Product product = productService.selectProductByIdNoPaging(productId, null);
				if(product == null){
					continue;
				}	
				Order order = new Order(0,productId,amount,"결제완료",buyer.getBuyerId(),product.getSellerId(),recipient.getRecipientId());
				int count1 = service.insertOrder(order);			
			}
			return "redirect:/auth/complete.do?recipientId="+recipient.getRecipientId();
		}else{
			request.setAttribute("errorMessage", "결제 실패 메인페이지로 이동합니다");
			return "WEB-INF/view/layout/error.jsp";
		}

	};

	@RequestMapping("complete.do")
	public String complete(int recipientId,HttpServletRequest request){
		List<Order> list = service.selectOrderByRecipientId(recipientId);
		request.setAttribute("list", list);		
		return "member/member_order_complete.form";
	}
	

}
