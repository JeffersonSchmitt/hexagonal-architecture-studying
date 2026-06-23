package com.mitt.hexagonal.application.core.usecase;

import com.mitt.hexagonal.application.core.domain.Customer;
import com.mitt.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.mitt.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.mitt.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.mitt.hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeUseCase;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeUseCase, InsertCustomerOutputPort insertCustomerOutputPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeUseCase = findAddressByZipCodeUseCase;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }
    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeUseCase.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
