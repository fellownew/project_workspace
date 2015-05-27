package kr.co.taommall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	
	@RequestMapping("/mainpage.do")
	public String mainPage(){
		return "main.do";
	}
	@RequestMapping("/join_form.do")	
	public String join_form(){
		return "member/join_form.do";
	}
	@RequestMapping("/register_form.do")	
	public String register_form(){
		return "product/register_form.do";
	}
	@RequestMapping("/no_tiles.do")	
	public String no_tiles(){
		return "/WEB-INF/view/no_tiles.jsp";
	}
	
}
