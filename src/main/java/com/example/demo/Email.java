package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Email {
    Email(){
        System.out.println("Email duoc khoi tao !");
    }

}
