package kr.co.taommall.account.service;

import java.util.HashMap;
import java.util.List;

import kr.co.taommall.account.vo.Seller;

public interface SellerService {

	public int insertSeller(Seller seller);

	public int deleteSellerById(String id);

	public int updateSeller(Seller seller);

	public List<Seller> selectSellerAllMember();
	
	public List<Seller> selectSellerOrderByAuth(String auth);

	public Seller selectSellerById(String id);
	
	public int selectSellerCount();
	public HashMap selectAllSellerPaging(int pageNo,String auth,int count);

}
