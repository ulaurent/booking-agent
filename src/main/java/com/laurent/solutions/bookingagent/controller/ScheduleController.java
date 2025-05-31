package com.laurent.solutions.bookingagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ScheduleController {
    @GetMapping("schedule")
    public String schedule(String name) {
        return "This is what" + name + " is scheduled for today";
    }
}
