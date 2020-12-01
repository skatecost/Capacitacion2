package com.capacitacion2.capacitacion2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6tarea.Calculadora;


public class CalculadoraTest {
	Calculadora objCalculadora;
	
	@Before
	public  void  testcalculadora () {
		objCalculadora = new Calculadora();
		objCalculadora.Calculadora(10, 5);
	}
	
	@Test
	public  void  testSuma() {
		double esperado = 15;
	    double  actual =   objCalculadora.suma();
	    assertEquals(esperado,actual,0.1);
	}
	
	@Test
	public  void  testResta() {
		double esperado = 5;
		double  actual = 	objCalculadora.resta();
		assertEquals(esperado,actual,0.1);
	}
	
	@Test
	public  void  testMultiplicacion() {
		double esperado = 50;
		double  actual = objCalculadora.multiplicacion();
		assertEquals(esperado,actual,0.1);
	}
	
	@Test
	public  void  testDivision () {
		double esperado = 2;
		double  actual = objCalculadora.division();
		assertEquals(esperado,actual,0.1);
	}



}
