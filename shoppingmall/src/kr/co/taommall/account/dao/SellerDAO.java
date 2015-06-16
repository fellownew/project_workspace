package kr.co.taommall.account.dao;

import java.util.List;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;

public interface SellerDAO {

	public int insertSeller(Seller seller);
	public List<Seller> selectSellerAllMember();
	public int deleteSellerById(String id);
	public int updateSeller(Seller seller);
	public Seller selectSellerById(String id);
	public List<Seller> selectSellerOrderByAuth(String auth);
	public int selectSellerCount();
	public List<Seller> selectAllSellerPaging(int pageNo,String auth);
	public int updateSellerById(Seller seller);
	public Seller selectSellerByemail(Seller seller);
}
