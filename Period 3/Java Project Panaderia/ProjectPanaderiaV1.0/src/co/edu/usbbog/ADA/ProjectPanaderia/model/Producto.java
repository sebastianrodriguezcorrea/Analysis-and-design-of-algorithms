/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Juan Sebastian
 */
public class Producto {

    private int id;
    private String nombre;
    private String marca;
    private Date fecha_vencimiento;
    private int costo;
    private int cantidad;
    private String peso;
    private Date fecha_venta;

    public Producto(int id, String nombre, String marca, Date fecha_vencimiento, int costo, int cantidad, String peso, Date fecha_venta) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.fecha_vencimiento = fecha_vencimiento;
        this.costo = costo;
        this.cantidad = cantidad;
        this.peso = peso;
        this.fecha_venta = fecha_venta;
    }

    public Producto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + Objects.hashCode(this.fecha_vencimiento);
        hash = 97 * hash + this.costo;
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + Objects.hashCode(this.peso);
        hash = 97 * hash + Objects.hashCode(this.fecha_venta);
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
        final Producto other = (Producto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.costo != other.costo) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.fecha_vencimiento, other.fecha_vencimiento)) {
            return false;
        }
        if (!Objects.equals(this.fecha_venta, other.fecha_venta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", fecha_vencimiento=" + fecha_vencimiento + ", costo=" + costo + ", cantidad=" + cantidad + ", peso=" + peso + ", fecha_venta=" + fecha_venta + '}';
    }
    
}
