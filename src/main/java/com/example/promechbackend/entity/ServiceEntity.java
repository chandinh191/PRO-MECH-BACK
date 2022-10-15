package com.example.promechbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Service")
public class ServiceEntity {
    @Id
    @Column(name = "ServiceID")
    private int serviceID;

    @Column(name = "ServiceName")
    private String serviceName;
}
