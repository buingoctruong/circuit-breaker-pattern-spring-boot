package com.edu.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.addressservice.model.Address;
import com.edu.addressservice.service.AddressService;

@RestController
@RequestMapping("addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping("/{postalCode}")
    public Address getAddressByPostalCode(@PathVariable("postalCode") String postalCode) {
        return addressService.getAddressByPostalCode(postalCode);
    }
}
