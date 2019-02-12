package com.example.library.controller;

import com.example.library.entity.Position;
import com.example.library.entity.Ticket;
import com.example.library.entity.User;
import com.example.library.service.TicketService;
import com.example.library.service.UserService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @Autowired
    UserService userService;
    @PostMapping("addTicket")
    public String addTicket(Ticket ticket){
        ticket.setTicketID(UUID.randomUUID().toString());
        User user= new User();
        user.setUserID(ticket.getUserID());
        List<User> list = userService.queryUser(user);
        User u=list.get(0);
        ticket.setUserID(u.getUserID());
        int n=ticketService.addTicket(ticket);
        return String.valueOf(n);
    }
    @GetMapping("queryAll")
    public String queryAll(){
        List<Ticket> ticketList=ticketService.queryAll();
        ticketList.forEach((p)->System.out.println(p));
        return ticketList.toString();
    }
    @PostMapping("/queryTicket")
    public String queryTicket(Ticket ticket){
        System.out.println("--------------------");
       List<Ticket> list= ticketService.queryTicket(ticket);
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PutMapping("/updateTicket")
    public String updateTicket(Ticket ticket){
        int n = ticketService.updateTicket(ticket);
        return String.valueOf(n);
    }


    @DeleteMapping("/deleteTicket")
    public String deleteTicket(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {
                int num = ticketService.deleteTicket(strs);
                map.put("num", num);
                return String.valueOf(num);
            }
        }catch (Exception e ){
        }
        return String.valueOf(0);
    }
    @DeleteMapping("/deleteTicketByID")
    public String deleteTicketById(Ticket ticket){
        int n =  ticketService.deleteTicketByID(ticket);
        return String.valueOf(n);
    }
}
