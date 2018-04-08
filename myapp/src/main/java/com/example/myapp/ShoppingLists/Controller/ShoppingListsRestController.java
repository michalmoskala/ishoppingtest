package com.example.myapp.ShoppingLists.Controller;


import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListsRestController {


    @GetMapping("/{id}")
    public ShoppingListEntity ShoppingListEntity(@PathVariable long id) {
        System.out.println("==== in greeting ====");
        return new ShoppingListEntity(id,1,"poproszesul",false,"2001-09-11");
    }

}


