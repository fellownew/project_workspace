package kr.co.taommall.product.dao;

import kr.co.taommall.product.vo.Product;

public interface ProductDAO {
	public int insertProduct(Product product);
	public int updateProduct(Product product);
}