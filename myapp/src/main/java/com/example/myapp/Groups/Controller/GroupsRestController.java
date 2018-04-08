package com.example.myapp.Groups.Controller;

import com.example.myapp.Groups.Repository.Entity.GroupEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/groups")
public class GroupsRestController {

    @GetMapping("/{id}")
    public GroupEntity user(@PathVariable long id) {
        return new GroupEntity(id,1,"name",false, new Date());
    }

}



