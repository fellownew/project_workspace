package kr.co.taommall.product.dao;

import java.util.List;

import kr.co.taommall.product.vo.Product;

import org.springframework.ui.Model;

public interface ProductDAO {
	public int insertProduct(Product product);
	public int updateProduct(Product product);
	public int updateProductIgnoreImagePath(Product product);
	public int deleteProduct(int productId);
	public List<Product> selectAllProduct(Model model);
	public List<Product> selectProductById( Model model);
	public List<Product> selectProductLikeName(Model model);
	public List<Product> selectProductByCategory(Model model);
	public List<Product> selectProductByexpDate(Model model);
	public List<Product> selectProductBySellerId(Model model);
	public List<Product> selectProductBetweenPrice(Model model);
	public List<Product> selectProductMinPrice(Model model);
	public List<Product> selectProductMaxPrice(Model model);
	public int selectProductCount();
	public Product selectProductByIdNoPaging(int productId);
	public List<Product> selectProductBySellerIdNoPaging(String sellerId);
}
