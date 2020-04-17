package tallerparte2;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class BuscarString {

    //Método principal (main)
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);// Declaración del Scanner para solicitar datos al usuario por medio de la consola.
        System.out.println("Ingrese el tamaño de la matriz");
        int tam = lector.nextInt();//Solicitar al usuario el tamaño de la matriz, y de esa forma guardar el tamaño establecido en una variable.
        String matriz[][] = new String[tam][tam];//Creación de la matriz con el tamaño previamente establecido

        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {//Proceso de llenado para la matriz declarada.
                System.out.print("Elemento " + "[" + i + "]" + "[" + j + "]" + ": ");
                matriz[i][j] = lector.next();
            }
        }

        //Ejecución de lo métodos para hallar un elemento de tipo String una matriz de dimensione NXN de forma iterativa e recursiva.
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el elemento que desea buscar en la matriz");
        String cadena = lector.next();//Solicitar cadena a buscar dentro de los elementos de la matriz previamente diseñada.
        System.out.println("La validación del elemento [" + cadena + "] de forma recursiva es ("
                + buscarCadenaRecursivo(matriz, cadena, 0, 0) + ")");
        System.out.println("La validación del elemento [" + cadena + "] de forma iterativa es ("
                + buscarCadenaIterativo(matriz, cadena) + ")");
    }

    //Método para buscar el String o cadena en questión dentro de la matriz establecida de forma recursiva.
    public static boolean buscarCadenaRecursivo(String[][] matriz, String cadena, int recorridoFilas, int recorridoColumnas) {
        if (matriz[recorridoFilas][recorridoColumnas].equalsIgnoreCase(cadena)) {//Caso base para finalizar el algoritmo recursivo
            return true;
        } else {
            if (recorridoFilas != matriz.length - 1 || recorridoColumnas != matriz.length - 1) {
                if (recorridoColumnas == matriz.length - 1) {//Si el caso base no se cumple, se procede a realizar el proceso para encontrar la cadena en la matriz de forma recursiva
                    recorridoFilas++;
                    recorridoColumnas = 0;
                } else {
                    recorridoColumnas++;
                }
                return buscarCadenaRecursivo(matriz, cadena, recorridoFilas, recorridoColumnas);//Realización del llamado recursivo.
            }
            return false;
        }
    }

    //Método para buscar el String o cadena en questión dentro de la matriz establecida de forma iterativa.
    public static boolean buscarCadenaIterativo(String[][] matriz, String cadena) {

        boolean verificador = false;//Variable para confirmar si el string se encuentra realmente en la matriz.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].equalsIgnoreCase(cadena)) {//Proceso para hallar la cadena dentro de la matriz.
                    verificador = true;
                    break;
                }
            }
        }

        return verificador;//Retorno de la respuesta del método.
    }

}
