package com.example.education.edTech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Inventory {
    @Id
    @GeneratedValue
    private long inventoryId;

    private int count;

    public long getInventoryId() {
        return inventoryId;
    }

    public int getCount() {
        return count;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Inventory(int count) {
        this.count = count;
    }
}
