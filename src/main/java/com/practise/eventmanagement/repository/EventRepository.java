package com.practise.eventmanagement.repository;

import com.practise.eventmanagement.model.EventDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository <EventDetails, Integer> {

}
