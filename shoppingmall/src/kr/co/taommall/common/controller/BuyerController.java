package kr.co.taommall.common.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
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
	public String identifyEmail(@RequestParam(required=true) String email,HttpSession session) {
		String jsessionid = session.getId();
		 SendMail send =new SendMail();
		String number = null;
		try {
			number = send.sendMail(email,jsessionid);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.invalidate();
		}
		return number;
	}
	@RequestMapping("/identifyEmailCheck.do")
	@ResponseBody
	public String identifyEmailCheck(@RequestParam(required=true) String email,@RequestParam(required=true) String id,HttpSession session) {
		String jsessionid = session.getId();
		 SendMail send =new SendMail();
		String number = null;
		Buyer buyer = service.selectBuyerById(id);
		if(buyer.getEmail().equals(email)){
			
		try {
			number = send.sendMail(email,jsessionid);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.invalidate();
		}
		return number;
		}else{
			return "";
		}
	}
	@RequestMapping("/idConfirm.do")
	public String idCheck(@RequestParam("id") String name, @RequestParam String email,HttpServletRequest request){
		Buyer buyer = new Buyer();
		buyer.setName(name);
		buyer.setEmail(email);
		buyer = service.selectBuyerByemail(buyer);
		if(buyer ==null){
			request.setAttribute("errorMessage", "아이디가 없습니다.");
			return "/error/error_check.jsp";
		}
		request.setAttribute("success", "id : "+buyer.getBuyerId());
		return "/error/complete.jsp";
	}
	@RequestMapping("/passwordCheck.do")
	public String PasswordCheck(HttpServletRequest request , @RequestParam(value="newPassword",required=true) String newPassword ,@RequestParam(required=true,value="id") String id) {
		Buyer buyer = new Buyer();
		buyer.setPassword(newPassword);
		buyer.setBuyerId(id);
		int count = service.updateBuyerById(buyer);
		if(count ==0){
			request.setAttribute("errorMessage", "비밀번호 변경 실패");
			return "/error/error_check.jsp";
		}
		request.setAttribute("success", "변경완료");
		return "/error/complete.jsp";
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
