/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaquiz;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class AdaQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        try {
            int t1 = e.nextInt();
            int t2 = e.nextInt();
            int t3 = e.nextInt();
            int t4 = e.nextInt();

            System.out.println("");

            if (t1 <= 6 && t1 >= 2 && t2 <= 6 && t2 >= 2 && t3 <= 6 && t3 >= 2 && t4 <= 6 && t4 >= 2) {
                System.out.println((t1 + t2 + t3 + t4) - 3);
            } else {
                System.out.println("Cantidad de tomas excedida o incorrecta");
            }
        } catch (Exception o) {
            System.out.println("Los valores ingresados no son válidos");
        }
    }

}

