package kr.co.taommall.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import kr.co.taommall.account.dao.SellerDAO;
import kr.co.taommall.account.dao.SellerDAOImpl;
import kr.co.taommall.account.vo.Seller;

public interface SellerService {
	
	public int insertSeller(Seller seller);
	public int deleteSellerById(String id);
	public int updateSellerById(Seller seller);
	public List selectSellerAllMember();
	public Seller selectSellerById(String id);
	
}
