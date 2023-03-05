package com.demo.wasteless.wickhackwasteless.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usercategorylist")
public class UserItemList {

    @EmbeddedId
    UserItemListKey id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("userid")
    User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("itemid")
    Item item;

    public UserItemListKey getId() {
        return id;
    }

    public void setId(UserItemListKey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public UserItemList() {
        //Default constructor
    }
}
