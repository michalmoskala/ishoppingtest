package com.example.myapp.Users.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.myapp.Greeting;
import com.example.myapp.Users.User;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersRestController {
//
//    @GetMapping("/users-javaconfig")
//    public Greeting usersWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
//        System.out.println("==== in greeting ====");
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }


    @GetMapping("/{id}")
    public User user(@PathVariable int id) {
        System.out.println("==== in greeting ====");
        return new User(id,"mihu","m@m.c","admin1");
    }

}


