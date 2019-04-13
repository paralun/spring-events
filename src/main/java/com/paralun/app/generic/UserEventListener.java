package com.paralun.app.generic;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener implements ApplicationListener<UserEvent> {

    @Override
    public void onApplicationEvent(UserEvent userEvent) {
        System.out.println("User Listenr :: " + userEvent.getUser().getUsername());
    }
}
