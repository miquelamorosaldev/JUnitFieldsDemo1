package junitfieldsdni;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author alumne
 */
public class JunitFieldsDNITest {
    
    Validacions Validacions;
            
    public JunitFieldsDNITest() {
    }
    
    @Before
    public void setUp() {
        Validacions = new Validacions();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIncorrectDNIOnlyNumbers() {
        boolean resEsperat = false;
        boolean resReal = Validacions.isNifNie("3232");
        assertEquals(resEsperat, resReal);
    }
    
    @Test
    public void testCorrectDNI() {
        boolean resEsperat = true;
        boolean resReal = Validacions.isNifNie("12345678Z");
        assertEquals(resEsperat, resReal);
    }
    
    @Test
    public void testCorrectDNINIE() {
        boolean resEsperat = true;
        boolean resReal = Validacions.isNifNie("72994798C");
        assertEquals(resEsperat, resReal);
    }
    
    @Test
    public void testIncCorrectDNILetter() {
        boolean resEsperat = false;
        boolean resReal = Validacions.isNifNie("12345678D");
        assertEquals(resEsperat, resReal);
    }
}
