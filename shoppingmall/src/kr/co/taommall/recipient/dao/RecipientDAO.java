package kr.co.taommall.recipient.dao;

import kr.co.taommall.recipient.vo.Recipient;

public interface RecipientDAO {
	public int insertRecipient(Recipient recipient);
	public void updateRecipient(Recipient recipient);
	public int deleteRecipient(Recipient recipient);
}