package com.mitt.hexagonal.config.usecase;

import com.mitt.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.mitt.hexagonal.adapters.out.InsertCustomerAdapter;
import com.mitt.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter);
    }
}
