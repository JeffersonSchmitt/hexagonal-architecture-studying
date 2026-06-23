package com.mitt.hexagonal.config.usecase;

import com.mitt.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.mitt.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.mitt.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {
    @Bean
    DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
            ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdAdapter, deleteCustomerByIdAdapter);
    }
}
