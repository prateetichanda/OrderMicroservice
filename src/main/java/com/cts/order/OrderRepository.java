package com.cts.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.order.Order;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order,Integer> {
	public List<Order> findAllBycustomerid(Long customerid);
}
