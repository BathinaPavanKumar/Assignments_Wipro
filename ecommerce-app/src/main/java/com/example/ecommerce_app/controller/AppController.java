package com.example.ecommerce_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce_app.model.Order;
import com.example.ecommerce_app.service.OrderService;

@Controller
public class AppController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String viewOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "orders";
    }

    @GetMapping("/add-order")
    public String showOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "add-order";
    }

    @PostMapping("/save-order")
    public String saveOrder(@ModelAttribute("order") Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/edit-order/{id}")
    public String showEditOrderForm(@PathVariable Long id, Model model) {
        model.addAttribute("order", orderService.getOrderById(id));
        return "edit-order";
    }

    @PostMapping("/update-order")
    public String updateOrder(@ModelAttribute("order") Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}
