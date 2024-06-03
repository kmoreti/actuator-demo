package com.moreti.actuatordemo;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.stereotype.Component;

@Component
@WebEndpoint(id = "rest-greeting")
public class GreetingRestControllerEndpoint {

    @ReadOperation
    public Message hello() {
        return new Message("Hi World");
    }

    record Message(String message) {}
}
