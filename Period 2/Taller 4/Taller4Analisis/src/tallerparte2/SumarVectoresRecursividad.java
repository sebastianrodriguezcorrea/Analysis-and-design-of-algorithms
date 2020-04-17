package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class SumarVectoresRecursividad {

    //método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);// Declaración del lector o scanner para pedir datos desde la consola.
        System.out.println("Cuantos numeros desea ingresar en el arreglo?");
        int n = lector.nextInt();// Variable que almacenará el tamaño del arreglo que el usuario desea construir.
        int[] vector = new int[n];// Creación del arreglo que obtendrá el tamaño previamente solicitado por el usuario.

        System.out.println("Llenando del vector");
        for (int i = 0; i < vector.length; i++) {// Ciclo para solicitar el llenado del vector previamente creado.
            System.out.print("[" + i + "]" + "= ");
            vector[i] = lector.nextInt();
        }

        System.out.println("");
        //Llamado de los métodos correspondientes a la suma de los valores almacenados de un vector de forma recusiva e iterativa.
        System.out.println("La suma de los elementos del vector de forma recursiva es: " + sumaVectorRecursiva(0, vector.length - 1, vector));
        System.out.println("La suma de los elementos del vector de forma iterativa es: " + sumaVectorIterativa(vector));
    }

    //Método para sumar los elementos de un vector usuando la recursividad
    public static int sumaVectorRecursiva(int inicio, int fin, int[] vector) {
        if (inicio == fin) {// Si el principio o el fin del arreglo son iguales, simplemente se retorna el valor almacenado en dicha posición.
            return vector[inicio];
        } else {//Si la condición previa es falsa, se realiza el respectivo proceso recursivo para sumar lo elementos de un vector específico.
            int mitad = (inicio + fin) / 2;//Se divide el vector en dos para realizar las operaciones de suma de forma más sencilla.
            int x = sumaVectorRecursiva(inicio, mitad, vector);// Suma de los valores desde el principio del vector.
            int y = sumaVectorRecursiva(mitad + 1, fin, vector);// Suma de los valores desde el final del vector.
            return x + y;// se retorna la suma respectiva de los valores encontrados.
        }
    }

    //Método para sumar los elementos de un vector usando la forma iterativa.
    public static int sumaVectorIterativa(int vector[]) {
        int suma = 0;// Declaración de variable que obtendrá la suma acumulada.
        for (int i = 0; i < vector.length; i++) {// Creación del ciclo para realizar la suma de los elementos del vector.
            suma += vector[i];// Operación de suma en los elementos del vector respectivo
        }
        return suma;// Retorno del resultado de la suma
    }
}
