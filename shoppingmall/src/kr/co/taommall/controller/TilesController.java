package kr.co.taommall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	
	@RequestMapping("/join_form.do")	
	public String join_form(){
		return "member/join_form.do";
	}
	@RequestMapping("/register_form.do")	
	public String register_form(){
		return "product/register_form.tiles";
	}
	
	@RequestMapping("/auth/product/registerProductform.do")
	public String registerProductForm(){
		return "product/product_join_form.form";
	}
	
}