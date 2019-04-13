package com.paralun.app.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @GetMapping("/api2")
    public void userEvent() {
        User user = new User("bambang", true, "Active");
        UserEvent event = new UserEvent(this, user);
        eventPublisher.publishEvent(event);
    }
}
