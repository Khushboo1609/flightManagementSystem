package com.example.education.edTech.service;

import com.example.education.edTech.entity.Flight;
import com.example.education.edTech.repository.Flightrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    Flightrepository flight;
    public Flight Findflight(long id)
    {
        Optional<Flight> op=  flight.findById(id);
        return op.get();
    }


    public void SaveFlight(Flight f)
    {
        flight.save(f);
    }
    public List<Flight> FindAllflight()
    {
        return  flight.findAll();
    }


}
