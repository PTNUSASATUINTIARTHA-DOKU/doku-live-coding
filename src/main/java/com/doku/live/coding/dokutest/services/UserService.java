package com.doku.live.coding.dokutest.services;

import com.doku.live.coding.dokutest.entity.User;
import com.doku.live.coding.dokutest.exceptions.UserExistException;
import com.doku.live.coding.dokutest.exceptions.UserNotFoundException;
import com.doku.live.coding.dokutest.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        /**
         * Logic to get all users
         */
        return userRepository.findAll();
    }

    public User createUser(User user) throws UserExistException {
        /**
         * Logic to create user
         */
        return null;
    }

    public Optional<User> getUserById(Long id) throws UserNotFoundException {
        /**
         * Logic to get user by id
         */
        return null;
    }

    public User updateUserById(Long id, User user) throws UserNotFoundException {
        /**
         * Logic to update user by id
         */
        return null;
    }

    public void deleteUserById(Long id) {
        /**
         * Logic to delete user by id
         */
    }

    public User getUserByUsername(String username) {
        /**
         * Logic to get user by user name
         */
        return null;
    }

}
