/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Algoritmo4 {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        try {

            Float num1 = e.nextFloat();
            Float num2 = e.nextFloat();
            Float num3 = e.nextFloat();
            Float res;

            DecimalFormatSymbols separadorPersonalizado = new DecimalFormatSymbols();
            separadorPersonalizado.setDecimalSeparator('.');
            DecimalFormat formato = new DecimalFormat("#.0", separadorPersonalizado);

            if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
                res = num1 + num2 + num3;
                System.out.println("Perimetro = " + formato.format(res));
            } else {
                res = ((num1 + num2) / 2) * num3;
                System.out.println("Area = " + formato.format(res));
            }

        } catch (Exception o) {

            System.out.println("Los valores ingresados no son válidos");

        }

    }

}
