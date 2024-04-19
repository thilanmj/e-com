package com.codexmo.customerservice.models;

import lombok.Data;

@Data
public class Customer {

    private Address billingAddress;
    private Address shippingAddress;

}
