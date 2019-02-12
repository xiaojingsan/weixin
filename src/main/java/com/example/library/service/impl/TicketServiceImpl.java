package com.example.library.service.impl;

import com.example.library.entity.Ticket;
import com.example.library.mapper.TicketMapper;
import com.example.library.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    TicketMapper ticketMapper;
    @Override
    public int addTicket(Ticket ticket) {
        return ticketMapper.addTicket(ticket);
    }

    @Override
    public List<Ticket> queryAll() {
        return ticketMapper.queryAll();
    }

    @Override
    public List<Ticket> queryTicket(Ticket ticket) {
        return ticketMapper.queryTicket(ticket);
    }

    @Override
    public int deleteTicket(String[] id) {
        return ticketMapper.deleteTicket(id);
    }

    @Override
    public int deleteTicketByID(Ticket ticket) {
        return ticketMapper.deleteTicketByID(ticket);
    }

    @Override
    public int updateTicket(Ticket ticket) {
        return ticketMapper.updateTicket(ticket);
    }
}
