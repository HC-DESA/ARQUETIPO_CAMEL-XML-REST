package cl.test.strategy;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import cl.test.models.Order;

public class AddOrders  implements AggregationStrategy{

	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		if (oldExchange == null) {
			List<Order> listaSalida = new ArrayList<Order>();			
        	listaSalida.add(newExchange.getIn().getBody(Order.class));
        	newExchange.getIn().setBody(listaSalida);
            return newExchange;
        }
 
        List<Order> listaSalida = (List<Order>)oldExchange.getIn().getBody();
        listaSalida.add(newExchange.getIn().getBody(Order.class));
        return oldExchange;
	}
}
