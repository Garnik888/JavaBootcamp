package com.company.day27.usersRegister.controller;


import com.company.day27.usersRegister.models.User;
import com.company.day27.usersRegister.userService.UserServiceImpl;
import com.company.day27.usersRegister.validator.Validators;

import java.util.ArrayList;
import java.util.List;


public class UserControllerImpl {

    private UserServiceImpl userService = new UserServiceImpl();

    /**
     * Create user anth retur is created
     *
     * @param id   int
     * @param name    String
     * @param surname String
     * @param age     int
     */
    public void create(int id, String name, String surname, int age) {

        if (Validators.isAgeCorrect(age) && Validators.isNameSurnameCorrect(name)
                && Validators.isNameSurnameCorrect(surname)) {
            User user = new User(id, name, surname, age);

            userService.add(user);
        }
    }

    /**
     * Delete user
     *
     * @param userId int
     */
    public void delete(int userId) {

        userService.remove(userId);
    }

    /**
     * Get all users
     */
    public void getAllUsers() {
        userService.list();
    }

    /**
     * Exit program
     */
    public void exitApp() {

        userService.exit();
    }
}
