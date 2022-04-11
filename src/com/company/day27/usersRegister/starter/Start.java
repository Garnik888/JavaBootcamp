package com.company.day27.usersRegister.starter;

import com.company.day27.usersRegister.controller.StartController;
import com.company.day27.usersRegister.controller.UserControllerImpl;
import com.company.day27.usersRegister.userService.UserServiceImpl;
import com.company.day27.usersRegister.util.InputOutputFile;

import java.io.File;
import java.util.*;

public class Start {

    public static final String FILE = "src/com/company/day27/usersRegister/resources/UserList";
    private Scanner scanner = new Scanner(System.in);
    private UserControllerImpl userController = new UserControllerImpl();
    private UserServiceImpl userService = new UserServiceImpl();
    private InputOutputFile inputOutputFile = new InputOutputFile();


    public void start() {

        StartController.printCommands();

        while (true) {

            System.out.print("\u001b[34m" + "\nInput operation number -> ");
            String operation = scanner.next();

            switch (operation) {

                case "0":

                    userController.exitApp();

                case "1":

                    System.out.print("\u001b[34m" + "\nInput user ID -> ");
                    int id = scanner.nextInt();

                    System.out.print("\u001b[34m" + "\nInput user name -> ");
                    String name = scanner.next();

                    System.out.print("\u001b[34m" + "\nInput user surname -> ");
                    String surname = scanner.next();

                    System.out.print("\u001b[34m" + "\nInput user age -> ");
                    int age = scanner.nextInt();


                    userController.create(id, name, surname, age);
                    inputOutputFile.saveUsers(new File(FILE), userService.getUsersList());
                    break;

                case "2":

                    System.out.print("\u001b[38m" + "\nInput user ID -> ");
                    id = scanner.nextInt();
                    userController.delete(id);
                    inputOutputFile.saveUsers(new File(FILE), userService.getUsersList());
                    break;

                case "3":

                    userController.getAllUsers();
                    break;

                default:
                    System.out.println("\u001b[30m" + "\nIncorrect choose try again");
            }
        }
    }
}
