package com.mitt.hexagonal.application.core.usecase;

import com.mitt.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import com.mitt.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdOutputPort{
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }
    @Override
    public void delete(String id){
        var customer = findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new RuntimeException(("Customer not found with id: " + id)));
        deleteCustomerByIdOutputPort.delete(id);
    }
}
