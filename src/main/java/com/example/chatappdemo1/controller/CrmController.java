package com.example.chatappdemo1.controller;
import com.example.chatappdemo1.entity.Customer;
import com.example.chatappdemo1.entity.Order;
import com.example.chatappdemo1.entity.Product;
import com.example.chatappdemo1.entity.User;
import com.example.chatappdemo1.service.CustomerService;
import com.example.chatappdemo1.service.OrderService;
import com.example.chatappdemo1.service.ProductService;
import com.example.chatappdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/crm")
public class CrmController {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "userList";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "productList";
    }

    @GetMapping("/customers")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customerList";
    }

    @GetMapping("/orders")
    public String listOrders(Model model) {
        List<Order> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "orderList";
    }

    @PostMapping("/users/create")
    public String createUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/crm/users";
    }

    @PostMapping("/products/create")
    public String createProduct(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/crm/products";
    }

    @PostMapping("/customers/create")
    public String createCustomer(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/crm/customers";
    }

    @PostMapping("/orders/create")
    public String createOrder(@ModelAttribute Order order) {
        orderService.save(order);
        return "redirect:/crm/orders";
    }
}
