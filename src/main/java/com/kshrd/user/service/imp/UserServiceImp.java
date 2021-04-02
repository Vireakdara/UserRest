package com.kshrd.user.service.imp;

import com.kshrd.user.repository.UserRepository;
import com.kshrd.user.repository.dto.UserDto;
import com.kshrd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto insert(UserDto user) {
        boolean isInserted = userRepository.insert(user);
        if (isInserted)
            return user;
        else
            return null;

        }
    }

