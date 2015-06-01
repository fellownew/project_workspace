package kr.co.taommall.product.controller;

import java.util.List;

import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/auth/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/insert.do")
	public String insert(@ModelAttribute Product product,MultipartFile upfile,Model model){
		service.insertProduct(product,upfile);
		List<Product> rProduct = service.selectProductById(product.getProductId());
		model.addAttribute("product",rProduct.get(0));
		return "/product_info.form";
	}
	
	@RequestMapping("/update.do")
	public String update(@ModelAttribute Product product ,MultipartFile upfile,Model model){
		
		service.updateProduct(product,upfile);
		List<Product> rProduct = service.selectProductById(product.getProductId());
		model.addAttribute("product",rProduct.get(0));
		return "/product_info.form";
	}
	
	@RequestMapping("/select.do")
	public String select(@RequestParam String search, @ModelAttribute Product product,Model model){
		
		
		return "/product_list";
	}
	
}
