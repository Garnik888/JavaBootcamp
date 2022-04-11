package com.company.day27.usersRegister.util;

import com.company.day27.usersRegister.models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFile {


   public void InputOutputFile() {
   }

   public void saveUsers(File filename, ArrayList<User> users) {

      try (ObjectOutputStream oIS = new ObjectOutputStream(new FileOutputStream(filename))) {

         oIS.writeObject(users);
      } catch (IOException e) {
          e.printStackTrace();
      }
   }

   public ArrayList<User> getUsersFromFile(File filename) {

      ArrayList<User> arrayList = new ArrayList<>();

      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

         arrayList = (ArrayList<User>) ois.readObject();

         return arrayList;

      } catch (Exception e) {

//         e.printStackTrace();
      }

      System.out.println(arrayList);
      return arrayList;

   }
}
