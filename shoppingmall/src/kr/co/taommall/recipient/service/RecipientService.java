package kr.co.taommall.recipient.service;

import kr.co.taommall.recipient.vo.Recipient;

public interface RecipientService {
	public int insertRecipient(Recipient recipient);
	public int updateRecipient(Recipient recipient);
	public int deleteRecipient(Recipient recipient);
	public Recipient selectRecipientById(int recipientId);
	
}
