package com.mycompany.repository;

import com.mycompany.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-21.
 */
public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);
    User findByLastname(String lastname);
    User findById(long id);
    User findByEmail(String email);


}
