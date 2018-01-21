package com.mycompany.service;

import com.mycompany.interfaces.UserService;
import com.mycompany.model.Roles;
import com.mycompany.model.User;
import com.mycompany.repository.RoleRepository;
import com.mycompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findByUserEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(
                user.getPassword()
        ));
        user.setActive(1);
        Roles userRole = roleRepository.findByRole("ADMIN");
        user.setRolesSet(
                new HashSet<>(Arrays.asList(userRole))
        );
        userRepository.save(user);
    }
}
