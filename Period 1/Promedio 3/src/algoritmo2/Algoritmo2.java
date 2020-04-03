/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Algoritmo2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        try {
            String calf1 = e.next();
            double caln1 = Double.parseDouble(calf1);
            String calf2 = e.next();
            double caln2 = Double.parseDouble(calf2);
            String calf3 = e.next();
            double caln3 = Double.parseDouble(calf3);
            String calf4 = e.next();
            double caln4 = Double.parseDouble(calf4);

            if (calf1.substring(1, 2).equals(".") && calf1.length() == 3 && caln1 >= 0
                    && calf2.substring(1, 2).equals(".") && calf2.length() == 3 && caln2 >= 0
                    && calf3.substring(1, 2).equals(".") && calf3.length() == 3 && caln3 >= 0
                    && calf4.substring(1, 2).equals(".") && calf4.length() == 3 && caln4 >= 0) {
                double promedio = (caln1 * 2 + caln2 * 3 + caln3 * 4 + caln4 * 1) / (2 + 3 + 4 + 1);
                DecimalFormatSymbols separador = new DecimalFormatSymbols();
                separador.setDecimalSeparator('.');
                DecimalFormat formato = new DecimalFormat("#.0", separador);
                System.out.println("Media: " + formato.format(promedio));

                if (promedio >= 7.0) {
                    System.out.println("Alumno aprobado");
                }
                if (promedio < 5.0) {
                    System.out.println("Alumno reprobado");
                }
                if (promedio >= 5.0 && promedio <= 6.9) {
                    System.out.println("Alumno en examén");
                    String ncalf = e.next();
                    double nresult = Double.parseDouble(ncalf);
                    if (ncalf.substring(1, 2).equals(".") && ncalf.length() == 3 && nresult >= 0) {
                        System.out.println("Nota de examen: " + nresult);
                        double nuevoPromedio = (promedio + nresult) / 2;
                        if (nuevoPromedio >= 5.0) {
                            System.out.println("Alumno aprobado");
                        } else {
                            System.out.println("Estudiante reprobado");
                        }
                        System.out.println("Media final: " + formato.format(nuevoPromedio));
                    } else {
                        System.out.println("El valor agregado no es válido");
                    }
                }

            } else {
                System.out.println("El valor agregado no es válido");
            }

        } catch (NumberFormatException o) {
            System.out.println("El valor agregado no es válido");
        }
    }

}
