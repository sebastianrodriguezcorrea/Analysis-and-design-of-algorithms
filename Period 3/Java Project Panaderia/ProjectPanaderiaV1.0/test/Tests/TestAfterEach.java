/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
import co.edu.usbbog.ADA.ProjectPanaderia.db.Conexion;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Sebastian
 */
public class TestAfterEach {

    Conexion co;

    public TestAfterEach() {
        this.co = new Conexion();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("----------------- Se van a ejecutar los Testeos ---------------------");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("----------------- Los testeos se han realizado ---------------------");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        co.desconexion();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestObtenerConexion(){
        Connection co = Conexion.getConnection();
    }
    
    @Test
    public void TestConexion(){
        Conexion.getConnection();
    }
}
