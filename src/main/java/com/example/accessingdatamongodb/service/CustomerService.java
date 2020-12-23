package com.example.accessingdatamongodb.service;

import com.example.accessingdatamongodb.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
