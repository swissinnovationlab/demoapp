package com.example.demoapp;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/reservation")
public class HelloController {
    @GetMapping( value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getReservations( )  {

        List<String> reservations =  new ArrayList<>();
        reservations.add("1");
        reservations.add("2");
        reservations.add("3");

        return new ResponseEntity<List<String>>(reservations, CREATED);
    }
}
