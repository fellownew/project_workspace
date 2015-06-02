package kr.co.taommall.product.dao;

import java.util.List;

import kr.co.taommall.common.PagingBean;
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
	public List<Product> selectAllProduct(int pageNo,Model model){
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return  session.selectList(nameSpace+"selectAllProduct",model);
		
	}

	@Override
	public List<Product> selectProductById(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductById",model);
	}

	@Override
	public List<Product> selectProductLikeName(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductlIKEName",model);
	}

	@Override
	public List<Product> selectProductByCategory(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductByCategory",model);
	}

	@Override
	public List<Product> selectProductByexpDate(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductByexpDate",model);
	}

	@Override
	public List<Product> selectProductBySellerId(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		List<Product> list = session.selectList(nameSpace+"selectProductBySellerId",model);
		return list;
	}

	@Override
	public List<Product> selectProductBetweenPrice(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductBetweenPrice",model);
	}

	@Override
	public List<Product> selectProductMinPrice(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductMinPrice",model);
	}

	@Override
	public List<Product> selectProductMaxPrice(int pageNo, Model model) {
		int contentsPerPage =PagingBean.CONTENTS_PER_PAGE;
		model.addAttribute("contentsPerPage", contentsPerPage);
		model.addAttribute("pageNo", pageNo);
		return session.selectList(nameSpace+"selectProductMaxPrice",model);
	}
	@Override
	public int selectProductCount(){
		return session.selectOne(nameSpace+"selectProductCount");
	}
	@Override
	public Product selectProductByIdNoPaging(int productId){
		return session.selectOne(nameSpace+"selectProductByIdNoPaging",productId);
	}
	@Override
	public List<Product> selectProductBySellerIdNoPaging(String sellerId){
		return session.selectList(nameSpace+"selectProductByIdNoPaging",sellerId);		
	}
}
