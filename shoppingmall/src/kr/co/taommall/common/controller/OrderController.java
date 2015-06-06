package kr.co.taommall.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Address;
import kr.co.taommall.account.vo.Buyer;
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
	
	
/*   
 private String orderId;
 private int productId;
 private int amount;
 private String status;
 private String buyerId;
 private String sellerId;
 
     OrderController에 들어감 @RequestMapping("payment.do") public String payment(){};
        taommall/auth/payment.do
     
        1. orderId - 자동으로 생성되게 seq써서 만들것.
        2. productId는 내가 ${reqeustScope.product.productId}
        3. amount는 ${requestScope.amount}
        4. status default="배송준비";
        5. buyerId <--sessionScope.loginInfo //Controller HttpSession  Buyer buyer = session.getAttribute("loginInfo");
                 buyer.getbuyerId();
        6.          Product product = productService.selectProductNoPaging(productId,null); 
           String sellerId = product.getSellerId();

          Order order = new Order(orderId,productId,amount,status,buyerId,sellerId);
          
          int count = serivce.insertOrder(order);
       	System.out.Println(count);
*/
	
	@RequestMapping("/memberOrderForm.do")
	public String orderList(@RequestParam("productId") int productId, int amount, HttpServletRequest request, HttpSession session) {
		Product product = productService.selectProductByIdNoPaging(productId, null);	//상품번호로 상품 조회
		if(product!=null){
			request.setAttribute("product", product);
			request.setAttribute("amount", amount);
			return "buyer/buyer_order_form.form";
		}else{
			return "redirect:mainPage.do";
		}
	}
	
	@RequestMapping("/payment.do")
	public String payment(@RequestParam("productId") int productId, int amount, String name,@ModelAttribute Address address, String phone,@RequestParam(defaultValue="빠른 배송 부탁드립니다.") String detail,  HttpServletRequest request, HttpSession session){
		System.out.println(address);
		
		//recipient 객체 생성
		Recipient recipient = new Recipient(0, name, phone, detail,address);
		
		//수취인정보를 가진 객체 생성해서 insert실행
		int count2 = recipientService.insertRecipient(recipient);
		
		Product product = productService.selectProductByIdNoPaging(productId, null);
		if(product == null){
			System.out.println("Error 났음!1");

		}
		
		//status = "배송준비"
		String status = "배송준비";		
		//buyerId
		Buyer buyer = (Buyer)session.getAttribute("loginInfo");
		String buyerId = buyer.getBuyerId();
		//sellerId
		
		String sellerId = product.getSellerId();
		//orderId		
		Order order = new Order(0,productId,amount,status,buyerId,sellerId,recipient.getRecipientId());
		int count1 = service.insertOrder(order);
		
		if(count1 == 0){
			System.out.println("Error 났음!2");

		}else{
			System.out.println("완료 페이지 이동!");
		}
		//redirect 방식으로 이동 , orderId를 전송해준다.
		return "redirect:/auth/complete.do?orderId="+order.getOrderId();
	};

	@RequestMapping("complete.do")
	public String complete(int orderId,HttpServletRequest request){
		Order order = service.selectOrderByOrderId(orderId);		
		request.setAttribute("order", order);
		
		return "member/member_order_complete.form";
	}
}
