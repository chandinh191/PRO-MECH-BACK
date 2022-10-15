package com.example.promechbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TechinicalStaff")
public class TechnicalStaffEntity {
    @Id
    @Column(name = "AccountID")
    private int accountID;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Password")
    private String password;
}
