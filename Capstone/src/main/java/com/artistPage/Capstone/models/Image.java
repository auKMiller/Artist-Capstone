package com.artistPage.Capstone.models;

public class Image{

    private int id;
    private static int nextId = 1;




    public Image(){
        this.id = nextId;
        nextId++;
    }
}
