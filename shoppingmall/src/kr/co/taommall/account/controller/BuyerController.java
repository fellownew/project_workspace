package kr.co.taommall.account.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.BuyerService;
import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.mail.SendMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buyer")
public class BuyerController {

	@Autowired
	@Qualifier("buyerService")
	BuyerService service;

	@RequestMapping("/buyerJoin.do")
	public String joinBuyer(@ModelAttribute Buyer buyer,Error error) {
		int count = service.insertBuyer(buyer);
		System.out.println(count);
		return "response.jsp";
	}

	@RequestMapping("/identifyId.do")
	@ResponseBody
	public String identifyId(String id) {
		Buyer buyer = service.selectBuyerById(id);
		if (buyer == null) {
			return null;
		}
		return id;
	}

	@RequestMapping("/identifyEmail.do")
	@ResponseBody
	public String identifyEmail(@RequestParam String email) {
		 SendMail send =new SendMail();
		String number = null;
		try {
			number = send.sendMail(email);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return number;
	}
	
	@RequestMapping("/buyerLogin.do")
	@ResponseBody
	public String LoginBuyer(@RequestParam("bId") String id,@RequestParam("bPassword") String password,HttpSession session) {
		System.out.println(id+":"+password+"buyer");
		Buyer buyer = service.selectBuyerById(id);
		if(buyer !=null && buyer.getPassword().equals(password)){
			session.setAttribute("loginInfo", buyer);
			return "success";
		}else{
			return "fail";
		}
	}
}
