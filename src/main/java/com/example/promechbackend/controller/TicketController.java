package com.example.promechbackend.controller;

import com.example.promechbackend.entity.TicketEntity;
import com.example.promechbackend.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @GetMapping("/{phone}")
    TicketEntity getTicketByPhone(@PathVariable int phone){
        return ticketService.getTicketByPhone(phone);
    }

    @GetMapping("/ALL")
    List<TicketEntity> getTicketByPhone(){
        return ticketService.getAll();
    }
}
