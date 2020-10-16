package com.mywahh.htmlinjection.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UnsafeFormSubmissionController {

    @GetMapping("/sendMoney")
    public String getSendMoney(@RequestParam String account, Model model){
        // save account
        model.addAttribute("account", account);
        return "formSubmission";
    }

    @PostMapping("/sendMoney")
    public String sendMoney(@RequestParam String amount){
        // send money
        return "formSubmission";
    }

}
