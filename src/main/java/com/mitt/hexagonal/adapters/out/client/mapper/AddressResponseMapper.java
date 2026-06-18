package com.mitt.hexagonal.adapters.out.client.mapper;

import com.mitt.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(com.mitt.hexagonal.adapters.out.client.response.AddressResponse addressResponse);
}
