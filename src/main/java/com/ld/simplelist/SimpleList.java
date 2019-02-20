package com.ld.simplelist;

import java.util.Scanner;

public class SimpleList {

    Node pointer = null;

    public void add(Human value){
        Node node = new Node(value, pointer);
        pointer = node;
    }

    public boolean delete(){
        return false;
    }


    public void show(){

        if(pointer != null){
            Node tempNode = pointer;
            while(tempNode != null){
                System.out.println(tempNode.getData().toString());
                tempNode = tempNode.getNext();
            }
        }else
            System.out.println("Empty List");

    }

    public void search(){

    }

    public static void main(String[] args) {

        Scanner scanMenu = new Scanner(System.in);
        boolean cont= true;
        Human student = null;
        SimpleList list = new SimpleList();

        do {

            int option = Menu.getMenuPrincipal(scanMenu);

            switch (option){
                case 1:
                    student = Menu.getMenuFillHuman(scanMenu);
                    list.add(student);
                    break;
                case 0: cont = false;
                    break;
                case 2: list.show();
                break;
                    default: cont = false;
            }


        }while (cont);
        scanMenu.close();

    }
}
