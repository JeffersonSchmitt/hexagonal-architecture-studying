package com.mitt.hexagonal.application.ports.out;

import com.mitt.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
     Address find(String zipCode);
}
