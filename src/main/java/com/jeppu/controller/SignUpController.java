package com.jeppu.controller;

import com.jeppu.model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SignUpController {

    @GetMapping(value="/signup")
    public String signUpPage(){
        return "signup";
    }

    @PostMapping(value="/processSignup")
    public String processSignup(UserDTO userDTO, Model model){
        System.out.println("User details submitted are: ");
        System.out.println(userDTO);
        model.addAttribute("user", userDTO);
        return "success";
    }
}
