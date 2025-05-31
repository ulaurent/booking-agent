package com.laurent.solutions.bookingagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/availability")
    public String status(String message) {
        return "Reservation is confirmed";
    }

    @GetMapping("/details")
    public String details() {
        return "Reservation details: [Date: 2023-10-01, Time: 18:00, Guests: 2]";
    }

    @PostMapping("/cancel")
    public String cancel() {
        return "Reservation has been cancelled";
    }

    @PostMapping("/book")
    public String book() {
        return "Reservation has been booked successfully";
    }
}
