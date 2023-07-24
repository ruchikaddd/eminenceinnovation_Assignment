package com.eminenceinnovation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.eminenceinnovation.util.JwtTokenUtil;


@RestController
public class FootballMatchController {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    // Task 1 API - Retrieve values from JWT token
    @GetMapping("/api/task1")
    public ResponseEntity<?> task1(@RequestHeader("Authorization") String authorizationHeader) {
        String token = authorizationHeader.substring(7); // Remove "Bearer " prefix
        if (jwtTokenUtil.validateToken(token)) {
            // Extract values from the token and return them in the response
            // Implement this part based on your specific use case
            return ResponseEntity.ok("Task 1 API response");
        } else {
            return ResponseEntity.status(401).body("Invalid or expired token");
        }
    }

    // Task 2 API - Get the number of matches that ended in a draw for a given year
    @GetMapping("/api/task2")
    public ResponseEntity<?> task2(@RequestHeader("Authorization") String authorizationHeader) {
        String token = authorizationHeader.substring(7); // Remove "Bearer " prefix
        if (jwtTokenUtil.validateToken(token)) {
            // Call the REST API for football match data (use RestTemplate in a separate thread)
            // Implement this part based on your specific use case
            return ResponseEntity.ok("Task 2 API response");
        } else {
            return ResponseEntity.status(401).body("Invalid or expired token");
        }
    }
}