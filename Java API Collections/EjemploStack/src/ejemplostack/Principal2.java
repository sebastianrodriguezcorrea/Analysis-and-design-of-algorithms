/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostack;

import java.util.LinkedList;

/**
 *
 * @author Juan Sebastian
 */
public class Principal2 {
    
    public static void main(String[] args) {
        //Ejemplos listas en java
        //Crear lista doblemente enlazada
        LinkedList<String> listaPeliculas = new LinkedList<>();
        try{
            listaPeliculas.add("La vida es bella");
            listaPeliculas.add(1, "Los pitufos");
            listaPeliculas.add("Los magnificos");
            listaPeliculas.remove(2);
            listaPeliculas.remove("Los pitufos");
            System.out.println("El tamaño es "+listaPeliculas.size());
            
            //IF
            String res = (listaPeliculas.isEmpty()) ? "esta vacía":"No está vacía";
            System.out.println(res);
            
            String estaPeli = (listaPeliculas.contains("Advengers")) ? "Si esta" : "No esta";
            System.out.println(estaPeli);
            
            //Imprimir
            for (String peli : listaPeliculas) {
                System.out.println(peli + "***");
            }
            
        }catch(IndexOutOfBoundsException errorEspacio){
            System.err.print("Error al dejar un nodo de la lista enlazada con espacio");
            errorEspacio.printStackTrace();
        }catch(ArithmeticException error){
            error.printStackTrace(); //Imprimir el error exacto 
        }
        
        //Crear una lista de objetos en donde almacene el nombre de persona y la edad 
        //10 amigos de su vida
        //Agreguen por consola
        //imprimir toda la lista 
        //Eliminen los amigos en la posicion impar 1 3 5 7 9
        //Imprimir lista con eliminados como quedo
        //Imprimir tamaño de la lista
        
    }
}
