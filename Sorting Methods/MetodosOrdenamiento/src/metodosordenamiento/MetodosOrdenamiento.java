/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenamiento;

/**
 *
 * @author Juan Sebastian
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodosOrdenamiento {

    private static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector"));

        // crear aaray de tamaño N digitado por el usuario
        int ArrayN[] = new int[tamanio];

        /**
         * Bucle rellanar el arryay con lo que dite el usuraio
         */
        for (int i = 0; i < ArrayN.length; i++) {

            System.out.print("Digite el numero para el elemento " + (i + 1) + ": ");
            ArrayN[i] = entrada.nextInt();
        }

        /**
         * Método para mostrar el arreglo desordenado
         */
        System.out.println("\n***** SIN ORDENAR *****");
        mostrarArreglo(ArrayN);

        String respuestaUsuario = JOptionPane.showInputDialog("		¿QUIERE ORDENAR EL ARREGLO?" + "\nSI O NO");

        // si la respuesta es S=si
        if (respuestaUsuario.equalsIgnoreCase("si")) {
            System.out.println("******* ORDENADO *******");
            // bubbleSort(ArrayN);
            // Hacer seleccion, insercion, quicksort
            quicksort(ArrayN, 0, ArrayN.length - 1); //Dando como parámetros de entrada la posición inicial del arreglo y la posición final de este.
            mostrarArreglo(ArrayN);// visualizar arreglo ordenado por el método Quick.
            //insercion(ArrayN);
            //seleccion(ArrayN);

        }

    }

    static void seleccion(int[] arrayN) {
        int i, j, menor, pos, temp;
        for (i = 0; i < arrayN.length; i++) {// Tomar el elemento menor como el primero
            menor = arrayN[i];// El menor lo guardo y el resto falta por ordenar
            pos = i;// guardo posicion

            for (j = i + 1; j < arrayN.length; j++) {// Busqueda en el resto del vector
                if (arrayN[j] < menor) {
                    menor = arrayN[j];// Menor que el actual
                    pos = j;
                }
            }

            // Si hay algno menor lo intercambio
            if (pos != i) {// i
                temp = arrayN[i];
                arrayN[i] = arrayN[pos];
                arrayN[pos] = temp;
            }
        }

        /* Llama al método monstrarN, si ordena damos por hecho que lo quiere mostar */
        mostrarArreglo(arrayN);

    }

    static void insercion(int[] arrayN) {
        // TODO Auto-generated method stub

        int a, aux, s;
        for (a = 1; a < arrayN.length; a++) {// desde el segundo elemento
            aux = arrayN[a];// guardo un elemento
            s = a - 1; // inicio en el anterior

            /* mientras queden en posicion valor aux sea menor a los que desplazo */
            while ((s >= 0) && (aux < arrayN[s])) {
                arrayN[s + 1] = arrayN[s];
                s--;
            }
            arrayN[s + 1] = aux;
        }

        /* Llama al método monstrarN, si ordena damos por hecho que lo quiere mostar */
        mostrarArreglo(arrayN);
    }

    static void quicksort(int[] arrayN, int primero, int ultimo) {// Parámetros de entrada necesarios para el método, 
        int i, j, aux;// Declaración de variables necesarias para implementar el método Quick.
        int pivote;// El privote representa un número de referencia para realizar los ordenamientos.
        i = primero;// primer posicion del arreglo
        j = ultimo;// ultima posicion del arreglo
        pivote = arrayN[(i + j) / 2];// Tomar la mitad del arreglo o dividir el arreglo en 2. Esto se realiza en el caso
        // de que exista una mitad exacta, sino pasa esto, se toma un número diferente de la mitad.
        do {
            while (arrayN[i] < pivote) {// se colocan los nùmeros menores al pivote a la izquierda del arreglo.
                i++; //De esta forma si la condición se cumple, se recorre el arreglo en sentido de derecha a izquierda.
            }
            while (arrayN[j] > pivote) {// se recorre los ultimos elementos del arreglo hasta pivote
                j--; //De esta forma si la condición se cumple, se recorre el arreglo en sentido de izquierda a derecha.
            }
            // Aqui hacemos el intercambio de elementos
            if (i <= j) {
                aux = arrayN[i];
                arrayN[i] = arrayN[j]; // Corresponde a la mecánica de ordenación relacionada al método de la burbuja y a otros métodos de ordenamiento.
                arrayN[j] = aux;
                i++; // Incrementando al contador i.
                j--; // Decrementando al contador j.
            }

        } while (i <= j);// Mientras el valor guardado en la primera posición correpondiente a i sea menor o igual al valor correspondiente en la posicion j que es la última del arreglo.
        if (primero < j) { //Realizando recursividad del algoritmo para volver a repetir pasos sin necesidad de interponer un ciclo nuevo.
            quicksort(arrayN, primero, j);// En este caso el nuevo número que se encuentra en la posición final del arreglo, sería el almacenado en j.
        }
        if (i < ultimo) {// En este caso se define que la variable i, será la primera posición del arreglo, de esa forma se toma una pequeña población,
            // Que represente el conjunto nuevo a ordenar, de esa forma se divide el arreglo entre partes para ser nuevamente ordenado.
            quicksort(arrayN, i, ultimo);// De igual forma se realiza recursividad para evitar el proceso de algunos pasos nuevamente.
        }
    }

    /**
     *
     * @param arrayN
     */
    static void bubbleSort(int[] arrayN) {
        // TODO Auto-generated method stub

        // ciclo array 0 a array -1
        for (int i = 0; i < arrayN.length - 1; i++) {

            for (int j = 0; j < arrayN.length - 1; j++) {
                // pregunta clave
                if (arrayN[j] > arrayN[j + 1]) {

                    int temp = arrayN[j + 1];

                    arrayN[j + 1] = arrayN[j];

                    arrayN[j] = temp;

                }
            }
        }
        mostrarArreglo(arrayN);
    }

    /**
     *
     * @param arrayN
     */
    static void mostrarArreglo(int[] arrayN) {
        // TODO Auto-generated method stub

        System.out.print("----------------------------------------------\n");
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Elemento " + (i + 1) + "------>" + arrayN[i] + "\n");
        }
        System.out.println("-----------------------------------------------");

    }
}
