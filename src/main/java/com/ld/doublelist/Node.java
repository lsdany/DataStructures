package com.ld.doublelist;

import lombok.Getter;
import lombok.Setter;


public class Node {

    Node right;
    Node left;
    @Getter
    private Student student;

    public Node(Student student, Node right, Node left){

        this.student = student;
        this.right = right;
        this.left = left;

    }

}
