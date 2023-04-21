package com.in28minutes.rest.webservices.restfulwebservices;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {

    private LocalDate timeStamp;
    private String message;
    private String details;


    public ErrorDetails(LocalDateTime timeStamp, String message, String details) {
        this.timeStamp = LocalDate.from(timeStamp);
        this.message = message;
        this.details = details;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
