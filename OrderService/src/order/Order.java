package order;

import java.util.List;

public class Order {
	private float totalAmount=1;
	private String orderDate;
	private OrderStatus orderStatus;
	private Address address;
	private List<OrderLine> orderlines;
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}
	
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public float claculateFinalAmount(List<OrderLine> orderlines) {
		for(OrderLine ol:orderlines) {
			totalAmount = totalAmount + (ol.getPrice() * ol.getQuantity()) ;
		}
		return totalAmount;
	}
	
	public OrderStatus orderStatus(List<OrderLine> orderlines) {
		int size = orderlines.size();
		int compledCount=0;
		int CancelledCount=0;
		for(OrderLine ol:orderlines) {
			if(ol.getOrderLineStatus().equals(OrderLineStatus.cancelled)) {
				CancelledCount++;
			}
			else if(ol.getOrderLineStatus().equals(OrderLineStatus.cancelled)) {
				compledCount++;
			}
		}
		if(size==compledCount || size==CancelledCount) {
			orderStatus=OrderStatus.completed;
		}
		else {
			orderStatus=OrderStatus.open;
		}
		return orderStatus;
	}
	@Override
	public String toString() {
		return "Order [totalAmount=" + totalAmount + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", address=" + address + ", orderlines=" + orderlines + "]";
	}
	
	
	
	

}
