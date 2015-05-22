package kr.co.taommall.product.service;

import kr.co.taommall.product.dao.ProductDAO;
import kr.co.taommall.product.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;
	
	public void insertProduct(Product product){
		dao.insertProduct(product);
	}
	
	public void updateProduct(Product product){
		dao.updateProduct(product);
	}
}
