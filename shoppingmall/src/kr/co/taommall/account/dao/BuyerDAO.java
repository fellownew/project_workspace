package kr.co.taommall.account.dao;

import java.util.List;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;

public interface BuyerDAO {
	
	public int insertBuyer(Buyer buyer);
	public List<Seller> selectBuyerAllMember();
	public int deleteBuyerById(String id);
	public int updateBuyerById(Buyer buyer);
	public Buyer selectBuyerById(String id);

}
