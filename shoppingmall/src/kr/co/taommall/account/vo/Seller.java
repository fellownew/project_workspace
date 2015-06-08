package kr.co.taommall.account.vo;

import java.io.Serializable;

public class Seller implements Serializable {

	private String sellerId;
	private String password;
	private String name;
	private String gender;
	private Address address;
	private String email;
	private String phone;
	private String auth = "false";
	private String admin = "false";
	private String corporateNumber;

	public Seller() {
		super();
	}

	public Seller(String sellerId, String password, String name, String gender,
			Address address, String email, String phone, String corporateNumber) {
		super();
		this.sellerId = sellerId;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.corporateNumber = corporateNumber;
	}

	public Seller(String sellerId, String password, String name, String gender,
			Address address, String email, String phone, String auth,
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((auth == null) ? 0 : auth.hashCode());
		result = prime * result
				+ ((corporateNumber == null) ? 0 : corporateNumber.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((sellerId == null) ? 0 : sellerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (auth == null) {
			if (other.auth != null)
				return false;
		} else if (!auth.equals(other.auth))
			return false;
		if (corporateNumber == null) {
			if (other.corporateNumber != null)
				return false;
		} else if (!corporateNumber.equals(other.corporateNumber))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		return true;
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
