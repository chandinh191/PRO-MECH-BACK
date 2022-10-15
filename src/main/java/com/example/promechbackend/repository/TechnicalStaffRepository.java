package com.example.promechbackend.repository;

import com.example.promechbackend.entity.TechnicalStaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalStaffRepository extends JpaRepository<TechnicalStaffEntity, Integer> {

}
