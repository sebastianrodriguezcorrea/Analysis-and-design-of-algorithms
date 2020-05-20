/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.dao;

import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JTable;

/**
 *
 * @author Juan Sebastian
 */
public interface ProductoDAO {
    
    public String crear(Connection con, Producto producto);
    
    public String editar(Connection con, Producto producto);
    
    public String eliminar(Connection con, int id);
    
    public void buscarProductos(Connection con, Date fecha_venta, JTable tabla) throws SQLException;
    
    public void verReporteVentas(Connection con, Date fecha_venta, JTable tabla) throws SQLException;
    
}
