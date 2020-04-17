package tallerparte3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Poema {

    //Método para contar la vocales del poema de forma recursiva
    public static int contarVocales(String vocal, int posicion) {
        if (posicion < vocal.length()) {
            char caracter = vocal.toLowerCase().charAt(posicion);
            if (esVocal(caracter)) {
                return 1 + contarVocales(vocal, posicion + 1);
            } else {
                return contarVocales(vocal, posicion + 1);
            }
        } else {
            return 0;
        }
    }

    //Método para validar si es una vocal del poema
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    //Método para contar espacios del poema
    public static int contarEspacios(String espacios) {
        if (espacios.length() == 0) {
            return 0;
        } else {
            return (espacios.charAt(0) == ' ' ? 1 : 0) + contarEspacios(espacios.substring(1)); //Si hay espacio ponga "1" sino ponga "0"
        }
    }

    //Método para contar consonantes del poema
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
    }

    //Método para contar consonantes del poema
    public static int contarConsonantes(String palabra, int posicion) {
        if (posicion < palabra.length()) {
            char caracter = palabra.charAt(posicion);
            if (esConsonante(caracter)) {
                return 1 + contarConsonantes(palabra, posicion + 1);
            } else {
                return contarConsonantes(palabra, posicion + 1);
            }
        } else {
            return 0;
        }
    }

    //Método para contar las letras del poema
    public static int contarLetras(int vocales, int consonantes) {
        if (consonantes == 0) {
            return vocales;
        } else if (vocales == 0) {
            return consonantes;
        } else {
            return 1 + contarLetras(vocales, consonantes - 1);
        }
    }

    //Arreglos y variables del tipo estático para realizar el proceso de contar palabras en el poema
    public static ArrayList<String> arreglo1 = new ArrayList<String>();
    public static ArrayList<String> arreglo2 = new ArrayList<String>();
    static String cadena;

    //Método para guardar cada palabra del poema en un índice específico del arreglo (lista).
    public static ArrayList<String> guardarPalabras(ArrayList<String> arreglo, String cadena, int indice, String nuevaCadena) {

        if (indice != cadena.length()) {
            if (cadena.charAt(indice) != ' ' && cadena.charAt(indice) != '\n') {
                nuevaCadena += cadena.charAt(indice);
            } else {
                if (!nuevaCadena.equals("")) {
                    arreglo.add(nuevaCadena);
                    nuevaCadena = "";
                }
            }
            guardarPalabras(arreglo, cadena, indice + 1, nuevaCadena);
        }

        return arreglo;
    }

    //Método para ordenar el arreglo sin elementos repetidos, es decir, se borran las palabras repetidas del poema.
    public static ArrayList<String> ordenarArreglo(ArrayList<String> arregloList, int indice, int indice2) {
        if (indice < arregloList.size() - 1) {
            if (indice2 < arregloList.size()) {
                if (arregloList.get(indice).equalsIgnoreCase(arregloList.get(indice2)) || arregloList.get(indice2).equals("")) {
                    arregloList.remove(indice2);
                    indice2 = indice + 1;
                    ordenarArreglo(arregloList, indice, indice2);
                }
                indice2++;
                ordenarArreglo(arregloList, indice, indice2);
            } else {
                indice++;
                indice2 = indice + 1;
                ordenarArreglo(arregloList, indice, indice2);
            }
        }
        return arregloList;
    }

    //Metodo que recibe arreglos con palabras repetidas y palabras sin repetir del poema.
    //Tiene como objetivo contar cuantas veces se encuentra una palabra específica en el poema.
    public static String contarPalabras(ArrayList<String> arregloList, ArrayList<String> arregloList2, int contador, int indice, int indice2) {
        if (indice < arregloList.size()) {
            if (indice2 < arregloList2.size()) {
                if (arregloList.get(indice).equalsIgnoreCase(arregloList2.get(indice2))) {
                    contador++;
                }
                indice2++;//recorrer el arreglo con las palabras repetidas
                contarPalabras(arregloList, arregloList2, contador, indice, indice2);
            } else {
                cadena = "La palabra " + arregloList.get(indice) + " esta repetida " + String.valueOf(contador) + " veces";
                System.out.println(cadena);
                indice2 = 0;
                contador = 0;
                indice++;//Se recorre el arreglo sin las palbras repetidas
                contarPalabras(arregloList, arregloList2, contador, indice, indice2);
            }
        }
        return cadena;
    }

    //Método principal (main)
    public static void main(String[] args) {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String linea;
        String poema = "";
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("poema.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            while ((linea = br.readLine()) != null) {
                poema += linea + "\n";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }

        //Llamado de los método necesario para realizar el conteo de las palabras, vocales, consonantes, letras y espacios del poema elegido.
        System.out.println("POEMA: DOS CUERPOS - OCTAVIO PAZ\n\n" + poema);
        System.out.println("Cantidad de vocales: " + contarVocales(poema, 0));
        System.out.println("Cantidad de espacios: " + contarEspacios(poema));
        System.out.println("Cantidad de consonantes: " + contarConsonantes(poema, 0));
        System.out.println("Cantidad de letras: " + contarLetras(contarVocales(poema, 0), contarConsonantes(poema, 0)));
        guardarPalabras(arreglo1, poema, 0, "");
        ordenarArreglo(arreglo1, 0, 1);
        guardarPalabras(arreglo2, poema, 0, "");
        System.out.println("");
        contarPalabras(arreglo1, arreglo2, 0, 0, 0);
    }
}
