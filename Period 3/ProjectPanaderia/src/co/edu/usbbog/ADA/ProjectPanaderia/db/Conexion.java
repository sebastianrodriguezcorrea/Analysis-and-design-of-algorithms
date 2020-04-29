/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.db;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian
 */
public class Conexion {

    private static Connection conn = null;
    private static String usuario = "postgres";
    private static String clave = "PASSWORD";
    private static String url = "jdbc:postgresql://localhost:5432/Prueba1";

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usuario, clave);
            if (conn != null) {
                System.out.println("Base de datos conectada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
        }
        return conn;
    }

    public void desconexion() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }

    //Prueba de conexión con la base de datos.
//    public static void main(String[] args) {
//        Conexion c = new Conexion();
//        Conexion.getConnection();
//    }
}
