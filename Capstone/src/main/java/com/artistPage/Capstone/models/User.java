package com.artistPage.Capstone.models;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

    private String username;

    private String pwHash;

    public User(){}

    public User(String username, String password){
        this.username = username;
//        this.pwHash = encoder.encode(password);
    }
    public String getUsername(){
        return username;
    }
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public boolean isMatchingPassword(String password){
//        return encoder.matches(password, pwHash);
        return true;
    }
}
