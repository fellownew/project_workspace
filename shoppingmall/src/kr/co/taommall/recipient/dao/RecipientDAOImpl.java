package kr.co.taommall.recipient.dao;

import kr.co.taommall.recipient.vo.Recipient;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecipientDAOImpl implements RecipientDAO{
	
	@Autowired
	private SqlSessionTemplate session;
	private String nameSpace = "kr.co.taommall.recipient.dao.";

	@Override
	public int insertRecipient(Recipient recipient) {
		int cnt = session.insert(nameSpace+"insertRecipient",recipient);
		System.out.println("insert 실행됐습니다!!");
		return cnt;
	}

	@Override
	public void updateRecipient(Recipient recipient) {
		session.update(nameSpace+"upateRecipient",recipient);
	}

	@Override
	public int deleteRecipient(Recipient recipient) {
		int cnt = session.delete(nameSpace+"deleteRecipient",recipient);
		return cnt;
	}
	
	
	
}
