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
public class TelevisionTest {
    
    public TelevisionTest() {
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
     * Test of cambiarVolumen method, of class Television.
     */
    @Test
    public void testCambiarVolumen() {
        System.out.println("cambiarVolumen");
        int cantidad = 20;
        Television instance = new Television( "Roku", "HD2398", "192.168.0.23", 24, 34);
        String expResult = "El volumen nuevo es 54";
        String result = instance.cambiarVolumen(cantidad);
        assertEquals(expResult, result);
    }
    
}
