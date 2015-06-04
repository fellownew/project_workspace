package kr.co.taommall.common.controller;

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
	//상품관리 페이지
	@RequestMapping("/productManager.do")
	public String selectBySellerId(@RequestParam String sellerId,Model model){
			List<Product> list = service.selectProductBySellerIdNoPaging(sellerId,model);
			model.addAttribute("productList", list);
		return "product/product_manager_form.form";
	}
	//상품 등록 처리
	@RequestMapping("/insertProduct.do")
	public String insert(@ModelAttribute Product product,MultipartFile upfile,Model model,HttpSession session){
		service.insertProduct(product,upfile);
		Seller seller = (Seller)session.getAttribute("loginInfo");
		return "productManager.do?sellerId="+seller.getSellerId();
	}
	//상품 수정 폼
	@RequestMapping("/productModifyForm.do")
	public String updateForm(@RequestParam int productId,Model model){
		Product product = service.selectProductByIdNoPaging(productId,model);
		model.addAttribute("product", product);
		return "product/product_modify_form.form";
	}
	
	//상품 수정 처리
	@RequestMapping("/modifyProduct.do")
	public String update(@ModelAttribute Product product ,MultipartFile upfile,Model model,HttpSession session){
		service.updateProduct(product,upfile);
		Product rProduct = service.selectProductByIdNoPaging(product.getProductId(),model);
		model.addAttribute("product",rProduct);
		Seller seller = (Seller)session.getAttribute("loginInfo");
		return "productManager.do?sellerId="+seller.getSellerId();
	}
	//상품 삭제 처리
	@RequestMapping("/deleteProduct.do")
	public String delete(@RequestParam String productId, HttpSession session){
			int pId = Integer.parseInt(productId); 
			service.deleteProduct(pId);
			Seller seller = (Seller)session.getAttribute("loginInfo");
		return "productManager.do?sellerId="+seller.getSellerId();
	}
	
	
}