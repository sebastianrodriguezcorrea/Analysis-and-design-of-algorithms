package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class FactorialNumero {

    //Clase principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);// Declaración del Scanner para leer datos introducidos por consola.
        System.out.print("Ingrese el número, el cual desea hallar su factorial: ");
        int numero = lector.nextInt();// Variable que guardará el número introducido por el usuario
        System.out.println("");
        //Llamada a los métodos relacionados con el procedimiento para hallar el factorial de un número, implementado algoritmos recursivo y iterativos.
        System.out.println("El numero factorial de forma recursiva es: " + factorialRecursivo(numero));
        System.out.println("El numero factorial de forma iterativa es: " + factorialIterativo(numero));
    }

    //Método para calcular el factorial de un número x de forma recursiva
    public static int factorialRecursivo(int numero) {
        int resultado;// Variable que guardará el resultado del proceso del algoritmo
        if (numero == 1) { //Condicion Base, si el número es igual a 1, que este retorne 1, de lo contrario, se debe realizar el proceso recursivo para hallar la solución
            return 1;
        } else {
            resultado = factorialRecursivo(numero - 1) * numero; //Llamada a la recursividad, solicitando nuevamente al algoritmo.
        }
        return resultado;
    }

    //Método para calcular el factorial de un número x de forma iterativa
    public static int factorialIterativo(int numero) {

        int resultado = 1;// utilización de variables para mantener el resultado dado por el procedimiento del algoritmo iterativo.
        for (int i = 1; i < numero; i++) //Iteración donde se llevará a cabo el proceso del algoritmo iterativo.
        {
            resultado = resultado * (i + 1);// Procedimiento para hallar el factorial de un número x
        }
        return resultado;// Retorno de la variable con la respuesta
    }
}
