package kr.co.taommall.common.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.BuyerService;
import kr.co.taommall.account.vo.Address;
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
	public String joinBuyer(@ModelAttribute Address address,@ModelAttribute Buyer buyer) {
		buyer.setAddress(address);
			int count = service.insertBuyer(buyer);
		return "redirect:/mainPage.do";
	}

	@RequestMapping("/identifyId.do")
	@ResponseBody
	public String identifyId(@RequestParam(required=true) String id) {
		Buyer buyer = service.selectBuyerById(id);
		if (buyer == null) {
			return null;
		}
		return id;
	}

	@RequestMapping("/identifyEmail.do")
	@ResponseBody
	public String identifyEmail(@RequestParam(required=true) String email) {
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
	public String LoginBuyer(@RequestParam(value="bId",required=true) String id,@RequestParam(required=true,value="bPassword") String password,HttpSession session) {
		Buyer buyer = service.selectBuyerById(id);
		if(buyer !=null && buyer.getPassword().equals(password)){
			session.setAttribute("loginInfo", buyer);
			session.setAttribute("user","buyer");
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("/passwordModify.do")
	@ResponseBody
	public String buyerPasswordModify(@RequestParam(required=true)String password,@RequestParam(required=true,value="currPassword") String currPassword, HttpSession session){
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");
		if(currPassword !=null && buyer.getPassword().equals(currPassword)){
			buyer.setPassword(password);
			int count = service.updateBuyerById(buyer);
			session.setAttribute("loginInfo", buyer);
			session.setAttribute("user","buyer");
			return password;
		}else{
			return "fail";
		}
	

	}
	
	@RequestMapping("/phoneModify.do")
	@ResponseBody
	public String buyerPhoneModify(@RequestParam(required=true)String phone, HttpSession session){
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");		
		buyer.setPhone(phone);
		int count = service.updateBuyerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","buyer");
		if(count == 0){
			return "fail";
		}

		return phone;
	}
	
	@RequestMapping("/emailModify.do")
	@ResponseBody
	public String buyerEmailModify(@RequestParam(required=true)String email, HttpSession session){
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");		
		buyer.setEmail(email);
		int count = service.updateBuyerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","buyer");
		if(count == 0){
			return "fail";
		}

		return email;
	}
	
	
	@RequestMapping("/addressModify.do")
	@ResponseBody
	public Address buyerAddressModify(@ModelAttribute Address address, HttpSession session){
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");		
		buyer.setAddress(address);
		int count = service.updateBuyerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","buyer");
		if(count == 0){
			return null;
		}

		return address;
	}
	
	@RequestMapping("/buyerWithdraw.do")
	public String deleteBuyer(HttpSession session){
		Buyer buyer = (Buyer) session.getAttribute("loginInfo");
		String buyerId = buyer.getBuyerId();
		service.deleteBuyerById(buyerId);
		session.invalidate();
		return "redirect:/mainPage.do";
	}
	
}
