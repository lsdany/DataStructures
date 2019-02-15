package com.ld.doublelist;

import java.util.Scanner;

public class Menu {

    public static int showPrincipalMenu(Scanner scanner) {

        int option = -1;

        System.out.println("************************************\n");
        System.out.println("1) Agregar Despues a la lista");
        System.out.println("2) Mostrar la lista");
        System.out.println("3) Eliminar elemento de la lista");
        System.out.println("4) Buscar elemento de la lista");
        System.out.println("5) Agregar Antes a la lista");
        System.out.println("0) Salir");
        System.out.println("************************************\n");

        return scanner.nextInt();
    }

}
