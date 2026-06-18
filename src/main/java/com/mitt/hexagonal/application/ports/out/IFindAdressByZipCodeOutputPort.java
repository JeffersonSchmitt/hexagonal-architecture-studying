package com.mitt.hexagonal.application.ports.out;

import com.mitt.hexagonal.application.core.domain.Address;

public interface IFindAdressByZipCodeOutputPort {
     Address find(String zipCode);
}
