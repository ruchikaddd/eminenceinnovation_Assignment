package com.eminenceinnovation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FootballMatchService {
    private final RestTemplate restTemplate;

    @Autowired
    public FootballMatchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Implement the method to call the REST API using RestTemplate in a separate thread
    // Implement this part based on your specific use case
}

