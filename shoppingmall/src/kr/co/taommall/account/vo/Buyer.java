package kr.co.taommall.account.vo;

import java.io.Serializable;

public class Buyer implements Serializable {

	private String buyerId;
	private String password;
	private String name;
	private String address;
	private String email;
	private String phone;

	public Buyer() {
		super();
	}

	public Buyer(String buyerId, String password, String name, String address,
			String email, String phone) {
		super();
		this.buyerId = buyerId;
		this.password = password;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", password=" + password
				+ ", name=" + name + ", address=" + address + ", email="
				+ email + ", phone=" + phone + "]";
	}

}
