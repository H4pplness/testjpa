package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Configure {
    public Email getEmail(){
        return new Email();
    }
}
