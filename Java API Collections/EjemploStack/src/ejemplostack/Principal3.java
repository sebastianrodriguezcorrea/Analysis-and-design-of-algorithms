/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostack;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Principal3 {
    
   public static String nombre;
   public static String edad;
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        LinkedList<Object> listaPersonas = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            nombre = e.next();
            edad = e.next();
            listaPersonas.add("Nombre: " + nombre + " edad: " + edad);
        }
        
        System.out.println("");
        for (Object lista : listaPersonas) {
            System.out.println(lista.toString() + "***");
        }
        
        System.out.println("");
        System.out.println(listaPersonas.size());
        System.out.println("");
        
        for (int i = 0; i < listaPersonas.size(); i++) {
            if(i%2== 0 || i == 0){
                
            }else{
                listaPersonas.remove(i);
            }
        }
        
        System.out.println("**************** Lista sin eliminados ****************");
        System.out.println("");
        for (Object lista : listaPersonas) {
            System.out.println(lista.toString() + "***");
        }
        
        System.out.println("");
        System.out.println(listaPersonas.size());
    }
}
