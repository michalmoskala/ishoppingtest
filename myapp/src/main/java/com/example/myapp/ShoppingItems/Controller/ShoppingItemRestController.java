package com.example.myapp.ShoppingItems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class ShoppingItemRestController {


    @RequestMapping(path="/greeting",method= RequestMethod.GET)
    public String helloWorld(){
        return "Hello world!";
    }

}
