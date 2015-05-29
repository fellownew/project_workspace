package kr.co.taommall.account.dao;

import java.util.List;

import kr.co.taommall.account.vo.Seller;

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

	public Seller selectSellerById(String id) {

		return session.selectOne(namespace + "selectSellerById", id);

	}

	public int deleteSellerById(String id) {

		return session.delete(namespace + "deleteSellerById", id);

	}

	public int updateSellerById(Seller seller) {

		return session.update(namespace + "updateSellerById", seller);

	}

}
