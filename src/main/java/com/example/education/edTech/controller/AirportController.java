package com.example.education.edTech.controller;
import com.example.education.edTech.service.AirportdaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.education.edTech.entity.*;
import java.util.List;

@RestController
public class AirportController {

    @Autowired
    AirportdaoService airportdaoService;

    @GetMapping("/")
    public String homepage(){
        return "HomePage";
    }

    @PostMapping("/saveAirport")
    public void saveAirport(@RequestBody Airport airport){
        airportdaoService.saveAirport(airport);
    }

   @GetMapping("/GetAirport/{airportCode}")
    public Airport getAirport(@PathVariable  String airportCode) {
       Airport air = airportdaoService.fetchAirportByAirportcode(airportCode);

       return air;
   }
   @DeleteMapping("/deleteAirport/{airportCode}")
    public void deleteAirport(@PathVariable  String airportCode){
        airportdaoService.removeAirport(airportCode);
   }


}
