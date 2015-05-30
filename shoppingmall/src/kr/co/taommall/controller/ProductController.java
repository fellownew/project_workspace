package kr.co.taommall.controller;

import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/auth/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/insert.do")
	public String insert(@ModelAttribute Product product,MultipartFile upfile){
		service.insertProduct(product,upfile);
		return "/product_info.form";
	}
	
	@RequestMapping("/update.do")
	public String update(@ModelAttribute Product product ,MultipartFile upfile){
		
		service.updateProduct(product,upfile);
		
		return "/product_info.form";
	}
	
	@RequestMapping("/select.do")
	public String select(){
		
		return "/product_list";
	}
	
}
