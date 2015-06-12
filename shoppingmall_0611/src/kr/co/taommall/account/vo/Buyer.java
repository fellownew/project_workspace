package kr.co.taommall.account.vo;

import java.io.Serializable;

public class Buyer implements Serializable {

	private String buyerId;
	private String password;
	private String name;
	private String email;
	private String phone;
	private Address address;

	public Buyer() {
		super();
	}

	public Buyer(String buyerId, String password, String name, String email,
			String phone, Address address) {
		super();
		this.buyerId = buyerId;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", password=" + password
				+ ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}
