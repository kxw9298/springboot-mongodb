package com.example.accessingdatamongodb.service;

import com.example.accessingdatamongodb.model.Customer;
import com.example.accessingdatamongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;


    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}
