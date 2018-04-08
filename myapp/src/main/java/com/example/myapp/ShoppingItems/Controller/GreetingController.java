package com.example.myapp.ShoppingItems.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.myapp.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    private static final String template = "Henlo, %s!";
    private final AtomicLong counter = new AtomicLong();

   // @CrossOrigin(origins = "https://ishopping-beta.firebaseapp.com")
    @GetMapping("/api")
    public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
