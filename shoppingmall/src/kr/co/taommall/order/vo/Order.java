package kr.co.taommall.order.vo;

import java.io.Serializable;

public class Order implements Serializable{
	private String order_id;
	private int product_id;
	private String buyer_id;
	private int mount;
	private String status;
	private int board_no;
		
	public Order(){}

	public Order(String order_id, int product_id, String buyer_id, int mount,
			String status, int board_no) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.buyer_id = buyer_id;
		this.mount = mount;
		this.status = status;
		this.board_no = board_no;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public int getMount() {
		return mount;
	}

	public void setMount(int mount) {
		this.mount = mount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + board_no;
		result = prime * result
				+ ((buyer_id == null) ? 0 : buyer_id.hashCode());
		result = prime * result + mount;
		result = prime * result
				+ ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + product_id;
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
		if (board_no != other.board_no)
			return false;
		if (buyer_id == null) {
			if (other.buyer_id != null)
				return false;
		} else if (!buyer_id.equals(other.buyer_id))
			return false;
		if (mount != other.mount)
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (product_id != other.product_id)
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
		return "Order [order_id=" + order_id + ", product_id=" + product_id
				+ ", buyer_id=" + buyer_id + ", mount=" + mount + ", status="
				+ status + ", board_no=" + board_no + "]";
	}
}
