package com.dk.ems.Service;

import com.dk.ems.Entity.User;
import com.dk.ems.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void createUser(String name, String email, String passwd) {
        User user = new User(name,email,passwd);
        userRepo.save(user);
    }

    public boolean findEmail(String email) {
        User user = userRepo.findByEmail(email);
        return user != null;
    }
}
