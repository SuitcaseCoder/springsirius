package com.codeup.springsirius;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "This is the landing page";
    }
    
//    @GetMapping("/home")
//    public String welcome() {
//        return "home";
//    }
//
    
}
