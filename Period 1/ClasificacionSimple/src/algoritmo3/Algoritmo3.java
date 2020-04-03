/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo3;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Algoritmo3 {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        try {

            int[] arr = new int[3];
            int[] arr2 = new int[3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = e.nextInt();
                arr2[i] = arr[i];
            }

            System.out.println("");

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println("");

            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }

        } catch (Exception o) {
            System.out.println("Los valores ingresados no son válidos");
        }
    }

}
