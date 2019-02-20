package com.ld.simplelist;

import java.util.Scanner;

public class Menu {

    public static int getMenuPrincipal(Scanner scanMenu){
        int option = 0;
        System.out.println("************************************************");
        System.out.println("1. Add List");
        System.out.println("2. Show List");
        System.out.println("3. Search List");
        System.out.println("4. Delete List");
        System.out.println("0. exit");
        option = scanMenu.nextInt();
        return option;
    }

    public static Human getMenuFillHuman(Scanner scanMenu) {
        Human human = null;

        System.out.println("Name:");
        String name = scanMenu.next();
        System.out.println("Id:");
        String id = scanMenu.next();
        System.out.println("Age:");
        String age = scanMenu.next();

        human = Student.builder().name(name).id(id).age(Integer.parseInt(age)).build();

        return human;
    }

}
