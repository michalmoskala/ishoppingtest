package com.example.myapp.ShoppingLists.Controller;


import com.example.myapp.ShoppingLists.Repository.Entity.ProductEntity;
import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListsRestController {


    @GetMapping("/{id}")
    public ShoppingListEntity ShoppingListEntity(@PathVariable long id) {

        ArrayList<ProductEntity> abc = new ArrayList<>();
        abc.add(new ProductEntity(1,1,id,1,"maka","kg",2,true,false,"2008-01-01"));
        abc.add(new ProductEntity(2,1,id,1,"cukier","kg",3,true,false,"1998-01-01"));
        abc.add(new ProductEntity(3,1,id,1,"sul","kg",4,true,false,"1993-01-01"));


        return new ShoppingListEntity(id,1,"lista",false,"2001-09-11",abc);
    }

}


