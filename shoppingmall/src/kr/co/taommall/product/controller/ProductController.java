package kr.co.taommall.product.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import kr.co.taommall.account.vo.Seller;
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
@RequestMapping("/auth")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/productManager.do")
	public String selectBySellerId(@RequestParam String sellerId,Model model){
			List<Product> list = service.selectProductBySellerId(sellerId);
			model.addAttribute("productList", list);
		return "product/product_manager_form.form";
	}
	
	@RequestMapping("/insertProduct.do")
	public String insert(@ModelAttribute Product product,MultipartFile upfile,Model model){
		service.insertProduct(product,upfile);
		return "product/product_manager_form.form";
	}
	
	@RequestMapping("/productModifyForm.do")
	public String updateForm(@RequestParam int productId,Model model){
		List<Product> list = service.selectProductById(productId);
		Product product = list.get(0);
		model.addAttribute("product", product);
		return "product/product_modify_form.form";
	}
	
	
	@RequestMapping("/modifyProduct.do")
	public String update(@ModelAttribute Product product ,MultipartFile upfile,Model model,HttpSession session){
		service.updateProduct(product,upfile);
		List<Product> rProduct = service.selectProductById(product.getProductId());
		model.addAttribute("product",rProduct.get(0));
		Seller seller = (Seller)session.getAttribute("loginInfo");
		System.out.println("asdf : "+seller);
		return "productManager.do?sellerId="+seller.getSellerId();
	}
	
	@RequestMapping("/deleteProduct.do")
	public String delete(@RequestParam String productId, HttpSession session){
			int pId = Integer.parseInt(productId); 
			service.deleteProduct(pId);
			Seller seller = (Seller)session.getAttribute("loginInfo");
		return "productManager.do?sellerId="+seller.getSellerId();
	}
	
	@RequestMapping("/select.do")
	public String selectList(@RequestParam String search, @ModelAttribute Product product,Model model){
		
		
		return "/product_list";
	}
	

	
}
