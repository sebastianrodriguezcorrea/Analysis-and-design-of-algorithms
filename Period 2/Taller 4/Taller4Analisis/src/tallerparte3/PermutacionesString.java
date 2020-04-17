/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerparte3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class PermutacionesString {

    //Arreglos de tipo estáticos, necesarios para realizar el proceso de permutaciones en la cadena establecida.
    public static String arr[];
    public static ArrayList<String> arrayList = new ArrayList<String>();

    //Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Declaración del Scanner para poder ingresar valores desde la consola
        System.out.println("Introduce una cadena");
        String cadena = lector.next();//Variable que guardará temporalmente la cadena en questión
        arr = new String[cadena.length()];//Creación del arreglo que guardará cada letra de la cadena en índices específicos.
        convertirArreglo(arr, cadena, 0);//Método recursivo para convertir cada caracter de la cadena en un elemento del arreglo previamente creado.
        imprmirArreglo(arr);//Método para imprimir y validar si correctamente se ha agregado cada caracter al arreglo.
        System.out.println("");
        permutacion(arrayList, arr, "", arr.length, arr.length, 0);//Método para realizar las permutaciones de la cadena de forma recursiva.
        imprimirArrayList(arrayList);//Método para imprimir las permutaciones realizadas sobre la cadena específica.
    }

    //Método que convierte en una posición del arreglo cada caracter de la cadena.
    public static String[] convertirArreglo(String[] arreglo, String cadena, int indice) {

        if (indice < arreglo.length) {
            arreglo[indice] = String.valueOf(cadena.charAt(indice));//Proceso para guardar cada elemento de la cadena como un elemento del arreglo previamente creado.
            indice++;
            return convertirArreglo(arreglo, cadena, indice);//Llamado recursivo para cumplir el proceso 
        }
        return arreglo;//Retorno del arreglo con elementos de la cadena.
    }

    //Método para imprimir el arreglo de carácteres de la cadena
    public static void imprmirArreglo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "]");
        }
    }

    //Método para imprimir las permutaciones realizadas sobre la cadena
    public static void imprimirArrayList(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + array.get(i) + "]");
        }
    }

    //Método para realizar de forma recursiva las permutaciones de la cadena previamente establecida
    public static ArrayList permutacion(ArrayList array, String[] arregloCadena, String temp, int n, int r, int indice) {
        if (n == 0) {//Caso base para finalizar un subproceso del método recursivo
            array.add(temp);
        } else {
            if (indice != r) {
                if (!temp.contains(arregloCadena[indice])) {//Si temp o la cadena temporal es diferente de lo que contiene la primera posición del arregloCadena. 
                    permutacion(array, arregloCadena, temp + arregloCadena[indice], n - 1, r, 0);//Llamado recursivo del método para hallar todas las permutaciones posibles sobre la cadena en questión.
                }
                permutacion(array, arregloCadena, temp, n, r, indice + 1);//Llamado recursivo del método, pero esta vez dando paso siguiente a otro elemento a evaluar del arreglo de caracteres convertido sobre la cadena a evaluar.
            }
            return array;//Retorno del arreglo (lista) respuesta 
        }
        return array;//Retorno del arreglo (lista) respuesta
    }

}
