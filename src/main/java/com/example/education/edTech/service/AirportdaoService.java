package com.example.education.edTech.service;

import com.example.education.edTech.entity.*;

import com.example.education.edTech.repository.Airportdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirportdaoService {
    @Autowired
    Airportdao locations;

    public void saveAirport(Airport airport){
        locations.save(airport);

    }
    public Airport fetchAirportByAirportcode(String airportCode){

        return  locations.findByAirportCode(airportCode);



    }

    public void  removeAirport(String airportCode) {
        locations.deleteById(airportCode);
    }

}
