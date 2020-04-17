package tallerparte3;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class PalindromoRecursivo {

    //Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Declaración del Scanner para solicitar valores ingresados por la consola.
        System.out.println("Por favor ingrese la cadena a evaluar: ");
        String cadena = lector.next();//Variable que guardará temporalmente la cadena a evaluar.
        System.out.println(esPalindromo(cadena));//Llamado al método recursivo para saber si una cadena x es Palindromo.
    }

    //Método para saber si una Cadena es Palíndromo de forma recursiva
    public static String esPalindromo(String cadena) {
        if (cadena.length() <= 1) {//Caso base para finalizar el algoritmo, en caso de que la condición sea verdadera.
            return "La cadena es Palindromo";//Retorno si el caso es verdadero.
        } else {//Si la condición no se cumple, se debe realizar el proceso para hallar la respuesta a si una cadena es Palindromo.
            if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
                return esPalindromo(cadena.substring(1, cadena.length() - 1));//Realización del llamado recursivo para hallar la respuesta.
            } else {
                return "La cadena no es Palindromo";//Retorno si el caso es falso.
            }
        }
    }

}
