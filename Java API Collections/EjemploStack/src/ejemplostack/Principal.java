/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostack;

import java.util.ArrayList;

/**
 *
 * @author Juan Sebastian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo listas en java
        //Crear lista
        ArrayList<String> listaJuegos = new ArrayList<String>();
        
        //Agregar elementos a la lista
        listaJuegos.add("Rise of nations");
        listaJuegos.add("Halo");
        listaJuegos.add("Medal of honor");
        listaJuegos.add("FIFA 2020");
        listaJuegos.add("Max payne");
        
        listaJuegos.add(5, "FORZA"); //Agregar por índice
        listaJuegos.remove(2); //Eliminar por elemento
        //listaJuegos.remove(listaJuegos); //remove collection
        
        //Ver cantidad de elementos de la lista
        System.out.println("tamaño = "+listaJuegos.size());
        
        //Ver elemento en la lista
        if(listaJuegos.contains("Halo")){
            System.out.println("Si esta Halo en la lista");
        }else{
            System.out.println("No esta Halo en la lista");
        }
        
        //Ver si hay un elemento en la lista por un criterio como la dirección o index
        System.out.println("El elemento FIFA 2020 es la posición = "+listaJuegos.get(3));
        
        
        if(listaJuegos.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("La lista no está vacía");
        }
        
        //Modificar elemento de la lista
        
        
        //Imprimir lista
        for (String corona : listaJuegos) {
            System.out.println(corona + "-");
            System.out.println();
        }
        
        //Vaciar la lista
        listaJuegos.clear();
    }
    
}
