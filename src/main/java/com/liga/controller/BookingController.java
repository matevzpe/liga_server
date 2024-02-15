package com.liga.controller;

import com.liga.entity.Booking;
import com.liga.repository.BookingRepository;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/booking")
public class BookingController {
    @Inject
    BookingRepository bookingRepository;

    @Post("/")
    Booking save(@Body Booking booking) {
        try{
            Booking existingGoal = bookingRepository.findById(booking.getId()).get();
            return bookingRepository.update(booking);
        } catch (Exception e){
            return bookingRepository.save(booking);
        }
    }

    @Get("/{id}")
    Booking get(@PathVariable Long id){
        return bookingRepository.findById(id).get();
    }

    @Get("/list")
    public List<Booking> list(Pageable pageable) {
        return bookingRepository.findAll(pageable).getContent();
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }
}