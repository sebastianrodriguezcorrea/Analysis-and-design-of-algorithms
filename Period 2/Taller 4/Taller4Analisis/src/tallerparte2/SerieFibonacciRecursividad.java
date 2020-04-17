package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class SerieFibonacciRecursividad {
    
    //Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);// Creación del lector para solicitar datos de entrada por consola
        System.out.print("Ingrese el valor que desea implementar para hallar su sucesión fibonacci: ");
        int numero = lector.nextInt();// Variable que almacenará el valor digitado por el usuario.
        System.out.println("");
        //Implementación de los métodos que corresponde al proceso de la serie Fibonacci de manera recursiva e iterativa.
        System.out.println("La sucesión Fibonacci recursiva es: " + fibonacciRecursivo(numero));
        System.out.println("La sucesión Fibonacci iterativa es: " + fibonacciIterativo(numero));
    }

    //Metodo para hallar la sucesión Fibonacci de manera Recursiva 
    public static int fibonacciRecursivo(int valor) {
        if (valor <= 1) { //Caso base, donde se plantea la finalización de la serie Fibonacci en un valor determinado.
            return valor;//En el caso que el número digitado sea menor o igual a 1, se retornará el mismo valor.
        }
        
        // En caso contrario se realiza el llamado recursivo para implementar otro caso que llevará proximamente a la solución de forma recursiva.
        return fibonacciRecursivo(valor - 1) + fibonacciRecursivo(valor - 2);
    }

    //Metodo para hallar la sucesión Fibonacci de manera Iterativa
    public static int fibonacciIterativo(int valor) {
        if (valor <= 1) {// Utilización de un condicional para acabar la serie Fibonacci en el caso de que el número utilizado sea menor o igual a 1
            return valor;// Retorno del valor asignado por el usuario
        }
        int fibonacci = 1;
        int fibonacciPrevio = 1;

        for (int i = 2; i < valor; i++) {//Implementación iterativa realizada con ayuda de un ciclo para encontrar la sucesión Fibonacci del valor en questión.
            int aux = fibonacci;
            fibonacci += fibonacciPrevio;// Proceso para hallar la serie Fibonacci de un número específico.
            fibonacciPrevio = aux;
        }
        return fibonacci;// Retorno de la variable fibonacci que poco a poco construirá el resultado de la sucesión Fibonacci de un valor dado.
    }

}
