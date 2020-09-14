package com.artistPage.Capstone.models;


public class User {

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
