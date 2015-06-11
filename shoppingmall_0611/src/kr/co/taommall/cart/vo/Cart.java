package kr.co.taommall.cart.vo;

import java.io.Serializable;

import kr.co.taommall.product.vo.Product;

public class Cart implements Serializable {

	private String buyerId;
	private int productId;
	private int amount;
	private Product product;

	public Cart() {
		super();
	}

	public Cart(String buyerId, int productId, int amount) {
		super();
		this.buyerId = buyerId;
		this.productId = productId;
		this.amount = amount;
	}
	
	public Cart(String buyerId, int productId, int amount, Product product) {
		super();
		this.buyerId = buyerId;
		this.productId = productId;
		this.amount = amount;
		this.product = product;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [buyerId=" + buyerId + ", productId=" + productId
				+ ", amount=" + amount + ", product=" + product + "]";
	}

}
