package com.example.education.edTech.service;
import com.example.education.edTech.entity.*;
import com.example.education.edTech.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository booking;
    public void book(BookingRecord b)
    {
        booking.save( b);

    }
    public List<BookingRecord> findBook()
    {
        return booking.findAll();
    }

    public BookingRecord findBookbyId(long bookingId) {
        Optional<BookingRecord>  book = booking.findById(bookingId);
        return book.get();
   }
    public void deleteBookbyId(long bookingId) {
        booking.deleteById(bookingId);

    }
}
