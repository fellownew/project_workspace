package kr.co.taommall.recipient.vo;

import java.io.Serializable;

import kr.co.taommall.account.vo.Address;

public class Recipient implements Serializable {
	private int recipientId;
	private String name;
	private String phone;
	private String detail;
	private Address address;

	public Recipient() {
		super();
	}

	public Recipient(int recipientId, String name,
			String phone, String detail, Address address) {
		super();
		this.recipientId = recipientId;
		this.name = name;
		this.phone = phone;
		this.detail = detail;
		this.address = address;
	}

	public int getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Recipient [recipientId=" + recipientId + ", name=" + name
				+ ", phone=" + phone + ", detail="
				+ detail + ", address=" + address + "]";
	}

}
