package tallerparte3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cancion {

    //Declaración de variable estática necesaria para almacenar la nueva canción sin vocales.
    static String nuevaCancion = null;

    //Método principal (main)
    public static void main(String[] args) {

        //Declaración de variables necesarias para la creación y uso de archivos planos.
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String linea;
        String cancion = "";
        String sinVocales;

        try {
            // Inicio del fichero y creacion de BufferedReader para poder
            // realizar una lectura comoda.
            archivo = new File("cancionConVocales.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            System.out.println("ANOTHER DAY IN PARADISE - PHIL COLLINS\n");
            // Lectura del fichero (disponer del metodo readLine() para realizar una lectura de cada elemeto en el archivo plano)
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                cancion += linea;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Finally para cerrar el fichero, y de esa forma asegurándonos
            // que se cierra tanto si todo va bien como si ocurre una excepción.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }

        //Verificación de que la cación se ha almacenado de forma correcta en una variable de tipo String.
        System.out.println("");
        System.out.println(cancion);
        System.out.println("");
        eliminarVocal(cancion, 0);//Método recursivo para eliminar las vocales de la cación que se encuentra en una variable de tipo cadena temporal.

        //Alamacenando la nueva canción sin vocales en una nueva cadena temporal
        sinVocales = eliminarVocal(cancion, 0);
        //Verificar si la nueva cadena contiene la canción sin vocales, y de esa forma probar que el proceso del método recursivo fue exitoso
        System.out.println("\n" + sinVocales);

        //Proceso para almacenar la nueva canción sin vocales en un nuevo archivo plano.
        try {

            FileWriter fw = new FileWriter("D:\\cancionSinVocales.txt");

            fw.write(sinVocales);

            fw.close();
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }

    //Método para realizar la eliminación de vocales en el String que contiene la canción de forma recursiva
    public static String eliminarVocal(String a, int i) {

        //Variable String f que recepciona la nueva cadena generada.
        if (i != a.length()) {//Caso base para finalizar el algoritmo recursivo.
            if (String.valueOf(a.charAt(i)).equalsIgnoreCase("a") || String.valueOf(a.charAt(i)).equalsIgnoreCase("e") || String.valueOf(a.charAt(i)).equalsIgnoreCase("i") || String.valueOf(a.charAt(i)).equalsIgnoreCase("o") || String.valueOf(a.charAt(i)).equalsIgnoreCase("u")) {
                nuevaCancion = a.substring(0, i) + "" + a.substring(i + 1, a.length());//proceso para eliminar las vocales de la canción
                eliminarVocal(nuevaCancion, i);//Llamado recursivo para completar el proceso del método
            } else {
                eliminarVocal(a, i + 1);//Llamado recursivo para completar el proceso del método
            }
        }
        return nuevaCancion;//Retorno de la nueva canción sin vocales
    }
}
