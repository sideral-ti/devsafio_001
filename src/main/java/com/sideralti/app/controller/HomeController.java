package com.sideralti.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Diente Blanco Dental");
        model.addAttribute("h1", "Bienvenido a Diente Blanco Dental Clinic!");
        model.addAttribute("h2", "Diente Blanco Dental Clinic API Documentation");
        return "index";
    }
}

