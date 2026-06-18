package com.mitt.hexagonal.application.ports.in;

import com.mitt.hexagonal.adapters.in.controller.CustomerController;
import com.mitt.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
