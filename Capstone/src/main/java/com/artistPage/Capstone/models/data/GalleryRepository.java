package com.artistPage.Capstone.models.data;

import com.artistPage.Capstone.models.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends CrudRepository<Image, Integer> {
}
