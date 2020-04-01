/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.abd.coronavirus.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import co.edu.usbbog.abd.coronavirus.model.Coronavirus;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Coronavirus {
    private String nombreP;
    private int numcont;
    private int numdead;

    public Coronavirus(String nombreP, int numcont, int numdead) {
        this.nombreP = nombreP;
        this.numcont = numcont;
        this.numdead = numdead;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getNumcont() {
        return numcont;
    }

    public void setNumcont(int numcont) {
        this.numcont = numcont;
    }

    public int getNumdead() {
        return numdead;
    }

    public void setNumdead(int numdead) {
        this.numdead = numdead;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombreP);
        hash = 67 * hash + this.numcont;
        hash = 67 * hash + this.numdead;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coronavirus other = (Coronavirus) obj;
        if (this.numcont != other.numcont) {
            return false;
        }
        if (this.numdead != other.numdead) {
            return false;
        }
        if (!Objects.equals(this.nombreP, other.nombreP)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return  "Pais= " + nombreP + ", numero de contagiados= " + numcont + ", numeero de muertos= " + numdead ;
    }
}
