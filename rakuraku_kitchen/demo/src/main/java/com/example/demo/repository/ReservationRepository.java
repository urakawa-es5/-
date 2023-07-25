package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Reservation;

@Repository

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}