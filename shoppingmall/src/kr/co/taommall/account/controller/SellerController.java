package kr.co.taommall.account.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.SellerService;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.common.PagingBean;
import kr.co.taommall.mail.SendMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/seller")
public class SellerController {
	
	@Autowired
	@Qualifier("sellerService")
	SellerService service;
	
	@RequestMapping("/sellerJoin.do")
	public String joinBuyer(@ModelAttribute Seller seller,Error error) {
		int count = service.insertSeller(seller);
		System.out.println(seller);
		System.out.println(count);
		return "response.jsp";
	}
	
	
	@RequestMapping("/sellerLogin.do")
	@ResponseBody
	public String LoginBuyer(@RequestParam("sId") String id,@RequestParam("sPassword") String password,HttpSession session) {
		System.out.println(id+":"+password);
		Seller seller = service.selectSellerById(id);
		System.out.println(seller);
		if(seller !=null && seller.getPassword().equals(password)){
			session.setAttribute("loginInfo", seller);
			session.setAttribute("user","seller");
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("/identifyId.do")
	@ResponseBody
	public String identifyId(String id) {
		Seller seller = service.selectSellerById(id);
		if (seller == null) {
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
	public String LoginSeller(@RequestParam("bId") String id,@RequestParam("bPassword") String password,HttpSession session) {
		System.out.println(id+":"+password+"buyer");
		Seller seller = service.selectSellerById(id);
		if(seller !=null && seller.getPassword().equals(password)){
			session.setAttribute("loginInfo", seller);
			session.setAttribute("user","seller");
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("/passwordModify.do")
	@ResponseBody
	public String sellerPasswordModify(String password,@RequestParam("currPassword") String currPassword, HttpSession session){
		Seller seller = (Seller) session.getAttribute("loginInfo");
		if(currPassword !=null && seller.getPassword().equals(currPassword)){
			seller.setPassword(password);
			System.out.println(seller);
			int count = service.updateSellerById(seller);
			session.setAttribute("loginInfo", seller);
			session.setAttribute("user","seller");
			return password;
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("/phoneModify.do")
	@ResponseBody
	public String sellerPhoneModify(String phone, HttpSession session){
		Seller buyer = (Seller) session.getAttribute("loginInfo");		
		buyer.setPhone(phone);
		System.out.println(buyer);
		int count = service.updateSellerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","seller");
		if(count == 0){
			return "fail";
		}
		return phone;
	}
	
	@RequestMapping("/emailModify.do")
	@ResponseBody
	public String sellerEmailModify(String email, HttpSession session){
		Seller buyer = (Seller) session.getAttribute("loginInfo");		
		buyer.setEmail(email);
		System.out.println(buyer);
		int count = service.updateSellerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","seller");
		if(count == 0){
			return "fail";
		}
		return email;
	}
	
	
	@RequestMapping("/addressModify.do")
	@ResponseBody
	public String sellerAddressModify(String address, HttpSession session){
		Seller buyer = (Seller) session.getAttribute("loginInfo");		
		buyer.setAddress(address);
		System.out.println(buyer);
		int count = service.updateSellerById(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","seller");
		if(count == 0){
			return "fail";
		}

		return address;
	}
	

	@RequestMapping("/logout.do")
	   public String logout(HttpSession session){
	      session.invalidate();
	      return "main.do";
	   }

	
	public String sellerAuthCheck(){
		
		List<Seller> list = service.selectSellerOrderByAuth("true");
		for(Seller s : list){
			System.out.println(s);
		}
		return null;
	}
	
	@RequestMapping("/sellerList.do")
	public ModelAndView sellerList(){
		List<Seller> list = service.selectSellerAllMember();
		Map map = new HashMap();
		map.put("member_list", list);
		map.put("auth","asc");
		return new ModelAndView("/body/seller/memberList.jsp", map);
	}

	@RequestMapping("/memberListPaging.do")
	public ModelAndView memberListPaging(	@RequestParam(defaultValue="1")int page,
											@RequestParam(defaultValue="desc") String auth,
											@RequestParam(defaultValue="false") String check){
		if(check.equals("true")){
			if(auth.equals("asc")){
				auth="desc";
			}else{
				auth="asc";
			}
		}
		Map map = service.selectAllSellerPaging(page,auth);

		map.put("auth", auth);
		
		return new ModelAndView("seller/memberList.form", map);
	}




}
