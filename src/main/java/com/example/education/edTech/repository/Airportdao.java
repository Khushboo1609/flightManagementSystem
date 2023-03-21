package com.example.education.edTech.repository;

import com.example.education.edTech.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Airportdao extends JpaRepository<Airport, String> {
    Airport findByAirportCode(String airportCode);
    void deleteByAirportCode(String airportCode);


}
