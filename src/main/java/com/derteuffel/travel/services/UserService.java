package com.derteuffel.travel.services;

import com.derteuffel.travel.entities.User;
import com.derteuffel.travel.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserModel userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User get(Long userId){
        return userRepository.getOne(userId);
    }

    public void delete(Long userId){
        userRepository.deleteById(userId);
    }

}
