/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan Sebastian
 */
//@RunWith(Parameterized.class)
public class ProductoTest {

    public static Producto pr;
    public static Producto pr2;

    public ProductoTest() {
        pr = new Producto();
        pr2 = new Producto();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicio prueba");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Prueba finalizada");
    }

    @Before
    public void setUp() {
        pr.setId(0);
        pr.setNombre("Leche");
        pr.setMarca("Alpina");
        pr.setFecha_vencimiento(Date.valueOf("2021-08-18"));
        pr.setCosto(4500);
        pr.setCantidad(3);
        pr.setPeso("2.3 Litros");
        pr.setFecha_venta(Date.valueOf("2020-05-14"));
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Parameters
    public String getNombre() {
        return pr.getNombre();
    }

    @Test
    public void testGetProducto() {
        try {
            assertEquals(getNombre(), "Leche");
            assertNotNull(pr.getNombre());
            assertNull(pr2.getNombre());
        } catch (Exception e) {
            fail("Ocurrio un error al comprobar el producto");
        }
    }
}
