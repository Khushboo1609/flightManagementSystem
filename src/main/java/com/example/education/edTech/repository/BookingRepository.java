package com.example.education.edTech.repository;

import com.example.education.edTech.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingRecord, Long> {

}
