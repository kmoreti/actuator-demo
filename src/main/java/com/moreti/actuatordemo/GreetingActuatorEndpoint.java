package com.moreti.actuatordemo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "greeting")
public class GreetingActuatorEndpoint {

    @ReadOperation
    public Message hello() {
        return new Message("Hello World");
    }

    record Message(String message) {}
}
