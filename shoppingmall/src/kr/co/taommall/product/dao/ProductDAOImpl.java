package kr.co.taommall.product.dao;

import java.util.List;

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

	@Override
	public int deleteProduct(String productId) {
		int cnt = session.delete(nameSpace+"deleteProduct",productId);
		return cnt;
	}

	@Override
	public List<Product> selectAllProduct() {
		return session.selectList(nameSpace+"selectAllProduct");
	}

	@Override
	public List<Product> selectProductById(String productId) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductById",productId);
	}

	@Override
	public List<Product> selectProductLikeName(String productName) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductByName",productName);
	}

	@Override
	public List<Product> selectProductByCategory(String productCategory) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductByCategory",productCategory);
	}

	@Override
	public List<Product> selectProductByexpDate(String expDate) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductByexpDate",expDate);
	}

	@Override
	public List<Product> selectProductBySellerId(String sellerId) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductBySellerId",sellerId);
	}

	@Override
	public List<Product> selectProductBetweenPrice(int lPrice,int Hprice) {
		// TODO Auto-generated method stub 반환값 설정
		return session.selectList(nameSpace+"selectProductBetweenPrice");
	}

	@Override
	public List<Product> selectProductMinPrice(int price) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductMinPrice",price);
	}

	@Override
	public List<Product> selectProductMaxPrice(int price) {
		// TODO Auto-generated method stub
		return session.selectList(nameSpace+"selectProductMaxPrice",price);
	}
}
