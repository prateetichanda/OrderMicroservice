package com.cts.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.order.Order;
import com.cts.order.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository orderRepos;
	
	@PostMapping("/order")
    public void placeOrder(@RequestBody Order order)
     {
		orderRepos.save(order);
    }
	@GetMapping("/order/{customerid}")
    public 	List<Order> findOrdersBycustomerId(@PathVariable Long customerid)
    {
		return orderRepos.findAllBycustomerid(customerid);
    }
	/*@RequestMapping("/{orderId}")
    public Sale getOrder(@PathVariable("orderId") Integer orderId) {
        LOGGER.info("Start");
        Sale sale = saleService.getSale(orderId);
        LOGGER.info("End");
        return sale;
    }*/

}
