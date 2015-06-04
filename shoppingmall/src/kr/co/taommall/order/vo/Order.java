package kr.co.taommall.order.vo;

import java.io.Serializable;

import kr.co.taommall.account.vo.Buyer;
import kr.co.taommall.product.vo.Product;

public class Order implements Serializable {
	private String orderId;
	private int productId;
	private int amount;
	private String status;
	private String buyerId;
	Buyer buyer;
	Product product;

	public Order() {
		super();
	}

	public Order(String orderId, int productId, int amount, String status,
			String buyerId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
	}

	public Order(String orderId, int productId, int amount, String status,
			String buyerId, Buyer buyer, Product product) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.amount = amount;
		this.status = status;
		this.buyerId = buyerId;
		this.buyer = buyer;
		this.product = product;
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId
				+ ", amount=" + amount + ", status=" + status + ", buyerId="
				+ buyerId + ", buyer=" + buyer + ", product=" + product + "]";
	}
}