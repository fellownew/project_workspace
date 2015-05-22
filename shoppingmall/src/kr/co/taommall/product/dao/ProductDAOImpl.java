package kr.co.taommall.product.dao;

import kr.co.taommall.product.vo.Product;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	private String nameSpace = "kr.co.taommall.product.dao";

	public int insertProduct(Product product){
		int cnt = session.insert(nameSpace+"insertProduct",product);
		return cnt;
	}
	
	public int updateProduct(Product product){
			int cnt = session.update(nameSpace+"updateProduct",product);
			return cnt;
	}
	
}
