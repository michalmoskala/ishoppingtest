package com.example.myapp.Users.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.myapp.Greeting;
import com.example.myapp.Users.User;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersRestController {

    @GetMapping("/users-javaconfig")
    public Greeting usersWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    private static final String template = "Henlo, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@CrossOrigin(origins = "https://ishopping-beta.firebaseapp.com")
    @GetMapping("/users")
    public User user(@RequestParam(required=true) int id) {
        System.out.println("==== in greeting ====");
        return new User(id,"mihu","m@m.c","admin1");
    }

}


