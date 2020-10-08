package com.mywahh.osrf.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UnsafeController {

    @GetMapping("/unsafeSearch")
    public String unsafeSearchWithSlash(@RequestParam("search") String search, Model model){
        model.addAttribute("search", search);
        return "search";
    }

//    @PostMapping("/unsafeUsernameUpdate")
//    public String unsafeProfileUsernameUpdate(@RequestParam(name = "username") String username, Model model){
//        model.addAttribute("username", username);
//        return "profile";
//    }

    @GetMapping("/unsafeQuestion")
    public String getQuestion(){
        return "question";
    }

    @PostMapping("/unsafeQuestion")
    public String postQuestion(@RequestParam String question, Model model){
        model.addAttribute("question", question);
        return "question";
    }
}
