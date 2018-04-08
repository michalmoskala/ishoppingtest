package com.example.myapp.Users.Controller;


import com.example.myapp.Users.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersRestController {


    @GetMapping("/{id}")
    public User user(@PathVariable int id) {
        System.out.println("==== in greeting ====");
        return new User(id,"mihu","m@m.c","admin1");
    }

}


