package order;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		Address add1 = new Address();
		add1.setCity("atp");
		add1.setCountry("india");
		add1.setPin(111111);
		
		OrderLine ol1 = new OrderLine();
		ol1.setItem("laptop");
		ol1.setPrice(50000);
		ol1.setQuantity(1);
		ol1.setEta(3);
		ol1.setOrderLineStatus(OrderLineStatus.open);
		
		OrderLine ol2 = new OrderLine();
		ol2.setItem("mobile");
		ol2.setPrice(20000);
		ol2.setQuantity(2);
		ol2.setEta(4);
		ol2.setOrderLineStatus(OrderLineStatus.delivered);
		
		List<OrderLine> orderlines = new ArrayList<>();
		orderlines.add(ol1);
		orderlines.add(ol2);
		
		Order order = new Order();
		order.setTotalAmount(order.claculateFinalAmount(orderlines));
		order.setOrderDate("08-06-2022");
		order.setAddress(add1);
		order.setOrderlines(orderlines);
		order.setOrderStatus(order.orderStatus(orderlines));
		
		
		System.out.println(order);

		
		
		

	}

}
