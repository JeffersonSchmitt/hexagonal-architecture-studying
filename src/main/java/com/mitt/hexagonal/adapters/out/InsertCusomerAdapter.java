package com.mitt.hexagonal.adapters.out;

import com.mitt.hexagonal.adapters.out.repository.CustomerRespository;
import com.mitt.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.mitt.hexagonal.application.core.domain.Customer;
import com.mitt.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCusomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRespository customerRespository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRespository.save(customerEntity);
    }
}
