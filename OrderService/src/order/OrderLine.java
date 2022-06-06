package order;

public class OrderLine {
	
	private String item;
	private float price;
	private int quantity;
	private int eta;
	private OrderLineStatus orderLineStatus;
	
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public OrderLineStatus getOrderLineStatus() {
		return orderLineStatus;
	}
	public void setOrderLineStatus(OrderLineStatus orderLineStatus) {
		this.orderLineStatus = orderLineStatus;
	}
	@Override
	public String toString() {
		return "OrderLine [item=" + item + ", price=" + price + ", quantity=" + quantity + ", eta=" + eta
				+ ", orderLineStatus=" + orderLineStatus + "]";
	}
	
	

}
