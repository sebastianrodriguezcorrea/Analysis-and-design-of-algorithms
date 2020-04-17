package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class InvertirNumeroRecursividad {
    
    // Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);// Declaración de Scanner para leer datos desde la consola.
        System.out.print("Ingrese el numero que desea invertir: ");
        int numero = lector.nextInt();// Variable para almacenar el dato ingresado por el usuario desde la consola.
        System.out.print("Cuantas unidades contiene el numero que digitó? Por favor ingréselas ");
        int unidades = lector.nextInt();// Variable para almacenar las unidades que contiene el valor ingresado por el usuario, esto se usa para complementar y realizar la recursividad de forma correcta.
        //Llamado de los métodos necesario para realizar el proceso de forma recursiva e iterativa, es importante resaltar que estos métodos aceptan unos parámentros necesario para la realización de estos.
        System.out.println("El numero invertido de forma recursiva es: " + invertirNumeroRecursiva(numero, unidades - 1));
        System.out.println("El numero invertido de forma iterativa es: " + invertirNumeroIterativa(numero));
    }

    //Método para invertir el número digitado de forma Recursiva
    public static int invertirNumeroRecursiva(int valor, int unidades) {

        if (valor < 10) { //Caso base, que especifica el caso en el cual el procedimiento del algoritmo recursivo finaliza.
            return valor;//Retorno del valor dado como parámetro en el método.
        } else {
            //Retorno del método para implementar la recursividad para hallar la respuesta al problema planteado.
            return (valor % 10) * (int) Math.pow(10, unidades) + (invertirNumeroRecursiva(valor / 10, unidades - 1));
        }
    }

    //Método para invertir el número digitado de forma Iterativa 
    public static int invertirNumeroIterativa(int valor) {
        
        //Cadena que almacenará de forma temporal cada digito del número a invertir.
        String cadena = "";

        //Ciclo para realizar el proceso de inviertir un número de forma iterativa.
        for (int i = String.valueOf(valor).length() - 1; i >= 0; i--) {
            cadena += String.valueOf(valor).charAt(i);//Proceso para guardar los digitos del valor asignado de forma regresiva.
        }
        
        return Integer.parseInt(cadena);//Convierte de cadena a numero
    }

}
