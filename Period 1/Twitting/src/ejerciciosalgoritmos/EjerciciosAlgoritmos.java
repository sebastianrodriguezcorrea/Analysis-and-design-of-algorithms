/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosalgoritmos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class EjerciciosAlgoritmos {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String cadena = e.nextLine();
        System.out.println("");
        if (cadena.length() >= 1 && cadena.length() <= 500) {
            if (cadena.length() <= 140) {
                System.out.println("TWEET");
            } else {
                System.out.println("MUTE");
            }
        } else {
            System.out.println("ERROR, la cadena sobrepasa o no cumple con los parámetros indicados.");
        }
    }

}
