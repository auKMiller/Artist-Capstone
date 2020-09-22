package com.artistPage.Capstone.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Gallery extends AbstractEntity {

    @ManyToOne
    @JoinColumn
    private List<Image> images = new ArrayList<>();

    public Gallery(List<Image> images){
        super();
        this.images = images;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
