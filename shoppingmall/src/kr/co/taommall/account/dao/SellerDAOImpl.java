package kr.co.taommall.account.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.common.PagingBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sellerDAO")
public class SellerDAOImpl implements SellerDAO {

	private static SellerDAOImpl instance = new SellerDAOImpl();
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String namespace = "account.dao.seller.";

	private SellerDAOImpl() {

	}

	public static SellerDAOImpl getInstance() {
		return instance;
	}

	public int insertSeller(Seller seller) {

		return session.insert(namespace + "insertSeller", seller);

	}

	public List<Seller> selectSellerAllMember() {

		return session.selectList(namespace + "selectSellerAllMember");

	}

	public List<Seller> selectSellerOrderByAuth(String auth){
		System.out.println(auth);
		Map map = new HashMap();
		map.put("auth", auth);
		return session.selectList(namespace + "selectSellerOrderByAuth",map);
	}
	
	public Seller selectSellerById(String id) {
		return session.selectOne(namespace + "selectSellerById", id);
	}

	public int deleteSellerById(String id) {

		return session.delete(namespace + "deleteSellerById", id);

	}

	public int updateSeller(Seller seller) {

		return session.update(namespace + "updateSeller", seller);

	}

	public int selectSellerCount(){
		return session.selectOne(namespace+"selectSellerCount");
	}
	
	public List<Seller> selectAllSellerPaging(int pageNo,String auth){
		
		Map map = new HashMap();
		map.put("contentsPerPage", PagingBean.CONTENTS_PER_PAGE);
		map.put("pageNo", pageNo);
		map.put("auth", auth);
		return  session.selectList(namespace+"selectAllSellerPaging",map);
		
	}

	@Override
	public int updateSellerById(Seller seller) {
		return session.update(namespace + "updateSellerById", seller);
	}

	@Override
	public Seller selectSellerByemail(Seller seller) {
		return session.selectOne(namespace+"selectSellerByemail",seller);
	}
	
	
}
