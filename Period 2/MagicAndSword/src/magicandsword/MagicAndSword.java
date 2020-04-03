/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicandsword;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class MagicAndSword {

    static Scanner e = new Scanner(System.in);
    static int[] rectangulo = new int[4];
    static int[] circulo = new int[4];

    public static void main(String[] args) {
        int contador = e.nextInt();
        while (contador > 0) {
            System.out.println(respuesta(e.nextInt(), e.nextInt(), e.nextInt(), e.nextInt(), e.next(), e.nextInt(), e.nextInt(), e.nextInt()));
            contador--;
        }
    }

    private static void dibujarCuadrado(int w, int h, int x, int y) {
        rectangulo[0] = x + w;
        rectangulo[1] = x;
        rectangulo[2] = y;
        rectangulo[3] = y + h;

    }

    private static void dibujarCirculo(String poder, int level, int x, int y) {
        int r = radio(poder, level);
        circulo[0] = x - r;
        circulo[1] = x + r;
        circulo[3] = y + r;
        circulo[2] = y - r;
    }

    private static int radio(String poder, int nivel) {
        switch (poder) {
            case "fire":
                switch (nivel) {
                    case 1:
                        return 20;
                    case 2:
                        return 30;
                    case 3:
                        return 50;
                }
                break;
            case "water":
                switch (nivel) {
                    case 1:
                        return 10;
                    case 2:
                        return 25;
                    case 3:
                        return 40;
                }
                break;
            case "earth":
                switch (nivel) {
                    case 1:
                        return 25;
                    case 2:
                        return 55;
                    case 3:
                        return 70;
                }
                break;
            case "air":
                switch (nivel) {
                    case 1:
                        return 18;
                    case 2:
                        return 38;
                    case 3:
                        return 60;
                }
                break;
        }
        return 0;
    }

    private static int respuesta(int w, int h, int x, int y, String poder, int level, int x0, int y0) {
        int dano = damage(poder);
        dibujarCuadrado(w, h, x, y);
        dibujarCirculo(poder, level, x0, y0);
        if (validación()) {
            return dano;
        }
        return 0;
    }

    private static int damage(String poder) {
        switch (poder) {
            case "fire":
                return 200;
            case "water":
                return 300;
            case "earth":
                return 400;
            case "air":
                return 100;
        }
        return 0;
    }

    private static boolean validación() {
        if ((rectangulo[0] >= circulo[0] && rectangulo[0] <= circulo[1]) || (rectangulo[1] <= circulo[1] && rectangulo[1] >= circulo[0])) {
            if ((rectangulo[2] >= circulo[2] && rectangulo[2] <= circulo[3]) || (rectangulo[3] <= circulo[2] && rectangulo[3] >= circulo[3])) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
