package com.mitt.hexagonal.application.ports.in;

import com.mitt.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find (String id);
}
