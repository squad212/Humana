package com.example.Humana.Microservices.Controller;


import com.example.Humana.Microservices.Response.GreetingResponse;
import com.example.Humana.Microservices.Service.DhpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("microservice/v1")
@Slf4j
public class DhpController {

    @Autowired
    DhpService dh;

    @GetMapping (value = "/greeting", produces = "application/json")
    public GreetingResponse getGreeting(@RequestParam ("name") String name){
        String message = dh.buildMessage(name);
    return GreetingResponse.builder().greeting(message).build();
    }

    @GetMapping (value = "/getDrugInfo", produces = "application/json")
    public String getDrugInfo(@RequestParam String name){
        String mesg= dh.msg(name);
        return mesg;
    }

}



