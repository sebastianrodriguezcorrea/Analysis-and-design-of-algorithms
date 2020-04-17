/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class NumeroMenorVectorRecursividad {

    //Método principal (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Declaración del Scanner para pedir datos al usuario por consola.
        System.out.println("Cuantos números quiere ingresar en el vector?");
        int tamaño = input.nextInt();// Declarando el tamaño del vector, este se solicita al usuario por consola.
        int[] vector = new int[tamaño];// Estableciendo tamaño en la creación del vector.

        System.out.println("Llenando el arreglo");
        for (int i = 0; i < vector.length; i++) {//Ciclo para solicitar al usuario el llenado del vector
            System.out.print("[" + i + "]" + "= ");
            vector[i] = input.nextInt();//Guardando valores en cada posición del vector 
        }

        System.out.println("");
        //llamado de los métodos correspondientes para hallar el valor menor de un vector de forma recursiva e iterativa.
        System.out.println("El número menor de forma recursiva es: " + numeroMenorRecursivo(vector, 0, vector[0]));
        System.out.println("El número menor de forma iterativa es: " + numeroMenorIterativo(vector));
    }

    //Método para mostrar el número menor en un vector de forma recursiva
    public static int numeroMenorRecursivo(int[] vector, int indice, int numMenor) {

        if (indice != vector.length) {//Caso base, para finalizar el algoritmo recursivo 
            if (vector[indice] < numMenor) {//Condición para evaluar cada elemento del vector y de esa forma determinar el elemento menor.
                numMenor = numeroMenorRecursivo(vector, indice + 1, vector[indice]);
            } else {//Proceso para encontrar el elemento menor del vector de forma recursiva.
                numMenor = numeroMenorRecursivo(vector, indice + 1, numMenor);
            }
        }
        return numMenor;//Retorno del elemento menor.
    }

    //Método para mostrar el numero menor en un vector de forma iterativa
    public static int numeroMenorIterativo(int[] vector) {

        int numMenorVector = vector[0];// Variable que guardará o almacenará el valor menor encontrado en el vector.
        for (int i = 0; i < vector.length; i++) {// Ciclo para recorrer el vector
            if (vector[i] < numMenorVector) {// Proceso par hallar el elemento menor encontrado en el vector.
                numMenorVector = vector[i];
            }
        }
        return numMenorVector;// Retorno de la respuesta con el elemento menor.
    }

}
