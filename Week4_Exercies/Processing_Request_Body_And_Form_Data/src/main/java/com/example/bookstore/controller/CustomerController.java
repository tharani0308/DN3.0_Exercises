package com.example.bookstore.controller;

import com.example.bookstore.model.Customer;
import com.example.bookstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // POST endpoint to accept JSON request body and create a new customer
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    // POST endpoint to process form data for customer registration
    @PostMapping("/register")
    public ModelAndView registerCustomer(@RequestParam Map<String, String> formData) {
        Customer customer = new Customer();
        customer.setFirstName(formData.get("firstName"));
        customer.setLastName(formData.get("lastName"));
        customer.setEmail(formData.get("email"));
        customer.setPassword(formData.get("password"));

        customerService.addCustomer(customer);
        return new ModelAndView("registrationSuccess", "customer", customer);
    }
}
