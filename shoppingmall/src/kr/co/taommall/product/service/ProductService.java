package kr.co.taommall.product.service;

import java.util.HashMap;
import java.util.List;

import kr.co.taommall.common.PagingBean;
import kr.co.taommall.product.vo.Product;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
	public void insertProduct(Product product,MultipartFile upfile);
	public void updateProduct(Product product,MultipartFile upfile);//imagePath가 없을 경우  updateProductIgnoreImagePath를 불러온다.
	public int deleteProduct(int productId);
	public List<Product> selectAllProduct(int pageNo,Model model);
	public List<Product> selectProductById(int productId,int pageNo,Model model) ;
	public List<Product> selectProductLikeName(String productName,int pageNo,Model model);
	public List<Product> selectProductByCategory(String productCategory,int pageNo,Model model);
	public List<Product> selectProductByexpDate(String expDate,int pageNo,Model model);
	public List<Product> selectProductBySellerId(String sellerId,int pageNo,Model model);
	public List<Product> selectProductByPrice(int lPrice,int Hprice,int pageNo,Model model);
	public Product selectProductByIdNoPaging(int productId,Model model);
	public List<Product> selectProductBySellerIdNoPaging(String sellerId,Model model);
	public List<Product> selectProductToRandom(int num);
	
}