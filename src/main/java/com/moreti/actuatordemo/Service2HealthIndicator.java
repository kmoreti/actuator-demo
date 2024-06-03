package com.moreti.actuatordemo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class Service2HealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode != 0) {
            return Health.outOfService().withDetail("Error Code", errorCode).build();
        }
        return Health.up().withDetail("Success", true).build();
    }

    private int check() {
        // call external service APIs to determine the errorCode
        return 10;
    }

}