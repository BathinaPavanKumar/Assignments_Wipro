package com.example.ecommerce_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce_app.model.Order;
import com.example.ecommerce_app.repository.Orderrepository;

@Service
public class OrderService {
	
	@Autowired
	private Orderrepository orderrepository;
	
	public void saveOrder(Order order) {
		orderrepository.save(order);
	}
	

    public List<Order> getAllOrders() {
        return orderrepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderrepository.findById(id).get();
    }

    public void deleteOrder(Long id) {
        orderrepository.deleteById(id);
    }
	
	
	
	

}
