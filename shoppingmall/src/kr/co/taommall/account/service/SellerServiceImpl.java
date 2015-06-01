package kr.co.taommall.account.service;

import java.util.HashMap;
import java.util.List;

import kr.co.taommall.account.dao.SellerDAO;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.common.PagingBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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

	public Seller selectSellerById(String id) {
		return dao.selectSellerById(id);
	}

	public List<Seller> selectSellerOrderByAuth(String auth) {
		return dao.selectSellerOrderByAuth(auth);
	}

	public int selectSellerCount() {
		return dao.selectSellerCount();
	}

	public HashMap selectAllSellerPaging(int pageNo,String auth) {
		System.out.println(pageNo);
		// 목록에 뿌려줄 List<Member> 조회
		List<Seller> list = dao.selectAllSellerPaging(pageNo,auth);
		// PagingBean 생성
		int totalContent = dao.selectSellerCount();
		PagingBean pagingBean = new PagingBean(totalContent, pageNo);
		// 두개의 값(List, PagingBean)을 Map에 넣어 return
		HashMap map = new HashMap();
		map.put("member_list", list);
		map.put("pagingBean", pagingBean);
		return map;
	}


}
