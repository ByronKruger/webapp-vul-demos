package com.mywahh.csrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaliciousController {

    @RequestMapping("/malicious")
    public String getWinBig(){
        return "malicious";
    }
}
