/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.abd.coronavirus.controller.logic;

import co.edu.usbbog.abd.coronavirus.model.Coronavirus;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 304
 */
public class Unificador {
ArrayList<Coronavirus> listaCorona = new ArrayList<Coronavirus>();

    public boolean add(Coronavirus o) {
        if (listaCorona.add(o)) {
            return true;
        } else {
            return false;
        }

    }
    
    public void ordenaBurbuja(){
        for (int i = 0; i < listaCorona.size()-1; i++) {
            for (int j = i+1; j < listaCorona.size(); j++) {
                if (listaCorona.get(i).getNumcont()>listaCorona.get(j).getNumcont()) {
                    Coronavirus temp = listaCorona.get(i);
                    listaCorona.set(i, listaCorona.get(j));
                    listaCorona.set(j, temp);
                }
            }
        }
    }
    

    public void delete(Coronavirus o) {

        try {

            for (int i = 0; i < listaCorona.size(); i++) {

                if (listaCorona.get(i).getNombreP().equalsIgnoreCase(o.getNombreP())) {
                    listaCorona.remove(i);
                }
            }

            JOptionPane.showMessageDialog(null, "El elemento se eliminó prro");

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia, por favor ingresar un elemento antes de eliminar");
        }

    }

    public void modify(Coronavirus o) {
        try {

            for (int i = 0; i < listaCorona.size(); i++) {

                if (listaCorona.get(i).getNombreP().equalsIgnoreCase(o.getNombreP())) {

                    listaCorona.set(i, o);
                }
            }
            JOptionPane.showMessageDialog(null, "El elemento se modifico correctamente");

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "El elemento no se modifico ");
        }

    }

    public void mostrar() {

        for (int i = 0; i < listaCorona.size(); i++) {
            System.out.println(listaCorona.get(i));
        }

    }
    

    
}
