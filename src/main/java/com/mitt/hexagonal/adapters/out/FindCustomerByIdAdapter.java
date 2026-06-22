package com.mitt.hexagonal.adapters.out;

import com.mitt.hexagonal.adapters.out.repository.CustomerRespository;
import com.mitt.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.mitt.hexagonal.application.core.domain.Customer;
import com.mitt.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity=customerRespository.findById(id);
        return customerEntity.map(entity-> customerEntityMapper.toCustomer(entity));
    }
}
