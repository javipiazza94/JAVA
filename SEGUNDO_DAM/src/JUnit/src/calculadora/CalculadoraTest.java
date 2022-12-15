package calculadora;

import static org.junit.Assert.*;

import org.junit.Test; 
public class CalculadoraTest {
	
		static public int suma(int a, int b) {
			return a+b;
		}
		static public int resta(int a, int b) {
			return a-b;
		}
	  @Test 
	    public void testSuma() { 
	        int resultado = CalculadoraTest.suma(2, 3); 
	        int esperado = 5; 
	        assertEquals(esperado, resultado); 
	    } 
	    @Test 
	    public void testResta() { 
	        int resultado = CalculadoraTest.resta(3, 2); 
	        int esperado = 1; 
	        assertEquals(esperado, resultado); 
	    } 

}
