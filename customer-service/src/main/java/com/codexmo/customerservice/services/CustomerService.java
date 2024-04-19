package com.codexmo.customerservice.services;

import com.codexmo.customerservice.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getList(BaseFilterDto baseFilterDto);
}
