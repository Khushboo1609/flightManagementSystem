package com.example.education.edTech.entity;


import com.fasterxml.jackson.annotation.JacksonInject;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
public class FlightInfo {
    @Id
    @GeneratedValue
    private long flightInfoid;

    private String flightNumber;

    private String flightType;

    private int numberofSeats;

    @ManyToOne
    @JoinTable(name = "flightsInfo", joinColumns = {
            @JoinColumn(name = "flightInfoid", referencedColumnName = "flightInfoid") }, inverseJoinColumns = {
            @JoinColumn(name = "airlineId", referencedColumnName = "airlineId") })
    private AirlineInfo airlineInfo;

    public long getFlightInfoid() {
        return flightInfoid;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightType() {
        return flightType;
    }

    public int getNumberofSeats() {
        return numberofSeats;
    }

    public AirlineInfo getAirlineInfoList() {
        return airlineInfo;
    }

    public void setFlightInfoid(long flightInfoid) {
        this.flightInfoid = flightInfoid;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    public void setAirlineInfoList(AirlineInfo airlineInfoList) {
        this.airlineInfo = airlineInfo;
    }

    public FlightInfo() {
    }

    public FlightInfo(String flightNumber, String flightType, int numberofSeats, AirlineInfo airlineInfo) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.numberofSeats = numberofSeats;
        this.airlineInfo = airlineInfo;
    }
}
