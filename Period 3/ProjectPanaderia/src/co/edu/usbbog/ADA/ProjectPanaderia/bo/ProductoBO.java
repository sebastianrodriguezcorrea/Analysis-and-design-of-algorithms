/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.bo;

import co.edu.usbbog.ADA.ProjectPanaderia.dao.ProductoDAOimpl;
import co.edu.usbbog.ADA.ProjectPanaderia.db.Conexion;
import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Juan Sebastian
 */
public class ProductoBO {

    private String mensaje = "";

    private ProductoDAOimpl productoDao = new ProductoDAOimpl();

    public String crear(Producto producto) {

        Connection conn = Conexion.getConnection();

        try {
            mensaje = productoDao.crear(conn, producto);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String editar(Producto producto) {
        Connection conn = Conexion.getConnection();

        try {
            mensaje = productoDao.editar(conn, producto);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminar(int id) {
        Connection conn = Conexion.getConnection();

        try {
            mensaje = productoDao.eliminar(conn, id);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listar(JTable tabla){
        Connection conn = Conexion.getConnection();
        productoDao.listarProducto(conn, tabla);
        try{
            conn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void listarProductos(JTable tabla, Date fecha_venta){
        Connection conn = Conexion.getConnection();
        try {
            productoDao.buscarProductos(conn, fecha_venta, tabla);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void listarReporte(JTable tabla, Date fecha_venta){
        Connection conn = Conexion.getConnection();
        try{
            productoDao.verReporteVentas(conn, fecha_venta, tabla);
            conn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
