package com.mywahh.csrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaliciousWinBigController {

    @RequestMapping("/winBig")
    public String getWinBig(){
        return "winbig";
    }
}
