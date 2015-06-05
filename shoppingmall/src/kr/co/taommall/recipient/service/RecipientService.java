package kr.co.taommall.recipient.service;

import kr.co.taommall.recipient.vo.Recipient;

public interface RecipientService {
	public int insertRecipient(Recipient recipient);
	public void updateRecipient(Recipient recipient);
	public int deleteRecipient(Recipient recipient);
	
}
