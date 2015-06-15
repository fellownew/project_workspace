package kr.co.taommall.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.taommall.account.dao.BuyerDAO;
import kr.co.taommall.account.dao.BuyerDAOImpl;
import kr.co.taommall.account.vo.Buyer;

public interface BuyerService {


	
	public int insertBuyer(Buyer buyer);
	public int deleteBuyerById(String id);
	public int updateBuyerById(Buyer buyer);
	public List selectBuyerAllMember();
	public Buyer selectBuyerById(String id);
	public Buyer selectBuyerByemail(Buyer buyer);
	
}
