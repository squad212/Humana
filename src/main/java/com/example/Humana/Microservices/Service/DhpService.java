package com.example.Humana.Microservices.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DhpService {
    public String buildMessage(String name){
        return "Hello" + name + ". This is a greeting from the service layer";
    }
    public String msg(String name){
        return "Drug Name: " + name;
    }
}
