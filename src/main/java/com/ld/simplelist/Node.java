package com.ld.simplelist;

public class Node {

    private Node next;
    private HumanType data;

    public Node(HumanType data, Node next){
        this.data = data;
        this.next = next;
    }

}
