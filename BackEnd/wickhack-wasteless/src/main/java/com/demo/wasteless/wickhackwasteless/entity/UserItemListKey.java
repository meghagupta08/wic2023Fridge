package com.demo.wasteless.wickhackwasteless.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserItemListKey {

    @Column(name = "userid")
    Integer userid;

    @Column(name = "itemid")
    Integer itemid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public UserItemListKey() {
    }
}
