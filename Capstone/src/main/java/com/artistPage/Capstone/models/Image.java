package com.artistPage.Capstone.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Image extends AbstractEntity {

    @ManyToOne
    private Gallery gallery;

    public Image(){

    }



}
