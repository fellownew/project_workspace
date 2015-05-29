package kr.co.taommall.account.dao;

import java.util.List;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("buyerDAO")
public class BuyerDAOImpl implements BuyerDAO{

	private static BuyerDAOImpl instance = new BuyerDAOImpl();
	private String namespace = "account.dao.buyer.";
	
	@Autowired
	private SqlSessionTemplate session;

	private BuyerDAOImpl() {
	}
	

	public static BuyerDAOImpl getInstance() {
		return instance;
	}

	public int insertBuyer(Buyer buyer) {

			return session.insert(namespace + "insertBuyer", buyer);

	}

	public List<Seller> selectBuyerAllMember() {
			return session.selectList(namespace + "selectBuyerAllMember");

	}

	public int deleteBuyerById(String id) {
			return session.delete(namespace + "deleteBuyerById", id);

	}

	public int updateBuyerById(Buyer buyer) {
			return session.update(namespace + "updateBuyerById", buyer);

	}

	@Override
	public Buyer selectBuyerById(String id) {

			return session.selectOne(namespace+"selectBuyerById",id);			

	}

}
