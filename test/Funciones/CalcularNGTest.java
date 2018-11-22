/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import modelo.Entradas;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author luisignacio
 */
public class CalcularNGTest {
    
    public CalcularNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of isRut method, of class Entradas.
     */
    @Test
    public void testValidar_rut() {
        System.out.println("isRut");
        String rut = "19.208.616-7";
        boolean expResult = true;
        boolean result = Entradas.validar_rut(rut);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isNombre method, of class Entradas.
     */
    @Test
    public void testValidar_nombre() {
        System.out.println("isNombre");
        String Nom = "Alfred";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_nombre(Nom);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApellido_Paterno method, of class Entradas.
     */
    @Test
    public void testValidar_apellido_p() {
        System.out.println("isApellido_Paterno");
        String AP = "ulfric";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_apellido_p(AP);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApellido_Materno method, of class Entradas.
     */
    @Test
    public void testValidar_apellido_m() {
        System.out.println("isApellido_Materno");
        String AM = "Proud";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_apellido_m(AM);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isEmail method, of class Entradas.
     */
    @Test
    public void testValidar_email() {
        System.out.println("isEmail");
        String em = "alguien@algo.com";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_email(em);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isTelefono method, of class Entradas.
     */
    @Test
    public void testValidar_telefono() {
        System.out.println("isTelefono");
        int tel = 123456789;
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_telefono(tel);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isMonto method, of class Entradas.
     */
    @Test
    public void testValidar_monto() {
        System.out.println("isMonto");
        int money = 1000000;
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_monto(money);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testValidar_plazo() {
        System.out.println("isMonto");
        int plazo = 7;
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.validar_plazo(plazo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isValidarFecha method, of class Entradas.
     */
    @Test
    public void testValidar_fecha_nacimiento()throws Exception{
        System.out.println("validar_fecha_nacimiento");
        String fecha = "06/09/2018";
        boolean expResult = true;
        boolean result = Entradas.validar_fecha_nacimiento(fecha);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }
}
