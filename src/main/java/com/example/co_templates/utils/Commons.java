package com.example.co_templates.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Commons {

    // Method to generate unique sequence IDs
    public String getUniqueSequence() {
        return UUID.randomUUID().toString();
    }

}
