package com.mitt.hexagonal.application.ports.out;

import com.mitt.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
