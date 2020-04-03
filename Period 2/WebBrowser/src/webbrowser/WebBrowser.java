/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class WebBrowser {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        try {
            int num1 = e.nextInt();
            ArrayList<String> arr1 = new ArrayList<String>();
            ArrayList<String> arr2 = new ArrayList<String>();
            boolean verificador = true;
            if (num1 >= 1 && num1 <= Math.pow(10, 4)) {
                System.out.println("Entro");
                for (int i = 0; i < num1; i++) {
                    String cadena = e.next();
                    if (cadena.length() <= 100) {
                        arr1.add(cadena);
                    } else {
                        verificador = false;
                        break;
                    }
                }

                System.out.println("Salio");
                int num2 = e.nextInt();
                if (num2 >= 1 && num2 <= 100) {
                    for (int i = 0; i < num2; i++) {
                        String cadena2 = e.next();
                        if (cadena2.length() <= 100) {
                            arr2.add(cadena2);
                        } else {
                            verificador = false;
                            break;
                        }
                    }
                }

                if (verificador) {
                    for (int i = 0; i < arr2.size(); i++) {
                        int contador = 0;
                        int contador2 = 0;
                        for (int j = 0; j < arr1.size(); j++) {
                            if (arr1.get(j).contains(arr2.get(i))) {
                                contador += 1;
                                if (contador2 < arr1.get(j).length()) {
                                    contador2 = arr1.get(j).length();
                                }
                            }
                        }
                        if (contador != 0) {
                            System.out.println("");
                            System.out.println(contador + "  " + contador2);
                        } else {
                            System.out.println("");
                            System.out.println("-1");
                        }
                    }
                } else {
                    System.out.println("ERROR, valores ingresados no válidos");
                }

            } else {
                System.out.println("ERROR, valores ingresados no válidos");
            }
        } catch (Exception o) {
            System.out.println("ERROR, valores ingresados no válidos");
        }

    }
}
