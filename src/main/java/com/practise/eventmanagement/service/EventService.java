package com.practise.eventmanagement.service;

import com.practise.eventmanagement.model.EventDetails;
import com.practise.eventmanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class EventService {


    LocalDate eventDate1 = LocalDate.of(2023, 11, 15);

    @Autowired
    private EventRepository eventRepository;

    public List<EventDetails> getAllEvents(){
        return this.eventRepository.findAll();
    }

    public EventDetails getSingleEvent(Integer eventID) {
       return this.eventRepository.findById(eventID).get();
    }

    public String addEvent(EventDetails eventdetails){
       this.eventRepository.save(eventdetails);
         return "Event Added Successfully";
    }



    public String deleteEvent(Integer eventID){
     this.eventRepository.deleteById(eventID);
        return "Event Deleted Successfully";
    }

    public EventDetails updateEvent(Integer eventID, EventDetails eventDetail){

        EventDetails existingEvent = eventRepository.findById(eventID).get();
        existingEvent.setEventName(eventDetail.getEventName());
        existingEvent.setEventDate(eventDetail.getEventDate());
        existingEvent.setTicketPrice(eventDetail.getTicketPrice());
        EventDetails updatedevent = eventRepository.save(existingEvent);
        return updatedevent;
    }

}
