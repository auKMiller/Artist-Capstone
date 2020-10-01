package com.artistPage.Capstone.models;

import com.sun.istack.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;


@Entity
public class User extends AbstractEntity {

    //Have had issues in the past with importing the wrong @NotNull. Or it didn't like NotNull and wanted NotBlank.

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    public User(){}

    public User(String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);
        super.setName(username);
    }
    public String getUsername(){
        return username;
    }
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public boolean isMatchingPassword(String password){
        return encoder.matches(password, pwHash);
    }
}
