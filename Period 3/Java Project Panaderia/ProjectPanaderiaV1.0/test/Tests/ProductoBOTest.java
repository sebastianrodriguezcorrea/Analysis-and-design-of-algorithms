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
public class ProductoBOTest {

    ProductoBO pbo;
    Conexion co;

    public ProductoBOTest() {
        this.pbo = new ProductoBO();
        this.co = new Conexion();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("--------------- Inicio del Testeo -----------------");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("--------------- Fin del Testeo -------------------");
    }

    @Before
    public void setUp() {
        Conexion.getConnection();
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
    public void testCrear() {
        String mensaje;
        String mensajeEsperado;
        try {
            mensaje = pbo.crear(new Producto(1, "Chocolate", "Sol", Date.valueOf("2021-05-20"), 2500,
                    4, "24 Kilogramos", Date.valueOf("2020-05-08")));
            pbo.crear(new Producto(2, "Leche", "VivaMilk", Date.valueOf("2021-08-27"), 3800,
                    2, "1.5 Litros", Date.valueOf("2020-05-08")));
            pbo.crear(new Producto(3, "Pan", "Bimbox2", Date.valueOf("2021-03-25"), 2800,
                    6, "8 Kilogramos", Date.valueOf("2020-05-08")));
            mensajeEsperado = "GUARDADO CORRECTAMENTE";

            assertEquals(mensajeEsperado, mensaje);

            //El mensaje correcto es "BORRADO CORRECTAMENTE"
            //En AssertNotEquals se pone diferente para que se cumpla la condición.
            assertNotEquals("NO SE PUDO GUARDAR CORRECTAMENTE", mensaje);

        } catch (Exception e) {
            System.out.println("ERROR. " + e.getMessage());
            fail("Ocurrio un error al crear el producto");
        }
    }

    @Test
    public void testEditar() {
        String mensaje;
        String mensajeEsperado;
        try {
            assertFalse("Comprobación Erronea", pbo.validacionProducto(1));
            assertFalse("Comprobación Erronea", pbo.validacionProducto(2));
            assertFalse("Comprobación Erronea", pbo.validacionProducto(3));
            if (pbo.validacionProducto(1) && pbo.validacionProducto(2) && pbo.validacionProducto(3)) {
                mensaje = pbo.editar(new Producto(1, "Huevos", "Buen Sol", Date.valueOf("2021-05-20"), 2500,
                        4, "24 Kilogramos", Date.valueOf("2020-05-08")));
                pbo.editar(new Producto(2, "Cafe", "Sello Rojo", Date.valueOf("2021-08-27"), 3800,
                        2, "1.5 Litros", Date.valueOf("2020-05-08")));
                pbo.editar(new Producto(3, "Queso", "Don Queso", Date.valueOf("2021-03-25"), 2800,
                        6, "8 Kilogramos", Date.valueOf("2020-05-08")));
                mensajeEsperado = "ACTUALIZADO CORRECTAMENTE";
            } else {
                mensaje = "No ha sido posible actualizar los datos. ID incorrecto.";
                mensajeEsperado = "No ha sido posible actualizar los datos. ID incorrecto.";
            }

            assertEquals(mensajeEsperado, mensaje);

            //El mensaje correcto es "BORRADO CORRECTAMENTE"
            //En AssertNotEquals se pone diferente para que se cumpla la condición.
            assertNotEquals("ACTUALIZADO CORRECTAMENTE", mensaje);

        } catch (Exception e) {
            System.out.println("ERROR. " + e.getMessage());
            fail("Ocurrio un error al actualizar el producto");
        }
    }

    @Test
    public void testEliminar() {
        String mensaje;
        String mensajeEsperado;
        try {
            assertTrue("Comprobación Erronea", pbo.validacionProducto(1));
            assertTrue("Comprobación Erronea", pbo.validacionProducto(2));
            assertTrue("Comprobación Erronea", pbo.validacionProducto(3));
            if (pbo.validacionProducto(1) && pbo.validacionProducto(2) && pbo.validacionProducto(3)) {
                mensaje = pbo.eliminar(1);
                pbo.eliminar(2);
                pbo.eliminar(3);
                mensajeEsperado = "BORRADO CORRECTAMENTE";
            } else {
                mensaje = "El producto no ha sido eliminado. El ID del producto no existe";
                mensajeEsperado = "El producto no ha sido eliminado. El ID del producto no existe";
            }

            assertEquals(mensajeEsperado, mensaje);

            //El mensaje correcto es "BORRADO CORRECTAMENTE"
            //En AssertNotEquals se pone diferente para que se cumpla la condición.
            assertNotEquals("NO SE PUDO BORRAR CORRECTAMENTE", mensaje);

        } catch (Exception e) {
            fail("Ocurrio un error al eliminar el producto");
        }
    }
}
