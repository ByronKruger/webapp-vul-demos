package com.mywahh.osrf.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class OnSiteRequestForgeryController {

    @GetMapping("/unsafeSearch/**")
    public String unsafeSearch(Model model, HttpServletRequest request){
        String search = request.getRequestURI()
                .split(request.getContextPath() + "/unsafeSearch/")[1];
        System.out.println(search);
        model.addAttribute("search", search);
        return "search";
    }

    @GetMapping("/safeSearchWithoutSlash/{search}")
    public String safeSearchWithoutSlash(@PathVariable String search, Model model){
        model.addAttribute("search", search);
        return "search";
    }

    @GetMapping("/safeSearchWithSlash")
    public String safeSearchWithSlash(@RequestParam("search") String search, Model model){
        model.addAttribute("search", search);
        return "search";
    }
}
