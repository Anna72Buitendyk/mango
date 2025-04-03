/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mango.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class ComputadoraTest {
    
    public ComputadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of actualizarMemoriaDisco method, of class Computadora.
     */
    @Test
    public void testActualizarMemoriaDisco() {
        System.out.println("actualizarMemoriaDisco");
        double cantidad = 34.4;
        Computadora instance = new Computadora("ASUS", "A45434", "192.168.0.45", 16, 256);
        instance.actualizarMemoriaDisco(cantidad);
    }
}
