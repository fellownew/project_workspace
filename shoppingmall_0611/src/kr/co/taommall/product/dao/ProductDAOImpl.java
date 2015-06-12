package kr.co.taommall.product.dao;

import java.util.List;

import kr.co.taommall.product.vo.Product;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	private String nameSpace = "kr.co.taommall.product.dao.";
	
	@Override
	public int insertProduct(Product product){
		int cnt = session.insert(nameSpace+"insertProduct",product);
		return cnt;
	}
	@Override
	public int updateProduct(Product product){
			int cnt = session.update(nameSpace+"updateProduct",product);
			return cnt;
	}
	
	
	@Override
	public int updateProductWithThum(Product product) {
		int cnt = session.update(nameSpace+"updateProductWithThum",product);
		return cnt;
	}
	@Override
	public int updateProductWithInfo(Product product) {
		int cnt = session.update(nameSpace+"updateProductWithInfo",product);
		return cnt;
	}
	@Override
	public int updateProductIgnoreImagePath(Product product){
		int cnt = session.update(nameSpace+"updateProductIgnoreImagePath",product);
		return cnt;
	}
	
	@Override
	public int deleteProduct(int productId) {
		int cnt = session.delete(nameSpace+"deleteProduct",productId);
		return cnt;
	}
	//Select
	
	@Override
	public List<Product> selectAllProduct(Model model){
		return  session.selectList(nameSpace+"selectAllProduct",model);
		
	}

	@Override
	public List<Product> selectProductById(Model model) {
		return session.selectList(nameSpace+"selectProductById",model);
	}

	@Override
	public List<Product> selectProductLikeName(Model model) {
		return session.selectList(nameSpace+"selectProductlIKEName",model);
	}

	@Override
	public List<Product> selectProductByCategory(Model model) {
		return session.selectList(nameSpace+"selectProductByCategory",model);
	}

	@Override
	public List<Product> selectProductByexpDate(Model model) {
		return session.selectList(nameSpace+"selectProductByexpDate",model);
	}

	@Override
	public List<Product> selectProductBySellerId(Model model) {
		List<Product> list = session.selectList(nameSpace+"selectProductBySellerId",model);
		return list;
	}

	@Override
	public List<Product> selectProductBetweenPrice(Model model) {
		return session.selectList(nameSpace+"selectProductBetweenPrice",model);
	}

	@Override
	public List<Product> selectProductMinPrice(Model model) {
		return session.selectList(nameSpace+"selectProductMinPrice",model);
	}

	@Override
	public List<Product> selectProductMaxPrice(Model model) {
		return session.selectList(nameSpace+"selectProductMaxPrice",model);
	}
	@Override
	public Product selectProductByIdNoPaging(int productId){
		return session.selectOne(nameSpace+"selectProductByIdNoPaging",productId);
	}
	@Override
	public List<Product> selectProductBySellerIdNoPaging(String sellerId){
		return session.selectList(nameSpace+"selectProductBySellerIdNoPaging",sellerId);		
	}
	
	@Override
	public List<Product> selectProductToRandom(int num){
		return session.selectList(nameSpace+"selectProductToRandom",num);
	}
	@Override
	public int selectProductCount(){
		return session.selectOne(nameSpace+"selectProductCount");
	}
	
	@Override
	public int selectProductCountByCategory(String category){
		return session.selectOne(nameSpace+"selectProductCountByCategory",category);
	}
}