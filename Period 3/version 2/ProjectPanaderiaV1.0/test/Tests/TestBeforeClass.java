/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
import co.edu.usbbog.ADA.ProjectPanaderia.db.Conexion;
import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Date;
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
public class TestBeforeClass {

    Conexion co;
    ProductoBO prbo;

    public TestBeforeClass() {
        co = new Conexion();
        prbo = new ProductoBO();
    }

    @BeforeClass
    public static void setUpClass() {
        Conexion.getConnection();
    }

    @AfterClass
    public static void tearDownClass() {
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
    public void TestEditar() {
        try {
            String mensaje = prbo.editar(new Producto(4, "Pan Bague", "Bimbo", Date.valueOf("2021-06-13"), 4000, 24,
                    "12 Unidades", Date.valueOf("2020-05-07")));
            String mensajeEsperado = "ACTUALIZADO CORRECTAMENTE";
            assertEquals(mensajeEsperado, mensaje);
        }catch(Exception e){
            fail("Ocurrió un error al actualizar el producto");
        }
    }
}
