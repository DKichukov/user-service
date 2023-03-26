package com.security.userservice.service;

import com.security.userservice.model.Role;
import com.security.userservice.model.User;

import java.util.List;


public interface UserService {
    User save(User user);
    Role save(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();

}
