/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Evento {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean verificador = true;
        int x, m;

        do {
            x = e.nextInt();
            m = e.nextInt();

            if (x != 0 && m != 0) {
                if (x > 0 && x <= 3 && m >= 10 && m <= Math.pow(2, (32 - 1))) {
                    arr.add(x * m);
                } else {
                    System.out.println("ERROR, datos ingresados no válidos");
                    verificador = false;
                    break;
                }
            }
        } while (x != 0 && m != 0);
        
        System.out.println("");
        if (verificador) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }
    }

}
