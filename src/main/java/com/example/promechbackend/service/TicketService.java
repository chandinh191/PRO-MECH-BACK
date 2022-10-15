package com.example.promechbackend.service;

import com.example.promechbackend.dto.Ticket;
import com.example.promechbackend.entity.TicketEntity;
import com.example.promechbackend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public TicketEntity getTicketByPhone(int phone) {
        return ticketRepository.getByPhone(phone);
    }

    public List<TicketEntity> getAll() {
        return ticketRepository.getAll();
    }

    public Integer createTicket(Ticket ticket) {
        return ticketRepository.createTicket(ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), ticket.getService());
    }

    public Integer updateTicket(Ticket ticket) {
        return ticketRepository.updateTicket(ticket.getTicketID(), ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), ticket.getService());
    }

    public Integer confirmTicket(Ticket ticket) {
        return ticketRepository.confirmTicket(ticket.getTicketID());
    }

    public void getString (String body){
        System.out.println(body + "\n");
        int i;
        Ticket t = new Ticket();

            i = body.indexOf("name");
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            int temp=i;
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            if(i-temp > 2) {
                System.out.println("null");
            }
            else {
                i++;
                int j=i;
                while(i<body.length() && body.charAt(i)!='"') i++;
                System.out.println(body.substring(j,i));
                t.setName(body.substring(j,i));
            }


            i = body.indexOf("password");
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            temp=i;
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            if(i-temp > 2) {
                System.out.println("null");
            }
            else {
                i++;
                int j=i;
                while(i<body.length() && body.charAt(i)!='"') i++;
                System.out.println(body.substring(j,i));
                t.setPassword(body.substring(j,i));
            }


            i = body.indexOf("phone");
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            temp=i;
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            if(i-temp > 2) {
                System.out.println("null");
            }
            else {
                i++;
                int j=i;
                while(i<body.length() && body.charAt(i)!='"') i++;
                System.out.println(body.substring(j,i));
                t.setPhone(Integer.parseInt(body.substring(j,i)));
            }


            i = body.indexOf("description");
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            temp=i;
            i++;
            while(i<body.length() && body.charAt(i)!='"') i++;
            if(i-temp > 2) {
                System.out.println("null");
            }
            else {
                i++;
                int j=i;
                while(i<body.length() && body.charAt(i)!='"') i++;
                System.out.println(body.substring(j,i));
                t.setDescription(body.substring(j,i));
            }

    }
}
