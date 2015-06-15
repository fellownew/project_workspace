package kr.co.taommall.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.taommall.account.dao.BuyerDAO;
import kr.co.taommall.account.vo.Buyer;

@Service("buyerService")
public class BuyerServiceImpl implements BuyerService {

	@Autowired
	@Qualifier("buyerDAO")
	BuyerDAO dao ;
	
	public int insertBuyer(Buyer buyer) {
		return dao.insertBuyer(buyer);
	}

	public int deleteBuyerById(String id) {
		return dao.deleteBuyerById(id);
	}

	public int updateBuyerById(Buyer buyer) {
		return dao.updateBuyerById(buyer);
	}

	public List selectBuyerAllMember() {
		return dao.selectBuyerAllMember();
	}
	
	public Buyer selectBuyerById(String id){
		return dao.selectBuyerById(id);
	}

	@Override
	public Buyer selectBuyerByemail(Buyer buyer) {
		return dao.selectBuyerByemail(buyer);
	}

}
