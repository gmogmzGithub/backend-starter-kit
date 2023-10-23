package com.backendfoundation.service;

import com.backendfoundation.persistance.entities.User;
import com.backendfoundation.persistance.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(UUID id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); // Returns the user if found, otherwise returns null
    }

    @Transactional
    public void someDatabaseOperation(User user) {
        // logic that interacts with the database
    }
}
