package com.repath.crud.service;

import com.repath.crud.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);


    void deleteUserById(int userId);

    List<User> getAllUsers();

    List<User> getUsersByCompanyName(String company);

}
