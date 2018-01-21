package com.mycompany.interfaces;

import com.mycompany.model.User;

/**
 * Created by HP on 2018-01-21.
 */
public interface UserService {

    public User findByUserEmail(String email);
    public void createUser(User user);

}
