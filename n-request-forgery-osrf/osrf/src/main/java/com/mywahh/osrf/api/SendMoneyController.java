package com.mywahh.osrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendMoneyController {

    @RequestMapping("/sendMoney")
    public String sendMoney(@RequestParam double amount, @RequestParam String account, Model model){
        model.addAttribute("account", account);
        model.addAttribute("amount", amount);
        return "sendmoney";
    }
}
