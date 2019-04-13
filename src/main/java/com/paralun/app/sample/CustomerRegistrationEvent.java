package com.paralun.app.sample;

public class CustomerRegistrationEvent {

    private String name;

    public CustomerRegistrationEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
