package kr.co.taommall.account.vo;

import java.io.Serializable;

public class Address implements Serializable {

	private String postcode;
	private String addressDetails;

	public Address() {
		super();
	}

	public Address(String postcode, String addressDetails) {
		this.postcode = postcode;
		this.addressDetails = addressDetails;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public String toString() {
		return "Address [postcode=" + postcode + ", addressDetails="
				+ addressDetails + "]";
	}

}
