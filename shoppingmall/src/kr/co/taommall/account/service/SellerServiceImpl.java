package kr.co.taommall.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.taommall.account.dao.SellerDAO;
import kr.co.taommall.account.vo.Seller;

@Service("sellerService")
public class SellerServiceImpl implements SellerService {

	@Autowired
	@Qualifier("sellerDAO")
	SellerDAO dao;
	
	public int insertSeller(Seller seller) {

		return dao.insertSeller(seller);
	}

	public int deleteSellerById(String id) {
		return dao.deleteSellerById(id);
	}

	public int updateSellerById(Seller seller) {

		return dao.updateSellerById(seller);
	}

	public List selectSellerAllMember() {
		return dao.selectSellerAllMember();
	}
	
	public Seller selectSellerById(String id){
		return dao.selectSellerById(id);
	}
}
