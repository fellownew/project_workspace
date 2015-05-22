package kr.co.taommall.controller;

import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute Product product){
		service.insertProduct(product);
		return "";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Product product ){
		service.updateProduct(product);
		return "";
	}
	
}
