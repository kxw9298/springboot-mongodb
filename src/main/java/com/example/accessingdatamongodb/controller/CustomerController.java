package com.example.accessingdatamongodb.controller;

import com.example.accessingdatamongodb.model.Customer;
import com.example.accessingdatamongodb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
