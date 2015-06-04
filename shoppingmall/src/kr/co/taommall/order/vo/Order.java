package kr.co.taommall.order.vo;

import java.io.Serializable;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.account.vo.Seller;
import kr.co.taommall.product.vo.Product;

public class Order implements Serializable {
	private String orderId;
	private int productId;
	private int amount;
	private String status;
	private String buyerId;
	private String sellerId;
	Buyer buyer;
	Product product;
	Seller seller;

	public Order() {
		super();
	}

	public Order(String orderId, int productId, int amount, String status,
			String buyerId, String sellerId, Buyer buyer, Product product,
			Seller seller) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.buyer = buyer;
		this.product = product;
		this.seller = seller;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId
				+ ", amount=" + amount + ", status=" + status + ", buyerId="
				+ buyerId + ", sellerId=" + sellerId + ", buyer=" + buyer
				+ ", product=" + product + ", seller=" + seller + "]";
	}

}