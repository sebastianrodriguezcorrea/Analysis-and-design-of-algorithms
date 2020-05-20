/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.dao;

import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Sebastian
 */
public class ProductoDAOimpl implements ProductoDAO {

    private String mensaje = "";

    @Override
    public String crear(Connection con, Producto producto) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO producto (id, nombre, marca, fecha_vencimiento, costo, unidades, peso, fecha_venta) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, producto.getId());
            pst.setString(2, producto.getNombre());
            pst.setString(3, producto.getMarca());
            pst.setDate(4, producto.getFecha_vencimiento());
            pst.setInt(5, producto.getCosto());
            pst.setInt(6, producto.getCantidad());
            pst.setString(7, producto.getPeso());
            pst.setDate(8, producto.getFecha_venta());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String editar(Connection con, Producto producto) {
        PreparedStatement pst = null;
        String sql = "UPDATE producto SET nombre = ?, marca = ?, fecha_vencimiento = ?, costo = ?, unidades = ?, peso = ?, fecha_venta = ? "
                + "WHERE id = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, producto.getNombre());
            pst.setString(2, producto.getMarca());
            pst.setDate(3, producto.getFecha_vencimiento());
            pst.setInt(4, producto.getCosto());
            pst.setInt(5, producto.getCantidad());
            pst.setString(6, producto.getPeso());
            pst.setDate(7, producto.getFecha_venta());
            pst.setInt(8, producto.getId());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String eliminar(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM producto WHERE id = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "BORRADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO BORRAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }

    public void listarProducto(Connection con, JTable tabla) {

        DefaultTableModel model;
        String[] columnas = {"ID", "Nombre", "Marca", "vencimiento", "Costo", "Unidades", "Peso", "Fecha venta"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM producto ORDER BY id";

        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;

        try {

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }

    @Override
    public void buscarProductos(Connection con, java.sql.Date fecha_venta, JTable tabla) throws SQLException {
        DefaultTableModel model;
        String[] columnas = {"ID", "Nombre", "Marca", "vencimiento", "Costo", "Unidades", "Peso", "Fecha venta"};
        model = new DefaultTableModel(null, columnas);

        PreparedStatement pst = null;
        String sql = "SELECT * FROM producto WHERE fecha_venta = " + "'" + fecha_venta + "'" + " ORDER BY id";

        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;

        try {

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla " + e.getMessage());
        }
    }

    @Override
    public void verReporteVentas(Connection con, java.sql.Date fecha_venta, JTable tabla) throws SQLException {
        DefaultTableModel model;
        String[] columnas = {"Nombre", "Marca", "Total costo", "Total Unidades"};
        model = new DefaultTableModel(null, columnas);

        PreparedStatement pst = null;
        String sql = "SELECT nombre, marca, SUM(costo*unidades) AS total_costo, SUM(unidades) AS total_unidades FROM (SELECT * FROM producto WHERE fecha_venta = '" + fecha_venta + "') AS prueba GROUP BY ROLLUP(nombre,marca)";

        String[] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        try {

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla " + e.getMessage());
        }
    }

    public boolean validarProducto(Connection con, int id) {

        String sql = "SELECT * FROM producto WHERE id = " + id;

        boolean verificador = false;
        Statement st = null;
        ResultSet rs = null;

        try {

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).isEmpty()) {
                    verificador = false;
                } else {
                    verificador = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al validar el producto " + e.getMessage());
        }
        return verificador;
    }
}
