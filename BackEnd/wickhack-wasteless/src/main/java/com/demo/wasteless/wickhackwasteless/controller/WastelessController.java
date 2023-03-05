package com.demo.wasteless.wickhackwasteless.controller;

import com.demo.wasteless.wickhackwasteless.entity.Item;
import com.demo.wasteless.wickhackwasteless.service.WastelessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WastelessController {

    @Autowired
    private WastelessService wastelessService;

    @GetMapping("/items")
    List<Item> getItems(){
        List<Item> itemList = wastelessService.getItems();
        return itemList;
    }

    @PostMapping("/insertItem")
    Item saveItem(@RequestBody Item item){
        Item newItem = wastelessService.saveItem(item);
        return newItem;
    }

}
