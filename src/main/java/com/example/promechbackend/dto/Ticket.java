package com.example.promechbackend.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {
    private int ticketID;
    private int phone;
    private String name;
    private String password;
}
