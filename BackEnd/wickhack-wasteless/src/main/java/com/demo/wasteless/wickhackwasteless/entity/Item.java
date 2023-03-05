package com.demo.wasteless.wickhackwasteless.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="itemid")
    private Integer itemid;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryid")
    private Category category;

    @Column(name="itemname")
    private String itemname;

    @Column(name="itemexpiry")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Timestamp itemexpiry;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    Set<UserItemList> users = new HashSet<>();

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Timestamp getItemexpiry() {
        return itemexpiry;
    }

    public void setItemexpiry(Timestamp itemexpiry) {
        this.itemexpiry = itemexpiry;
    }

    public Set<UserItemList> getUsers() {
        return users;
    }

    public void setUsers(Set<UserItemList> users) {
        this.users = users;
    }

    public Item() {
        //Default constructor
    }
}
