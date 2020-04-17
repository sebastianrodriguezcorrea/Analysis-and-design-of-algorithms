package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class OperacionesBasicasRecursividad {

    //Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Declarando Scanne para obtener valores del usuario por la consola.
        System.out.print("Ingrese el primer valor \n");
        int num1 = lector.nextInt();//Almacenando primer número a operar
        System.out.print("Ingrese el segundo valor \n");
        int num2 = lector.nextInt();//Almacenando segundo número a operar

        System.out.println("");
        //Métodos correspondiente a las operaciones básicas matemáticas entre dos número, desarrollados de forma recursiva e iterativa.
        //Suma recursiva - iterativa
        System.out.println("La suma de los números de forma recursiva es: " + sumaRecursiva(num1, num2));
        System.out.println("La suma de los números de forma iterativa es: " + sumaIterativa(num1, num2));

        //Resta recursiva - iterativa
        System.out.println("La resta de los números de forma recursiva es: " + restaRecursiva(num1, num2));
        System.out.println("La resta de los números de forma iterativa es: " + restaIterativa(num1, num2));

        //Multiplicación recursiva - iterativa
        System.out.println("La multiplicacion de los números de forma recursiva es: " + multiplicacionRecursiva(num1, num2));
        System.out.println("La multiplicacion de los números de forma iterativa es: " + multiplicacionIterativa(num1, num2));

        //División recursiva - iterativa
        System.out.println("La división de los número de forma recursiva es: " + divisionRecursiva(num1, num2));
        System.out.println("La división de los número de forma iterativa es: " + divisionIterativa(num1, num2));

        //Potenciación recursiva - iterativa
        System.out.println("El número " + num1 + " elevado a la potencia " + num2 + " de forma recursiva es: " + potenciaRecursiva(num1, num2));
        System.out.println("El número " + num1 + " elevado a la potencia " + num2 + " de forma iterativa es: " + potenciaIterativa(num1, num2));
    }

    //Método para sumar dos número de forma recursiva
    public static int sumaRecursiva(int num1, int num2) {
        if (num2 == 0) {//Si el valor del número 2 es igual a o la suma corresponde al valor del número 1
            return num1;
        } else if (num1 == 0) {//Si el valor del número 1 es igual a o la suma corresponde al valor del número 2
            return num2;
        } else {//Proceso para hallar el resultado de la suma de los dos números de forma recursiva
            return 1 + sumaRecursiva(num1, num2 - 1);
        }
    }

    //Método para sumar dos números de forma iterativa
    public static int sumaIterativa(int num1, int num2) {
        return num1 + num2;//Retonar resultado
    }

    //Método para restar dos números de forma recursiva
    static int restaRecursiva(int num1, int num2) {
        if (num1 > num2) {//Caso base
            return 1 + restaRecursiva(num1, num2 + 1);//Llamado recursivo para realizar el método de resta
        }
        if (num2 > num1) {//Caso base
            return -1 + restaRecursiva(num1 + 1, num2);//Llamado recursivo para realizar el método de resta
        } else {//Caso base
            return 0;//Retorno de 0 en el caso de que el proceso de resta de los dos número se como resultado 0
        }
    }

    //Método para restar dos número de forma iterativa
    public static int restaIterativa(int num1, int num2) {
        return num1 - num2;
    }

    //Método para multiplicar dos números de forma recursiva
    public static int multiplicacionRecursiva(int num1, int num2) {
        if (num2 == 1) {//Caso base, para hacer que el algoritmo finalice sin realizar llamado recursivo.
            return num1;
        } else {
            return num1 + multiplicacionRecursiva(num1, num2 - 1);//Realización de llamado recursivo para resolver el problema propuesto.
        }
    }

    //Método para Multiplicar dos número de forma iterativa
    public static int multiplicacionIterativa(int num1, int num2) {
        return num1 * num2;
    }

    //Método para Dividir dos número de forma recursiva
    private static int divisionRecursiva(int num1, int num2) {
        if (num2 > num1) {//Caso base, para hacer que el algoritmo recursivo finalice.
            return 0;
        } else {
            return 1 + divisionRecursiva(num1 - num2, num2);//Llamado recursivo para realizar el proceso de división de los números dados.
        }
    }

    //Método para Dividir dos número de forma iterativa
    public static int divisionIterativa(int num1, int num2) {
        return num1 / num2;
    }

    //Método para obtener el resultado de la Potencia de dos números de forma recursiva
    private static int potenciaRecursiva(int num1, int num2) {
        if (num2 == 0) {//Caso base para finalizar el algoritmo sin necesidad de realizar el llamado recursivo.
            return 1;
        } else {
            return num1 * potenciaRecursiva(num1, num2 - 1);//Realización del llamado recursivo para realizar el procedimiento de potenciación de un número específico.
        }
    }

    //Método para obtener el resultado de la Potencia de dos números de forma iterativa
    public static int potenciaIterativa(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

}
