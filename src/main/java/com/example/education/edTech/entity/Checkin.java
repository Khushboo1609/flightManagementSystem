package com.example.education.edTech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Checkin {
    @Id
@GeneratedValue
private long checkinId;

    private String seatNumber;

    private String gateNumber;

    public long getCheckinId() {
        return checkinId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setCheckinId(long checkinId) {
        this.checkinId = checkinId;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Checkin(String seatNumber, String gateNumber) {
        this.seatNumber = seatNumber;
        this.gateNumber = gateNumber;
    }

    public Checkin() {
    }
}

