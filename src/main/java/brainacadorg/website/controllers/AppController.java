package brainacadorg.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String home() {
        return "home/index";
    }

    @GetMapping("/profile")
    public String profile() {
        return "home/profile";
    }
}
