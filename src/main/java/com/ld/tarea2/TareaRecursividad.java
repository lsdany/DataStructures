/**
 *
 * Desarrolle lo que se le indica a continuación (Los tres problemas resuelvalos en un solo archivo):
 *
 * Problema 2: Crear un nuevo método recursivo que busque en un Arreglo que almacena números en cada celda cuál es el
 * valor menor.
 *
 * Problema 3: Elaborar práctica de ejercicios utilizando Java que resuelva mediante la técnica de recursividad,
 * la sumatoria de los dígitos de un número. El número será proporcionado como argumento al programa, por lo que
 * deberá utilizar la variable args[] del método main.
 *
 * Ejercicio 4: Consultar en las fuentes (Capítulo 5 del libro) el tema de recursividad y en una hoja con sus propias
 * palabras definir qué es, listar las ventajas y desventajas de su uso y en otra hoja un cuestionario con 10 preguntas
 * y su respectiva respuesta.
 *
 *
 * @Author luisdany pernillo
 * Tarea n. 2
 *
 *
 */


package com.ld.tarea2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TareaRecursividad {


    /*
    Problema 1

    Programe un método recursivo que transforme un número expresado en notación binaria a un número entero.

     */

    private int decimalValue = 0;

    public int binaryToDecimalRecursive(String binary){

        String valueString = ""+binary.charAt(0);
        int index = decimalValue * 2 + Integer.parseInt(valueString);
        decimalValue = index;

        if (binary.length() > 1)
            binaryToDecimalRecursive(binary.substring(1));

        return decimalValue;
    }


    /*
    Problema 2

    Problema 2: Crear un nuevo método recursivo que busque en un Arreglo que almacena
    números en cada celda cuál es el valor menor.

     */

    private int minour = 0;

    public int getMinorValue(List<Integer> values){

        if(!values.isEmpty()){

            if(minour == 0){
                minour = values.get(0);
            }

            if(minour > values.get(0))
                minour = values.get(0);
            values.remove(0);

            getMinorValue(values);
        }
        return minour;
    }


    /*
        problema 3

        Elaborar práctica de ejercicios utilizando Java que resuelva mediante la técnica de recursividad,
        la sumatoria de los dígitos de un número. El número será proporcionado como argumento al programa,
        por lo que deberá utilizar la variable args[] del método main.

     */

    private int sumatoria = 0;
    public int sumDigitosRecursivo(String number){

        if(number.length() > 0){
            String[] digitos =  number.split("");
            StringBuilder nuevaCadena = new StringBuilder();
            for(int i = 1 ; i < number.length() ; i++){
                nuevaCadena.append(digitos[i]);
            }
            int num = Integer.parseInt(digitos[0]);
            return sumatoria = num + sumDigitosRecursivo(nuevaCadena.toString());
        }else
            return sumatoria;
    }


    public static void main(String[] args) {

        System.out.println("Tarea de recursividad\n");
        System.out.println("Problema uno, conversion de un numero binario a decimal");

        TareaRecursividad recursivo = new TareaRecursividad();
        System.out.println("Numero binario = 1011001");
        System.out.println("Decimal = "+recursivo.binaryToDecimalRecursive("1011001"));

        System.out.println("Problema dos, el valor menor de una lista");

        List<Integer> arrayInt = new LinkedList<>(Arrays.asList(5,48,6,9,100,2,9,57,8));
        System.out.println("Arreglo: "+arrayInt.toString());
        int minValue = recursivo.getMinorValue(arrayInt);
        System.out.println("Valor menor: "+minValue);

        if(args.length > 0){
            int sumaRecursiva = recursivo.sumDigitosRecursivo(args[0]);
            System.out.println("Valor recibido: "+args[0]);
            System.out.println("suma recursiva: "+sumaRecursiva);
        }else
            System.out.println("No se ingreso ningun parametro al iniciar el programa no se ejecutara el tercer problema");

    }

}
