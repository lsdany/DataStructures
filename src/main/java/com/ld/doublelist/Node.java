package com.ld.doublelist;


/**
 * @author luisdany pernillo
 */
public class Node {

    private Student student;
    private Node right;
    private Node left;

    public Node (Student student){
        this.student = student;
        this.right = null;
        this.left = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }


    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
