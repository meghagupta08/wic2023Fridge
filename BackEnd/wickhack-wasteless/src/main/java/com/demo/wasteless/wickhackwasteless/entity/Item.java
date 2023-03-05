package com.demo.wasteless.wickhackwasteless.entity;

import jakarta.persistence.*;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="itemid")
    private int itemid;

    @Column(name="categoryid")
    private int categoryid;

    @Column(name="itemname")
    private String itemname;

    @Column(name="itemexpiry")
    private String itemexpiry;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemexpiry() {
        return itemexpiry;
    }

    public void setItemexpiry(String itemexpiry) {
        this.itemexpiry = itemexpiry;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemid=" + itemid +
                ", categoryid=" + categoryid +
                ", itemname='" + itemname + '\'' +
                ", itemexpiry='" + itemexpiry + '\'' +
                '}';
    }
}
