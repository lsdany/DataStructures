/**
 *
 * Desarrolle lo que se le indica a continuación (Los tres problemas resuelvalos en un solo archivo):
 *
 * Problema 1: Programe un método recursivo que transforme un número expresado en notación binaria a un número entero.
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
     */

    public void binaryToDecimalNormal(String binary){

        char[] binaryArray = binary.toCharArray();
        //System.out.println(binaryArray);

        int decimalValue = 0;

        for (int i = 0; i < binaryArray.length; i++) {

            //System.out.println(binaryArray[i]);
            int value = Integer.parseInt(""+binaryArray[i]);

            int index = (decimalValue * 2) + value;
            //System.out.println(index);

            decimalValue = index;


        }

        System.out.println("-->"+decimalValue);

    }


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



    public static void main(String[] args) {
        TareaRecursividad recursivo = new TareaRecursividad();
        System.out.println("Numero binario = 1011001");
        System.out.println("Decimal = "+recursivo.binaryToDecimalRecursive("1011001"));

        List<Integer> arrayInt = new LinkedList<>(Arrays.asList(5,48,6,9,100,2,9,57,8));
        System.out.println("Arreglo: "+arrayInt.toString());
        System.out.println(recursivo.getMinorValue(arrayInt));


    }

}
