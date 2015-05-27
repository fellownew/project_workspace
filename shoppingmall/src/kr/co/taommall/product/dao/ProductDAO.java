package kr.co.taommall.product.dao;

import java.util.List;

import kr.co.taommall.product.vo.Product;

public interface ProductDAO {
	public int insertProduct(Product product);
	public int updateProduct(Product product);
	public int deleteProduct(String productId);
	public List<Product> selectAllProduct();
	public List<Product> selectProductById(String productId);
	public List<Product> selectProductByName(String productName);
	public List<Product> selectProductByCategory(String productCategory);
	public List<Product> selectProductByexpDate(String expDate);
	public List<Product> selectProductBySellerId(String sellerId);
	public List<Product> selectProductByPrice(int price);
	
}