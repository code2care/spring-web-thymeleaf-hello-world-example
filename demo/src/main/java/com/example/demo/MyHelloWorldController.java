package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyHelloWorldController {

    @GetMapping("/hello-world")
    public String greeting() {
        return "helloWorld";
    }

}
