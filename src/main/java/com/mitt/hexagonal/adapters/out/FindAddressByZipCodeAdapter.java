package com.mitt.hexagonal.adapters.out;

import com.mitt.hexagonal.adapters.out.client.FindAdressByZipCodeClient;
import com.mitt.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.mitt.hexagonal.adapters.out.client.response.AddressResponse;
import com.mitt.hexagonal.application.core.domain.Address;
import com.mitt.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAdressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
