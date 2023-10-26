package com.practise.eventmanagement.controller;

import com.practise.eventmanagement.model.EventDetails;
import com.practise.eventmanagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // in order to access these methods in controller, create rest controller so this class can
//converted into restful webservice
@RequestMapping("/api/eventManagement")

public class EventController {

    @Autowired //Dependency injection
     private EventService eventService;

    @GetMapping("/all")
    public List<EventDetails> getallEvents(){// created in controller class
        return this.eventService.getAllEvents(); // created in service class

    }

    @GetMapping("/event/{eventID}")
    public EventDetails getSingleEvent(@PathVariable Integer eventID){
        return this.eventService.getSingleEvent(eventID);
    }

    @PostMapping(value ="/add", consumes = {"application/json"})
    public String addEvent(@RequestBody EventDetails eventDetail){
        return this.eventService.addEvent(eventDetail);
    }

    @PutMapping("/update/{eventID}")
    public EventDetails updateEvent(@PathVariable Integer eventID, @RequestBody EventDetails eventdetail){
        return this.eventService.updateEvent(eventID,eventdetail);
    }

    @DeleteMapping("/delete")
    public String deleteEvent(@PathVariable Integer eventID){
        return this.eventService.deleteEvent(eventID);
    }
}
