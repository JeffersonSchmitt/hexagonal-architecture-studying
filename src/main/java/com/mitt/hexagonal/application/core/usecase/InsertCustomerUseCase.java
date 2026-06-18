package com.mitt.hexagonal.application.core.usecase;

import com.mitt.hexagonal.application.core.domain.Customer;
import com.mitt.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.mitt.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.mitt.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeUseCase;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeUseCase, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeUseCase = findAddressByZipCodeUseCase;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }
    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeUseCase.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
