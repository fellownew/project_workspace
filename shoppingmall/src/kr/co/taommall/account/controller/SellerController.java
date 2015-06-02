package kr.co.taommall.account.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.SellerService;
import kr.co.taommall.account.vo.Seller;
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
	public String joinSeller(@ModelAttribute Seller seller,Error error) {
		int count = service.insertSeller(seller);
		System.out.println(seller);
		System.out.println(count);
		return "main.do";
	}
	
	
	@RequestMapping("/sellerLogin.do")
	@ResponseBody
	public String LoginSeller(@RequestParam("sId") String id,@RequestParam("sPassword") String password,HttpSession session) {
		Seller seller = service.selectSellerById(id);
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
	
	@RequestMapping("/passwordModify.do")
	@ResponseBody
	public String sellerPasswordModify(String password,@RequestParam("currPassword") String currPassword, HttpSession session){
		Seller seller = (Seller) session.getAttribute("loginInfo");
		if(currPassword !=null && seller.getPassword().equals(currPassword)){
			seller.setPassword(password);
			System.out.println(seller);
			int count = service.updateSeller(seller);
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
		int count = service.updateSeller(buyer);
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
		int count = service.updateSeller(buyer);
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
		int count = service.updateSeller(buyer);
		session.setAttribute("loginInfo", buyer);
		session.setAttribute("user","seller");
		if(count == 0){
			return "fail";
		}

		return address;
	}
	

	@RequestMapping("/auth/logout.do")
	   public String logout(HttpSession session){
	      session.invalidate();
	      return "main.do";
	   }


	@RequestMapping("/auth/memberListPaging.do")
	public ModelAndView memberListPaging(	@RequestParam(defaultValue="1")int page,
											@RequestParam(defaultValue="desc") String auth,
											@RequestParam(defaultValue="false") String check,
											@RequestParam(defaultValue="10") String count){
		if(check.equals("true")){
			if(auth.equals("asc")){
				auth="desc";
			}else{
				auth="asc";
			}
		}
		Map map = service.selectAllSellerPaging(page,auth,Integer.parseInt(count));
		map.put("auth", auth);
		map.put("count", count);
		return new ModelAndView("/WEB-INF/view/body/seller/memberList.jsp", map);
	}	
	
	@RequestMapping("/auth/updateAuth.do")
	@ResponseBody 
	public String updateAuth(	@RequestParam(value="auth")ArrayList<String> list,
								@RequestParam(value="unchecked")ArrayList<String> unchecked){
		System.out.println(list.size());
		System.out.println(unchecked.size());
		if(list ==null && unchecked ==null){
			return "fail";
		}
		
		for(String str : list){
			Seller seller = service.selectSellerById(str);
			if(seller !=null ){
				seller.setAuth("true");
				System.out.println(seller);
				int count = service.updateSeller(seller);
				seller = service.selectSellerById(str);
				System.out.println(seller);
			}
		
		}
		
		for(String str : unchecked){
			Seller seller = service.selectSellerById(str);
			if(seller!=null){
				seller.setAuth("false");
				int count = service.updateSeller(seller);
			}
		}
		return "success";
		
		return new ModelAndView("seller/memberList.form", map);

	}

	
}
