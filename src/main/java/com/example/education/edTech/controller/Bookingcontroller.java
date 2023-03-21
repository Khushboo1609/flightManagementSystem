package com.example.education.edTech.controller;
import com.example.education.edTech.entity.*;
import com.example.education.edTech.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Bookingcontroller {
    @Autowired
    BookingService create;

    @PostMapping  ("/create-booking")
    public void createBooking(@RequestBody BookingRecord b)
 {
     create.book(b);
 }

 @GetMapping("/get-booking")
    public List<BookingRecord> getBooking()
 {
     return create.findBook();
 }
    @GetMapping("/get-booking/{bookingId}")
    public BookingRecord getBookingById(@PathVariable Long  bookingId)
    {
        return create.findBookbyId(bookingId);
    }

    @DeleteMapping("/delete-booking/{bookingId}")
    public void deleteBookingbyId(@PathVariable Long  bookingId)
    {
        create.deleteBookbyId(bookingId);
    }







}
