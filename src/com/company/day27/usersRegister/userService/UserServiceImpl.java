package com.company.day27.usersRegister.userService;

import com.company.day27.usersRegister.models.User;
import com.company.day27.usersRegister.util.InputOutputFile;

import java.io.File;
import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    public static final String FILE = "src/com/company/day27/usersRegister/resources/UserList";
    private InputOutputFile inputOutputFile = new InputOutputFile();

    private ArrayList<User> usersList = inputOutputFile.getUsersFromFile(new File(FILE));

    public UserServiceImpl() {

    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public void add(User user) {
        for (User users : usersList) {

            if (users.getId() == user.getId()) {

                System.out.println("\nUser ID is repeat create is not successfully");
                return;
            }
        }

        usersList.add(user);
        System.out.println("\nUser create is successfully");
    }

    @Override
    public void remove(int index) {

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId() == index) {

                usersList.remove(i);
                System.out.println("\nUser delete is successfully");
                return;
            }
        }
    }

    @Override
    public void list() {

        for (User user : usersList) {

            System.out.println(user.toString());
        }
    }

    @Override
    public void exit() {

        System.exit(0);
    }

    public void addInputFile() {


    }
}
