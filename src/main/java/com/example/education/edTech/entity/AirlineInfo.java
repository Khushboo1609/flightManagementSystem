package com.example.education.edTech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AirlineInfo {
    @Id
    @GeneratedValue
    private long airlineId;

    private String airlineLogo;

    private String nameOfAirline;

    public long getAirlineId() {
        return airlineId;
    }

    public String getAirlineLogo() {
        return airlineLogo;
    }

    public String getNameOfAirline() {
        return nameOfAirline;
    }

    public void setAirlineId(long airlineId) {
        this.airlineId = airlineId;
    }

    public void setAirlineLogo(String airlineLogo) {
        this.airlineLogo = airlineLogo;
    }

    public void setNameOfAirline(String nameOfAirline) {
        this.nameOfAirline = nameOfAirline;
    }

    public AirlineInfo(long airlineId, String airlineLogo, String nameOfAirline) {
        this.airlineId = airlineId;
        this.airlineLogo = airlineLogo;
        this.nameOfAirline = nameOfAirline;
    }
}
