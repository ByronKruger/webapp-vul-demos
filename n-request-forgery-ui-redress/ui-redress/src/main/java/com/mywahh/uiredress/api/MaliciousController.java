package com.mywahh.uiredress.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaliciousController {

    @GetMapping("/malicious")
    public String getMalicious(){
        return "malicious";
    }
}
