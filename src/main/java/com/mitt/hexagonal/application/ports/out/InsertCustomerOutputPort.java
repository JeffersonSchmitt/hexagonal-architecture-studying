package com.mitt.hexagonal.application.ports.out;

import com.mitt.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
