package kr.co.taommall.product.dao;

import java.util.List;

import kr.co.taommall.product.vo.Product;

import org.springframework.ui.Model;

public interface ProductDAO {
	public int insertProduct(Product product);
	public int updateProduct(Product product);
	public int updateProductIgnoreImagePath(Product product);
	public int deleteProduct(int productId);
	public List<Product> selectAllProduct(int pageNo,Model model);
	public List<Product> selectProductById(int pageNo, Model model);
	public List<Product> selectProductLikeName(int pageNo, Model model);
	public List<Product> selectProductByCategory(int pageNo, Model model);
	public List<Product> selectProductByexpDate(int pageNo, Model model);
	public List<Product> selectProductBySellerId(int pageNo, Model model);
	public List<Product> selectProductBetweenPrice(int pageNo, Model model);
	public List<Product> selectProductMinPrice(int pageNo, Model model);
	public List<Product> selectProductMaxPrice(int pageNo, Model model);
	public int selectProductCount();
	public Product selectProductByIdNoPaging(int productId);
	public List<Product> selectProductBySellerIdNoPaging(String sellerId);
}
