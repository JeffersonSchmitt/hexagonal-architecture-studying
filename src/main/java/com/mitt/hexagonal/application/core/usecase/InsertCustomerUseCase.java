package com.mitt.hexagonal.application.core.usecase;

import com.mitt.hexagonal.application.core.domain.Customer;
import com.mitt.hexagonal.application.ports.out.IFindAdressByZipCodeOutputPort;
import com.mitt.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final IFindAdressByZipCodeOutputPort findAddressByZipCodeUseCase;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(IFindAdressByZipCodeOutputPort findAddressByZipCodeUseCase, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeUseCase = findAddressByZipCodeUseCase;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var adress= findAddressByZipCodeUseCase.find(zipCode);
        customer.setAddress(adress);
        insertCustomerOutputPort.insert(customer);
    }
}
