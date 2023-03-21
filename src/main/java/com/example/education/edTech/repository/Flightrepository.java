package com.example.education.edTech.repository;

import com.example.education.edTech.entity.Flight;
import com.example.education.edTech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Flightrepository extends JpaRepository<Flight,Long> {


}

