package kr.co.taommall.common.controller;

import java.util.List;

import kr.co.taommall.product.service.ProductService;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class CommonController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/list.do")
	public String selectList(@RequestParam(defaultValue="1")int page,@RequestParam String search, @ModelAttribute Product product,Model model){
		List<Product> list = null;
		if(search.equals("allList")){
			list = service.selectAllProduct(page, model);
		}else if(search.equals("food")){
			list = service.selectProductByCategory(search, page, model);
		}else if(search.equals("health")){
			list = service.selectProductByCategory(search, page, model);
		}else if(search.equals("snack")){
			list = service.selectProductByCategory(search, page, model);
		}else if(search.equals("fruit")){
			list = service.selectProductByCategory(search, page, model);
		}else{
			list = service.selectProductLikeName(search, page, model);
		}
		
		model.addAttribute("productList",list);
		return "product/product_list.form";
	}
	
	@RequestMapping("/productInfo.do")
	public String selectProductById(@RequestParam String productId,Model model){
		int pId = Integer.parseInt(productId);
		Product product = service.selectProductByIdNoPaging(pId,model);
		model.addAttribute("product", product);
		return "product/product_info.form";
	}
	
}
