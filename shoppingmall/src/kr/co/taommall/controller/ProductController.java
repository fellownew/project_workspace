package kr.co.taommall.controller;

import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/insert.do")
	public String insert(@ModelAttribute Product product){
		System.out.println(product);
		service.insertProduct(product);
		return "/product_info.tiles";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Product product ){
		service.updateProduct(product);
		return "";
	}
	
}
