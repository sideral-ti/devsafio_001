package com.sideralti.app.controller_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/health")
public class HealthController {

    @GetMapping
    public String checkHealth() {
        return "Diente Blanco Dental Clinic está funcionando correctamente!";
    }

}