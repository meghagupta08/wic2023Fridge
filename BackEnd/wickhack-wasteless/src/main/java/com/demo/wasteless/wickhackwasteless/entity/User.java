package com.demo.wasteless.wickhackwasteless.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private Integer userid;

    @Column(name="emailid")
    private String emailid;

    @Column(name="password")
    private String password;

    @Column(name="favourite")
    private String favourite;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    Set<UserItemList> items = new HashSet<>();

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Set<UserItemList> getItems() {
        return items;
    }

    public void setItems(Set<UserItemList> items) {
        this.items = items;
    }

    public User() {
    // Default constructor
    }
}
