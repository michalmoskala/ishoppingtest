package com.example.myapp.ShoppingLists.Controller;


import com.example.myapp.Product;
import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListsRestController {


    @GetMapping("/{id}")
    public ShoppingListEntity ShoppingListEntity(@PathVariable long id) {

        ArrayList<Product> abc = new ArrayList<>();
        abc.add(new Product(1,"nazwa1"));
        abc.add(new Product(1,"nazwa2"));

        return new ShoppingListEntity(id,1,"poproszesul",false,"2001-09-11",abc);
    }

}


