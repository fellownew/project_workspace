package kr.co.taommall.recipient.service;

import kr.co.taommall.recipient.dao.RecipientDAO;
import kr.co.taommall.recipient.vo.Recipient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientServiceImpl implements RecipientService{
	
	@Autowired
	private RecipientDAO dao;

	@Override
	public int insertRecipient(Recipient recipient) {
		return dao.insertRecipient(recipient);
	}

	@Override
	public int updateRecipient(Recipient recipient) {
		return dao.updateRecipient(recipient);
	}

	@Override
	public int deleteRecipient(Recipient recipient) {
		return dao.deleteRecipient(recipient);
	}
	
	
	
}
