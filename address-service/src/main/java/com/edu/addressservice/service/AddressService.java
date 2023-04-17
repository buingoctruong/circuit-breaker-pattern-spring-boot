package com.edu.addressservice.service;

import com.edu.addressservice.model.Address;

public interface AddressService {
    Address getAddressByPostalCode(String postalCode);
}
