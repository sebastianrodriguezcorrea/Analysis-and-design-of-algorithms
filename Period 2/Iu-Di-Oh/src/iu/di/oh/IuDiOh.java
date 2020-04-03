/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu.di.oh;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class IuDiOh {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int atributo = e.nextInt();
        int cartMarcos = e.nextInt();
        int cartLeonardo = e.nextInt();
        int[][] matriz = new int[cartMarcos][atributo];
        int[][] matriz2 = new int[cartLeonardo][atributo];

        for (int i = 0; i < cartMarcos; i++) {
            for (int j = 0; j < atributo; j++) {
                matriz[i][j] = e.nextInt();
            }
        }

        for (int i = 0; i < cartLeonardo; i++) {
            for (int j = 0; j < atributo; j++) {
                matriz2[i][j] = e.nextInt();
            }
        }

        int numCart = e.nextInt();
        int numCart2 = e.nextInt();

        int[] array = new int[atributo];
        int[] array2 = new int[atributo];

        for (int i = 0; i < array.length; i++) {
            array[i] = matriz[numCart - 1][i];
            array2[i] = matriz2[numCart2 - 1][i];
        }

        int evaluacion = e.nextInt();

        if (array[evaluacion - 1] > array2[evaluacion - 1]) {
            System.out.println("Marcos");
        } else if (array[evaluacion - 1] < array2[evaluacion - 1]) {
            System.out.println("Leonardo");
        } else {
            System.out.println("Empate");
        }

    }

}
