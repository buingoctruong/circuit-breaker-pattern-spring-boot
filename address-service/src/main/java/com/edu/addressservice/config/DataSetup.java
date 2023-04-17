package com.edu.addressservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.edu.addressservice.model.Address;
import com.edu.addressservice.repository.AddressRepository;

import jakarta.annotation.PostConstruct;

@Configuration
public class DataSetup {
    @Autowired
    private AddressRepository addressRepository;
    @PostConstruct
    public void setupData() {
        addressRepository.saveAll(Arrays.asList(
                Address.builder().id(1).postalCode("1000001").state("Tokyo").city("Chiyoda")
                        .build(),
                Address.builder().id(2).postalCode("1100000").state("Tokyo").city("Taito").build(),
                Address.builder().id(3).postalCode("2100001").state("Kanagawa").city("Kawasaki")
                        .build()));
    }
}
