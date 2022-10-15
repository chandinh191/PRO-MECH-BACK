package com.example.promechbackend.service;

import com.example.promechbackend.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

}
