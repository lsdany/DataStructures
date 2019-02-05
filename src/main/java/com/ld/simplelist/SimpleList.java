package com.ld.simplelist;

public class SimpleList {

    Node pointer = null;

    public void add(HumanType value){
        Node node = new Node(value, pointer);
        pointer = node;
    }

    public boolean delete(){
        return false;
    }


    public void show(){

    }

    public void search(){

    }

    public static void main(String[] args) {

        Student student = new Student();

    }
}
