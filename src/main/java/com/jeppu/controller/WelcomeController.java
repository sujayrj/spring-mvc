package com.jeppu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping(value={"/", "/welcome", "/index"})
    public String welcome(){
        return "welcome";
    }
}
