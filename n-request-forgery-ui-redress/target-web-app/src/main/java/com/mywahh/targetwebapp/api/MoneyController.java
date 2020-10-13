package com.mywahh.targetwebapp.api;

import org.apache.tomcat.util.http.SameSiteCookies;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MoneyController {

    @PostMapping("/sendMoney")
    public String sendMoney(@RequestParam String account, @RequestParam String amount, Model model){
        model.addAttribute("account", account);
        model.addAttribute("amount", amount);
        return "transactionSummary";
    }

    @GetMapping("/sendMoney")
    public String sendMoney(HttpServletRequest request){
        return "sendMoney";
    }
}
