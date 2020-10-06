package com.mywahh.osrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrivilegedFunctionalityController {

    @RequestMapping("/privilegedAction")
    public String privilegedAction(){
        System.out.println("User is induced to perform unintended action.");
        return "hacked";
    }
}