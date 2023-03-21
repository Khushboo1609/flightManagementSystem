package com.example.education.edTech.controller;

import com.example.education.edTech.entity.Flight;
import com.example.education.edTech.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FlightController {
    @Autowired
    FlightService fly;

    @GetMapping("/Findflight/{id}")
    public Flight fly(@PathVariable long id) {
        return fly.Findflight(id);
    }

    @PostMapping("/postflight")
    public void saveair(@RequestBody Flight f) {
        fly.SaveFlight(f);
    }

    @GetMapping("/FindAllflight")
    public List<Flight > flys() {
        return fly.FindAllflight();
    }
}





