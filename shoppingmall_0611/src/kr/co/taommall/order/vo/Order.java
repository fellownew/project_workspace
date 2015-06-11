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
	private String regiDate;
	private Buyer buyer;
	private Product product;
	private Seller seller;
	private Recipient recipient;

	public Order() {
	}

	public Order(int orderId, int productId, int amount, String status,
			String buyerId, String sellerId, int recipientId, String regiDate) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.recipientId = recipientId;
		this.regiDate = regiDate;
	}

	public Order(int orderId, int productId, int amount, String status,
			String buyerId, String sellerId, int recipientId, String regiDate,
			Buyer buyer, Product product, Seller seller, Recipient recipient) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.recipientId = recipientId;
		this.regiDate = regiDate;
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

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
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
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId
				+ ", amount=" + amount + ", status=" + status + ", buyerId="
				+ buyerId + ", sellerId=" + sellerId + ", recipientId="
				+ recipientId + ", regiDate=" + regiDate + ", buyer=" + buyer
				+ ", product=" + product + ", seller=" + seller
				+ ", recipient=" + recipient + "]";
	}

}