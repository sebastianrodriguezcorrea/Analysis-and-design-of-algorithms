/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Sebastian
 */
public class Dijkstra {

    static Scanner e = new Scanner(System.in);
    static ArrayList<String> objeto = new ArrayList<>();

    public static void main(String[] args) {
        String joya = e.next();
        while (joya.contains("(") || joya.contains(")")) {
            agregarJoya(joya);
            joya = e.next();

        }
        System.out.println(objeto.size());
    }

    private static void agregarJoya(String joya) {
        if (!verificarJoya(joya)) {
            objeto.add(joya);
        }
    }

    private static boolean verificarJoya(String joya) {
        for (int i = 0; i < objeto.size(); i++) {
            if (joya.equals(objeto.get(i))) {
                return true;
            }
        }
        return false;
    }

}
