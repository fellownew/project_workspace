package kr.co.taommall.account.dao;

import java.util.List;

import kr.co.taommall.account.vo.Seller;

public interface SellerDAO {

	public int insertSeller(Seller seller);
	public List<Seller> selectSellerAllMember();
	public int deleteSellerById(String id);
	public int updateSellerById(Seller seller);
	public Seller selectSellerById(String id);
}
