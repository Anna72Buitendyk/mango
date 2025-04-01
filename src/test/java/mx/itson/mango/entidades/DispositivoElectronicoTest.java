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
public class DispositivoElectronicoTest {
    
    public DispositivoElectronicoTest() {
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
     * Test of encender method, of class DispositivoElectronico.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        DispositivoElectronico instance = new DispositivoElectronico("ASUS", "A45434", "192.168.0.45");
        String expResult = "El dispositivo electronico esta encendido";
        String result = instance.encender();
        assertEquals(expResult, result);
    }
    
}
