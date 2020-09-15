package com.artistPage.Capstone.models;

import javax.persistence.Entity;

@Entity
public class Image extends AbstractEntity {

    private int id;
    private static int nextId = 1;




    public Image(){
        this.id = nextId;
        nextId++;
    }
}
