package com.artistPage.Capstone.models.data;

import com.artistPage.Capstone.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
