package com.ld.doublelist;



/**
 * @author Luisdany Pernillo
 */
public class DoubleList {

    Node first;

    public DoubleList() {
        this.first = null;
    }

    public void insertarInicio(Student student) {

        Node nuevo = new Node(student);

        if (vacia()) {
            first = nuevo;
        } else {
            nuevo.setRight(first);
            nuevo.setLeft(null);
            first = nuevo;
        }
    }

    public void insertarFinal(Student student) {

        Node nuevo = new Node(student);

        if (vacia()) {
            first = nuevo;
        } else {
            Node aux = first;
            while (aux.getRight() != null) {
                aux = aux.getRight();
            }
            aux.setRight(nuevo);
            nuevo.setLeft(aux);
        }
    }


    public boolean eliminar(Student student) {
        boolean encontrado = false;
        if (first != null) {
            Node aux = first;
            Node anterior = null;
            while (aux != null) {
                if (aux.getStudent().getId() == student.getId()) {
                    if (anterior == null) {
                        first = first.getRight();
                        aux.setRight(null);
                        aux = first;
                    } else {
                        anterior.setRight(aux.getRight());
                        aux.setRight(null);
                        aux = anterior.getRight();
                    }
                    encontrado = true;
                } else {
                    anterior = aux;
                    aux = aux.getRight();
                }
            }
        }
        return encontrado;
    }

    public void imprimir() {

        if (vacia()) {
            System.out.println("Lista Vacia");
            return;
        }

        Node aux = first;
        while (aux != null) {
            System.out.print("[Nodo: " + aux.getStudent().toString()+"] ");
            aux = aux.getRight();
        }
        System.out.println();
    }

    public boolean vacia() {
        return first == null;
    }




}
