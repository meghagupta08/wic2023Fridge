package com.demo.wasteless.wickhackwasteless.controller;

import com.demo.wasteless.wickhackwasteless.entity.*;
import com.demo.wasteless.wickhackwasteless.service.WastelessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WastelessController {

    @Autowired
    private WastelessService wastelessService;

    @GetMapping("/users")
    Iterable<User> getAllUser(){
        return wastelessService.getAllUser();
    }

    @GetMapping("/user")
    User getUser(@RequestParam Integer userid){
        return wastelessService.getUser(userid);
    }

    @PostMapping("/insertUser")
    User saveUser(@RequestBody User user){
        User newUser = wastelessService.saveUser(user);
        return newUser;
    }

    @GetMapping("/categories")
    Iterable<Category> getAllCategory(){
        return wastelessService.getAllCategory();
    }

    @PostMapping("/insertCategory")
    Category saveCategory(@RequestBody Category category){
        Category newCategory = wastelessService.saveCategory(category);
        return newCategory;
    }

    @GetMapping("/items")
    Iterable<Item> getAllItems(){
        return wastelessService.getItems();
    }

    @GetMapping("/item")
    Item getItem(@RequestParam Integer itemid){
        return wastelessService.getItem(itemid);
    }

    @PostMapping("/insertItem")
    Item saveItem(@RequestBody Item item){
        Item newItem = wastelessService.saveItem(item);
        return newItem;
    }

    @GetMapping("/usersitemlist")
    Iterable<UserItemList> getAllUserItemList(){
        return wastelessService.getAllUserItemList();
    }

    @PostMapping("/insertUserItemList")
    UserItemList saveUser(@RequestParam Integer userid, @RequestParam Integer itemid){
        UserItemListKey userItemListKey = new UserItemListKey();
        userItemListKey.setItemid(itemid);
        userItemListKey.setUserid(userid);
        UserItemList userItemList = new UserItemList();
        userItemList.setId(userItemListKey);
        userItemList.setUser(wastelessService.getUser(userid));
        userItemList.setItem(wastelessService.getItem(itemid));
        UserItemList newUserItemList = wastelessService.saveUserItemList(userItemList);
        return newUserItemList;
    }

}
