package com.demo.wasteless.wickhackwasteless.service;

import com.demo.wasteless.wickhackwasteless.entity.Item;
import com.demo.wasteless.wickhackwasteless.repo.WastelessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WastelessService {

    @Autowired
    private WastelessRepo wastelessrepo;

    public List<Item> getItems(){
        List<Item> itemList = wastelessrepo.findAll().stream().toList();
        return itemList;
    }

    public Item saveItem(Item item){
        Item newItem = wastelessrepo.save(item);
        return newItem;
    }
}