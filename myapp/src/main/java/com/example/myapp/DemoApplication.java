package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//      return "Sirotsskin jest lepszy od kubicy";
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}