package com.paralun.app.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomePublish {

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping("/api/{name}")
    public String event(@PathVariable("name") String name) {
        publisher.publishEvent(new CustomerRegistrationEvent(name));
        return "hallo";
    }
}
