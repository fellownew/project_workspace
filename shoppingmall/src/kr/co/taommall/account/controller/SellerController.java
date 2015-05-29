package kr.co.taommall.account.controller;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.service.SellerService;
import kr.co.taommall.account.service.SellerServiceImpl;
import kr.co.taommall.account.vo.Seller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/seller/")
public class SellerController {
	
	SellerService service = new SellerServiceImpl();

	@RequestMapping("/sellerLogin.do")
	@ResponseBody
	public String LoginBuyer(@RequestParam("sId") String id,@RequestParam("sPassword") String password,HttpSession session) {
		Seller seller = service.selectSellerById(id);
		System.out.println(seller);
		if(seller !=null && seller.getPassword().equals(password)){
			session.setAttribute("loginInfo", seller);
			return "success";
		}else{
			return "fail";
		}
	}

}
