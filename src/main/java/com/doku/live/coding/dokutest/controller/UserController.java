package com.doku.live.coding.dokutest.controller;

import com.doku.live.coding.dokutest.entity.User;
import com.doku.live.coding.dokutest.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUSers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder builder) {
        /**
         * Controller to create users
         */
        return null;
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        /**
         * Controller to get user by id
         */
        return null;
    }

    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
        /**
         * Controller to update user by id
         */
        return null;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        /**
         * Controller to delete user by id
         */
    }

    @GetMapping("/users/byusername/{username}")
    public User getUserByUserName(@PathVariable("username") String username) {
        /**
         * Dontroller to get user by user name
         */
        return null;
    }
}
