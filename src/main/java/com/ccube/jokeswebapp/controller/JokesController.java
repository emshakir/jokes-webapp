package com.ccube.jokeswebapp.controller;

import com.ccube.jokeswebapp.services.JokesServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesServices jokesServices;

    public JokesController(JokesServices jokesServices) {
        this.jokesServices = jokesServices;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesServices.getQuote());
        return "index";
    }
}
