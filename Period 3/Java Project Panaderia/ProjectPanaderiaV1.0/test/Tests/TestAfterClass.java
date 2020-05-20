/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
import co.edu.usbbog.ADA.ProjectPanaderia.db.Conexion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 *
 * @author Juan Sebastian
 */
public class TestAfterClass {

    private static Conexion co;
    ProductoBO prbo;

    public TestAfterClass() {
        co = new Conexion();
        prbo = new ProductoBO();
    }

    @BeforeClass
    public static void setUpClass() {
        Conexion.getConnection();
    }

    @AfterClass
    public static void tearDownClass() {
        co.desconexion();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestEliminar() {
        try {
            String mensaje = prbo.eliminar(1);
            String mensajeEsperado = "BORRADO CORRECTAMENTE";

            assertEquals(mensajeEsperado, mensaje);
        } catch (Exception e) {
            fail("Ha ocurrido un error al borrar el producto");
        }
    }

    //Con la anotación @Ignore no se tiene en cuenta el testeo de un método en particular.
    @Test
    @Ignore
    public void TestPrueba() {
        System.out.println(5 * 2);
    }

    @Rule
    public Timeout timeout = Timeout.millis(5000);
}
