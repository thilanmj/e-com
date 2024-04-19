package com.codexmo.customerservice.controller;

import com.codexmo.customerservice.models.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController{


    public List<Customer> readAll(){

    }

}
