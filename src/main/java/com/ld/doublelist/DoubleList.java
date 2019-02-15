/**
 * Lista doblemente enlazada
 *
 * Los punteros first y last apuntan al primer y al ultimo nodo respectivamente,
 * sus apuntadores left son null, solo se utiliza el valor right para señalar al
 * nodo requerido.
 *
 */


package com.ld.doublelist;

import java.util.Scanner;

/**
 * @author Luisdany Pernillo
 */
public class DoubleList {

    private Node first = null;
    private Node last = null;

    private void addAfter(Student student){

        if(first == null && last == null){
            Node node = new Node(student,null, null);
            first.right = node;
            last.right = node;
        }else{
            Node node = new Node(student, last, null);
            last.right.left = node;
            last.right = node;
        }

    }

    private void addBefore(Student student) {

        if(first == null && last == null){
            Node node = new Node(student,null, null);
            first.right = node;
            last.right = node;
        }else{
            Node node = new Node(student, null, first);
            first.right.right = node;
            first.right = node;
        }

    }


    private void search(){

    }

    private void delete(){

    }

    private void show(){
        if(first != null && last != null){
            Node nodeTemp = last;

            while(nodeTemp.right != null){
                System.out.println(nodeTemp.right.getStudent().toString());
            }
        }
    }

    public static void main(String[] args) {

        DoubleList list = new DoubleList();

        Student student1 = Student.builder().id("1").name("luis").build();
        Student student2 = Student.builder().id("2").name("dany").build();
        Student student3 = Student.builder().id("3").name("israel").build();
        Student student4 = Student.builder().id("4").name("rosi").build();

        list.addAfter(student1);
        list.show();
        list.addAfter(student2);
        list.show();
        list.addAfter(student3);
        list.show();
        list.addAfter(student4);
        list.show();

//        try(Scanner scanner = new Scanner(System.in)){
//
//            int option = -1;
//            while(option != 0){
//                option = Menu.showPrincipalMenu(scanner);
//
//                switch (option){
//                    case 1 : list.addAfter(null);
//                    break;
//                    case 2 : list.show();
//                    break;
//                    case 3 : list.delete();
//                    break;
//                    case 4 : list.search();
//                    break;
//                    case 5 : list.addBefore(null);
//                    break;
//                    case 0 : break;
//                    default: break;
//                }
//
//            }
//
//        }


    }




}
