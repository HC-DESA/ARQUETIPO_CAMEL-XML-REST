package cl.test.bean;

import org.apache.camel.Exchange;
import cl.test.models.Order;

public class TestBean {

	public Order testData(Exchange exchange) {
		
		Order order = new Order(
				exchange.getProperty("ID", String.class), 
				exchange.getProperty("NAME", String.class), 
				exchange.getProperty("TEL", String.class), 
				exchange.getProperty("A", String.class), 
				exchange.getProperty("B", String.class), 
				exchange.getProperty("C", String.class), 
				exchange.getProperty("D", String.class));		
		return order;
	}
}
