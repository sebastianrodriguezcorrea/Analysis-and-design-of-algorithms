/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
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
public class ProductoBOTest {

    ProductoBO pbo;

    public ProductoBOTest() {
        pbo = new ProductoBO();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            pbo.crear(new Producto(1, "Chocolate", "Sol", Date.valueOf("2021-05-20"), 2500,
                    4, "24 Kilogramos", Date.valueOf("2020-05-08")));
            pbo.crear(new Producto(2, "Leche", "VivaMilk", Date.valueOf("2021-08-27"), 3800,
                    2, "1.5 Litros", Date.valueOf("2020-05-08")));
            pbo.crear(new Producto(3, "Pan", "Bimbox2", Date.valueOf("2021-03-25"), 2800,
                    6, "8 Kilogramos", Date.valueOf("2020-05-08")));
        } catch (Exception e) {
            System.out.println("ERROR. " + e.getMessage());
        }
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
    public void testEliminar() {
        String mensaje;
        String mensajeEsperado;
        try {
            if (pbo.validacionProducto(1)) {
                mensaje = pbo.eliminar(1);
                mensajeEsperado = "BORRADO CORRECTAMENTE";
            } else {
                mensaje = "El producto no ha sido eliminado. El ID del producto no existe";
                mensajeEsperado = "El producto no ha sido eliminado. El ID del producto no existe";
            }

            assertEquals(mensajeEsperado, mensaje);
        } catch (Exception e) {
            fail("Ocurrio un error al eliminar el producto");
        }
    }
}
