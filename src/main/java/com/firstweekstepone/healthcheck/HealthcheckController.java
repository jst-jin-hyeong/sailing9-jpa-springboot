package com.firstweekstepone.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthcheckController {
    @GetMapping("/health")
    public String healthCheck(){
        return "HeathCheck Page";
    }
}
