package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

public class MultiMetodoTest {
	MultiMetodo objMetodo;
	
	
	@Before
	public void inicializarPrecondiciones() {
		objMetodo =  new  MultiMetodo();
	}
	
	@Test
	public void testGetPalabra() {
		String expected = "Palabra1";
		String resultado   = objMetodo.getPalabra("1");
		assertEquals(expected,resultado);
		
	}
	@Test
	public void testgetArregloDeCaracteres () {
		String palabra = "clase 6";
		char[] arreglEsperado = palabra.toCharArray();
		System.out.println(arreglEsperado);
		char[] actual = objMetodo.getArregloDeCaracteres(palabra);
		System.out.println(actual);
		
		assertArrayEquals(arreglEsperado,actual);
	}
	
	@Test
	public void tesstGetOpositive() {
		boolean esperado = false;
		boolean actual = objMetodo.getOpositive(false);
		assertTrue(actual);
	}
	
	@Test
	public void testDividir() {
	   int esperado = 5;
	   int  actual = objMetodo.dividir(2,10);
	   assertEquals(esperado,actual,0.1);
	}
	
	@Test
	public void  testMetodoNulo() {
		assertNotNull(objMetodo.metodoNulo());
		
	}
	
	@Test (expected = ArithmeticException.class)
	public void  testDividirr() {
		assertEquals(0,objMetodo.dividir(0,10));
	}
	
	
}
