package com.demo.wasteless.wickhackwasteless.service;

import com.demo.wasteless.wickhackwasteless.entity.Category;
import com.demo.wasteless.wickhackwasteless.entity.Item;
import com.demo.wasteless.wickhackwasteless.entity.User;
import com.demo.wasteless.wickhackwasteless.entity.UserItemList;
import com.demo.wasteless.wickhackwasteless.repo.CategoryRepo;
import com.demo.wasteless.wickhackwasteless.repo.ItemRepo;
import com.demo.wasteless.wickhackwasteless.repo.UserItemListRepo;
import com.demo.wasteless.wickhackwasteless.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WastelessService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserItemListRepo userItemListRepo;

    public Iterable<User> getAllUser(){
        return userRepo.findAll();
    }

    public User getUser(Integer id){
        return userRepo.findById(id).get();
    }

    public User saveUser(User user){
        User newUser = userRepo.save(user);
        return newUser;
    }

    public Iterable<UserItemList> getAllUserItemList(){
        return userItemListRepo.findAll();
    }

    public UserItemList saveUserItemList(UserItemList user){
        UserItemList newUserItemList = userItemListRepo.save(user);
        return newUserItemList;
    }

    public Iterable<Category> getAllCategory(){
        return categoryRepo.findAll();
    }

    public Category saveCategory(Category category){
        Category newCategory = categoryRepo.save(category);
        return newCategory;
    }

    public Iterable<Item> getItems(){
        return itemRepo.findAll();
    }

    public Item getItem(Integer id){
        return itemRepo.findById(id).get();
    }

    public Item saveItem(Item item){
        Item newItem = itemRepo.save(item);
        return newItem;
    }
}