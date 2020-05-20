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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Juan Sebastian
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrden {

    Conexion co;
    ProductoBO prbo;

    public TestOrden() {
        co = new Conexion();
        prbo = new ProductoBO();
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void t1_getConexion() {
        Conexion.getConnection();
    }

    @Test
    public void t2_Crear() {
        try {
            String respuesta = prbo.crear(new Producto(4, "Pan Frances", "ComaPan", Date.valueOf("2021-06-13"), 4000, 24,
                    "12 Unidades", Date.valueOf("2020-05-07")));
            String respuestaEsperada = "GUARDADO CORRECTAMENTE";
            //Parecido al assertEquals(respuestaEsperada, respuesta);
            assertSame(respuestaEsperada, respuesta);
            //Parecido al assertNotEquals(respuestaNoEsperada, respuesta);
            assertNotSame("NO SE PUDO GUARDAR CORRECTAMENTE", respuesta);
        }catch(Exception e){
            fail("Hubo un error al crear el producto");
        }
    }
}
