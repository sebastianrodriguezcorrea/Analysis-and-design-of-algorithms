/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enginefailure;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class EngineFailure {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int cantidad = e.nextInt();
        boolean verificador = true;

        if (cantidad > 1 && cantidad <= 100) {
            Integer[] arr = new Integer[cantidad];
            System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                Integer valor = e.nextInt();
                if (valor >= 0 && valor <= 10000) {
                    arr[i] = valor;
                } else {
                    System.out.println("ERROR, el valor ingresado no es correcto");
                    verificador = false;
                    break;
                }
            }

            if (verificador) {
                int respuesta = 0;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i + 1] < arr[i]) {
                        respuesta = i + 2;
                        break;
                    }
                }
                System.out.println(respuesta);
            }

        } else {
            System.out.println("ERROR, el valor ingresado no es correcto");
        }
    }

}
