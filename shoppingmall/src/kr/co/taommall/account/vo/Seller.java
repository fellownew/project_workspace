package kr.co.taommall.account.vo;

import java.io.Serializable;

public class Seller implements Serializable {

	private String sellerId;
	private String password;
	private String name;
	private String gender;
	private String address;
	private String email;
	private String phone;
	private String auth;
	private String admin;
	private String corporateNumber;

	public Seller() {
		super();
	}

	public Seller(String sellerId, String password, String name, String gender,
			String address, String email, String phone, String corporateNumber) {
		super();
		this.sellerId = sellerId;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.corporateNumber = corporateNumber;
		auth = "false";
		admin = "false";
	}

	public Seller(String sellerId, String password, String name, String gender,
			String address, String email, String phone, String auth,
			String admin, String corporateNumber) {
		super();
		this.sellerId = sellerId;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.auth = auth;
		this.admin = admin;
		this.corporateNumber = corporateNumber;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getCorporateNumber() {
		return corporateNumber;
	}

	public void setCorporateNumber(String corporateNumber) {
		this.corporateNumber = corporateNumber;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", password=" + password
				+ ", name=" + name + ", gender=" + gender + ", address="
				+ address + ", email=" + email + ", phone=" + phone + ", auth="
				+ auth + ", admin=" + admin + ", corporateNumber="
				+ corporateNumber + "]";
	}

}
