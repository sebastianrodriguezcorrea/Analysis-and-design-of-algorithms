/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.test;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Date;

/**
 *
 * @author Juan Sebastian
 */
public class Test {
    ProductoBO productoBO = new ProductoBO();
    Producto producto = new Producto();
    String mensaje = "";
    
    public void insertar(){
        
        producto.setId(1);
        producto.setNombre("Cafe");
        producto.setMarca("Cafe Aguila Roja");
        producto.setFecha_vencimiento(Date.valueOf("2020-04-12"));
        producto.setCosto(3500);
        producto.setCantidad(30);
        producto.setPeso("Kilogramos");
        producto.setFecha_venta(Date.valueOf("2020-08-11"));
        mensaje = productoBO.crear(producto);
        System.out.println(mensaje);
    }
    
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.insertar();
//    }
}
