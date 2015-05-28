package kr.co.taommall.product.vo;

import java.io.Serializable;

public class Product implements Serializable{
	private String productId;
	private String productName;
	private int productPrice;
	private String category;
	private String productInfo;
	private String imagePath;
	private String regiDate;
	private String expDate;
	private String SellerId;
	
	public Product(){}

	public Product(String productId, String productName, int productPrice,
			String category, String productInfo, String imagePath,
			String regiDate, String expDate, String sellerId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
		this.productInfo = productInfo;
		this.imagePath = imagePath;
		this.regiDate = regiDate;
		this.expDate = expDate;
		SellerId = sellerId;
	}

	public Product(String productId, String productName, int productPrice,
			String category, String productInfo, String regiDate,
			String expDate, String sellerId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
		this.productInfo = productInfo;
		this.regiDate = regiDate;
		this.expDate = expDate;
		SellerId = sellerId;
	}

	public Product(String productId, String productName, int productPrice,
			String category, String productInfo, String expDate, String sellerId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
		this.productInfo = productInfo;
		this.expDate = expDate;
		SellerId = sellerId;
	}



	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getSellerId() {
		return SellerId;
	}

	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SellerId == null) ? 0 : SellerId.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result
				+ ((imagePath == null) ? 0 : imagePath.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productInfo == null) ? 0 : productInfo.hashCode());
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		result = prime * result
				+ ((regiDate == null) ? 0 : regiDate.hashCode());
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
		Product other = (Product) obj;
		if (SellerId == null) {
			if (other.SellerId != null)
				return false;
		} else if (!SellerId.equals(other.SellerId))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productInfo == null) {
			if (other.productInfo != null)
				return false;
		} else if (!productInfo.equals(other.productInfo))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		if (regiDate == null) {
			if (other.regiDate != null)
				return false;
		} else if (!regiDate.equals(other.regiDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice
				+ ", category=" + category + ", productInfo=" + productInfo
				+ ", imagePath=" + imagePath + ", regiDate=" + regiDate
				+ ", expDate=" + expDate + ", SellerId=" + SellerId + "]";
	}


}
