package com.company.day27.usersRegister.controller;

import com.company.day27.usersRegister.models.CommandsEnum;

public class StartController {

    public static void printCommands() {

        System.out.println("\u001B[32m" + "INPUT "
                + CommandsEnum.CREATE_USER.ordinal() + " FOR CREATE A NEW USER" + "\n" + "INPUT "
                + CommandsEnum.DELETE_USER.ordinal() + " FOR DELETE CONTACTS" + "\n" + "INPUT "
                + CommandsEnum.GET_ALL_USER.ordinal() + " FOR VIEW ALL CONTACTS" + "\n" + "INPUT "
                + CommandsEnum.EXIT.ordinal() + " FOR LOGOUT");
    }
}
