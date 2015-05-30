package kr.co.taommall.product.service;

import java.util.List;

import kr.co.taommall.product.vo.Product;

import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
	public void insertProduct(Product product,MultipartFile upfile);
	public void updateProduct(Product product,MultipartFile upfile);//imagePath가 없을 경우  updateProductIgnoreImagePath를 불러온다.
	public int deleteProduct(String productId);
	public List<Product> selectAllProduct();
	public List<Product> selectProductById(int productId);
	public List<Product> selectProductLikeName(String productName);
	public List<Product> selectProductByCategory(String productCategory);
	public List<Product> selectProductByexpDate(String expDate);
	public List<Product> selectProductBySellerId(String sellerId);
	public List<Product> selectProductByPrice(int lPrice,int Hprice);
}