package com.example.myapp.ShoppingLists.Controller;


import com.example.myapp.ShoppingLists.Repository.Entity.ProductEntity;
import com.example.myapp.ShoppingLists.Repository.Entity.ShoppingListEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/shopping-lists")
public class ShoppingListsRestController {


    @GetMapping("/{id}")
    public ShoppingListEntity ShoppingListEntity(@PathVariable long id) {

        ArrayList<ProductEntity> abc = new ArrayList<>();
        abc.add(new ProductEntity(1,1,id,1,"maka","kg",2,true,false, new Date()));
        abc.add(new ProductEntity(2,1,id,1,"cukier","kg",3,true,false,new Date(300)));
        abc.add(new ProductEntity(3,1,id,1,"sul","kg",4,true,false,new Date(2001,10,10)));


        return new ShoppingListEntity(id,1,"lista",false,new Date(), abc);
    }

}


