package com.example.promechbackend.service;

import com.example.promechbackend.repository.TechnicalStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalStaffService {
    @Autowired
    TechnicalStaffRepository technicalStaffRepository;

}
