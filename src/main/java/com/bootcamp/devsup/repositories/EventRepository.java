package com.bootcamp.devsup.repositories;

import com.bootcamp.devsup.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
