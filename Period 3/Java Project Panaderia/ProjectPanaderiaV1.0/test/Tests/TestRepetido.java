/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import co.edu.usbbog.ADA.ProjectPanaderia.db.Conexion;
import static org.hamcrest.CoreMatchers.isA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Juan Sebastian
 */
@RunWith(Parameterized.class)
public class TestRepetido {

    private Conexion co;
    
    public TestRepetido() {
        co = new Conexion();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("----------------------- Inicio prueba ---------------------");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("----------------------- Fin prueba -----------------------");
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
    @Parameterized.Parameters
    public static Object[][] datos() {
        return new Object[10][0];
    }

    @Test
    public void TestRepetirDiezVecesConexion() {
        Conexion.getConnection();
        assertThat(co, isA(Conexion.class));
    }
    
    @Test
    public void TestRepetirDiezVecesDesconexion(){
        co.desconexion();
    }
}
