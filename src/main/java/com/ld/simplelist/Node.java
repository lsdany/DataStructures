/**
 * Node class using generic data type
 */


package com.ld.simplelist;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Node<E> {

    private Node next;
    private E data;

    public Node(E data, Node next){
        this.data = data;
        this.next = next;
    }

}
