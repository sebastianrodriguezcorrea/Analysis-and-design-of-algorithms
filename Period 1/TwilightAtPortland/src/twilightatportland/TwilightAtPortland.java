package twilightatportland;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class TwilightAtPortland {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Integer tamaño = e.nextInt();
        int suma = 0;
        if (tamaño >= 1 && tamaño <= 100) {
            int[][] arr = new int[tamaño + 1][tamaño + 1];
            System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = e.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Conjunto de Cámaras");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print("[" + arr[i][j] + "]");
                }
                System.out.println("");
            }

            System.out.println("");

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    suma = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                    if (suma > 1) {
                        System.out.print("S");
                    } else {
                        System.out.print("U");
                    }
                }
                System.out.println("");
            }
        }
    }

}
