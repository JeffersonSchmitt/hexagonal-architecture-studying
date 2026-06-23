package com.mitt.hexagonal.adapters.out;

import com.mitt.hexagonal.adapters.out.repository.CustomerRepository;
import com.mitt.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
