package com.ld.doublelist;

/**
 * @author luisdany pernillo
 */

public class Menu {

    public static void main(String[] args) {

        DoubleList lista = new DoubleList();

        //Creacion del primero estudiante
        Student studentLuis = Student.builder().id("9090-13-5465").name("Luis").build();
        //Creacion del segundo estudiante
        Student studentJose = Student.builder().id("9090-15-2166").name("Jose").build();
        //Creacion del tercer estudiante
        Student studentCarlos = Student.builder().id("9090-18-65689").name("Carlos").build();
        //Creacion del cuarto estudiante
        Student studentPedro = Student.builder().id("9090-19-6568").name("Pedro").build();


        lista.insertarFinal(studentLuis);
        lista.imprimir();
        lista.insertarFinal(studentJose);
        lista. imprimir();
        lista.insertarFinal(studentCarlos);
        lista.imprimir();

        lista.eliminar(studentJose);
        lista.imprimir();

        lista.insertarInicio(studentCarlos);
        lista.imprimir();





    }

}
