package kr.co.taommall.common.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.SellerService;
import kr.co.taommall.account.vo.Address;
import kr.co.taommall.account.vo.Buyer;
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
	public String joinSeller(@ModelAttribute Seller seller,@ModelAttribute Address address) {
		seller.setAddress(address);
		int count = service.insertSeller(seller);
		return "redirect:/mainPage.do";
	}
	
	
	@RequestMapping("/sellerLogin.do")
	@ResponseBody
	public String LoginSeller(@RequestParam(required=true, value="sId") String id,@RequestParam(required=true, value="sPassword") String password,HttpSession session) {
		Seller seller = service.selectSellerById(id);
		if(seller !=null && seller.getPassword().equals(password)){
			
			if(!seller.getAuth().equals("true")){
				return "auth";
			}
			session.setAttribute("loginInfo", seller);
			session.setAttribute("user","seller");
			
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("/identifyId.do")
	@ResponseBody
	public String identifyId(@RequestParam(required=true) String id) {
		Seller seller = service.selectSellerById(id);
		if (seller == null) {
			return null;
		}
		return id;
	}

	@RequestMapping("/identifyEmail.do")
	@ResponseBody
	public String identifyEmail(@RequestParam(required=true) String email,HttpSession session) {
		String jsessionid = session.getId();
		System.out.println(jsessionid);
		 SendMail send =new SendMail();
		String number = null;
		try {
			number = send.sendMail(email,jsessionid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return number;
	}
	
	@RequestMapping("/passwordModify.do")
	@ResponseBody
	public String sellerPasswordModify(@RequestParam(required=true) String password,@RequestParam(required=true,value="currPassword") String currPassword, HttpSession session){
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
	public String sellerPhoneModify(@RequestParam(required=true) String phone, HttpSession session){
		Seller buyer = (Seller) session.getAttribute("loginInfo");		
		buyer.setPhone(phone);
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
	public String sellerEmailModify(@RequestParam(required=true) String email, HttpSession session){
		Seller buyer = (Seller) session.getAttribute("loginInfo");		
		buyer.setEmail(email);
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
	public Address buyerAddressModify(@RequestParam(required=true)Address address, HttpSession session){
		Seller seller = (Seller) session.getAttribute("loginInfo");		
		seller.setAddress(address);
		int count = service.updateSeller(seller);
		session.setAttribute("loginInfo", seller);
		session.setAttribute("user","seller");
		if(count == 0){
			return null;
		}
		return address;
	}
	

	@RequestMapping("/auth/memberList.do")
	public ModelAndView memberListPaging(	@RequestParam(defaultValue="1")int page,
											@RequestParam(defaultValue="desc") String auth,
											@RequestParam(defaultValue="false") String check,
											@RequestParam(defaultValue="10") String count,HttpSession session){
		Object obj =  session.getAttribute("loginInfo");
		if(( obj instanceof Buyer ) || ((Seller)obj).getAdmin()=="false"){
			return  new ModelAndView("/WEB-INF/view/layout/error.jsp","errorMessage","잘못된 접근입니다.메인페이지로 이동합니다.");
		}
		
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
		return new ModelAndView("seller/memberList.form", map);
	}	
	
	@RequestMapping("/auth/updateAuth.do")
	@ResponseBody 
	public String updateAuth(	@RequestParam(required=true,value="auth")ArrayList<String> list,
								@RequestParam(required=true,value="unchecked")ArrayList<String> unchecked){
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
		
	}
	
	@RequestMapping("/identifyEmailCheck.do")
	@ResponseBody
	public String identifyEmailCheck(@RequestParam(required=true) String email,@RequestParam(required=true) String id,HttpSession session) {
		String jsessionid = session.getId();
		 SendMail send =new SendMail();
		String number = null;
		Seller seller = service.selectSellerById(id);
		if(seller.getEmail().equals(email)){
			
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
		Seller seller = new Seller();
		seller.setName(name);
		seller.setEmail(email);
		seller = service.selectSellerByemail(seller);
		if(seller ==null){
			request.setAttribute("errorMessage", "아이디가 없습니다.");
			return "/error/error_check.jsp";
		}
		request.setAttribute("success", "id : "+seller.getSellerId());
		return "/error/complete.jsp";
	}
	
	@RequestMapping("/passwordCheck.do")
	public String PasswordCheck(HttpServletRequest request , @RequestParam(value="newPassword",required=true) String newPassword ,@RequestParam(required=true,value="id") String id) {
		Seller seller = new Seller();
		seller.setPassword(newPassword);
		seller.setSellerId(id);
		int count = service.updateSellerById(seller);
		if(count ==0){
			request.setAttribute("errorMessage", "비밀번호 변경 실패");
			return "/error/error_check.jsp";
		}
		request.setAttribute("success", "변경완료");
		return "/error/complete.jsp";
	}
	
}
