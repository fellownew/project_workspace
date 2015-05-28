package kr.co.taommall.product.service;

import java.util.List;

import kr.co.taommall.product.vo.Product;

public interface ProductService {
	public void insertProduct(Product product);
	public void updateProduct(Product product);//imagePath가 없을 경우  updateProductIgnoreImagePath를 불러온다.
	public int deleteProduct(String productId);
	public List<Product> selectAllProduct();
	public List<Product> selectProductById(String productId);
	public List<Product> selectProductLikeName(String productName);
	public List<Product> selectProductByCategory(String productCategory);
	public List<Product> selectProductByexpDate(String expDate);
	public List<Product> selectProductBySellerId(String sellerId);
	public List<Product> selectProductByPrice(int lPrice,int Hprice);
}