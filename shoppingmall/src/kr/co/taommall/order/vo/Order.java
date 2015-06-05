package kr.co.taommall.order.vo;

import java.io.Serializable;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.product.vo.Product;
import kr.co.taommall.recipient.vo.Recipient;

public class Order implements Serializable {
	private int orderId;
	private int productId;
	private int amount;
	private String status;
	private String buyerId;
	private String sellerId;
	private int recipientId;
	private Buyer buyer;
	private Product product;
	private Seller seller;
	private Recipient recipient;
	
	public Order(){}
	

	public Order(int orderId, int productId, int amount, String status,
			String buyerId, String sellerId, int recipientId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.recipientId = recipientId;
	}

	public Order(int orderId, int productId, int amount, String status,
			String buyerId, String sellerId, int recipientId, Buyer buyer,
			Product product, Seller seller, Recipient recipient) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.recipientId = recipientId;
		this.buyer = buyer;
		this.product = product;
		this.seller = seller;
		this.recipient = recipient;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public int getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((buyerId == null) ? 0 : buyerId.hashCode());
		result = prime * result + orderId;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + productId;
		result = prime * result
				+ ((recipient == null) ? 0 : recipient.hashCode());
		result = prime * result + recipientId;
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		result = prime * result
				+ ((sellerId == null) ? 0 : sellerId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Order other = (Order) obj;
		if (amount != other.amount)
			return false;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (buyerId == null) {
			if (other.buyerId != null)
				return false;
		} else if (!buyerId.equals(other.buyerId))
			return false;
		if (orderId != other.orderId)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productId != other.productId)
			return false;
		if (recipient == null) {
			if (other.recipient != null)
				return false;
		} else if (!recipient.equals(other.recipient))
			return false;
		if (recipientId != other.recipientId)
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId
				+ ", amount=" + amount + ", status=" + status + ", buyerId="
				+ buyerId + ", sellerId=" + sellerId + ", recipientId="
				+ recipientId + ", buyer=" + buyer + ", product=" + product
				+ ", seller=" + seller + ", recipient=" + recipient + "]";
	}
}