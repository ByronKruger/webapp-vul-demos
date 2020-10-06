package com.mywahh.osrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OnSiteRequestForgeryController {

    @GetMapping("/unsafeSearch")
    public String safeSearchWithSlash(@RequestParam("search") String search, Model model){
        model.addAttribute("search", search);
        return "search";
    }
}
