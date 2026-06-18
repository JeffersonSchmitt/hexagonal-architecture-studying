package com.mitt.hexagonal.adapters.out.repository.mapper;

import com.mitt.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.mitt.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
