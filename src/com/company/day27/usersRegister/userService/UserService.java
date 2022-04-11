package com.company.day27.usersRegister.userService;

import com.company.day27.usersRegister.models.User;

import java.io.File;

public interface UserService {

    void add(User user);

    void remove(int index);

    void list();

    void exit();
}
