package com.capacitacion2.capacitacion2;
/*
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

/*
 * Junit 4
 */
/* @RunWith (value = Parameterized.class)
public class MultiMetodoTest {
	private MultiMetodo objMetodo;
	private int esperado;
	private int variableA;
	private int variableB;
	/*
	 * 
	 */
	
	
/*	public MultiMetodoTest(int esperado, int variableA, int variableB){
		this.esperado = esperado;
		this.variableA = variableA;
		this.variableB = variableB;
     }
	
	/*
	 * Metodo estatico encargado de pasar una lista de valores a Junit en forma de
	 * objeto con el fin  de iterar varias veces una prueba
	 */
	
/*  @Parameters
	public static Iterable datosEntrada() {
		List<Object[]> listaValores = new ArrayList<>();
		listaValores.add(new Object[] {2,10,5}); //10/5=2
		listaValores.add(new Object[] {3,21,7}); //21/7=3
		listaValores.add(new Object[] {5,100,20}); //200/20=5
		listaValores.add(new Object[] {0,100,0}); //200/20=5
		return listaValores;
		
	}
	
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
	
    @Test(timeout = 4000)
    public  void testTimeout(){
    	objMetodo.timeout();
    }	
    
    @Test
    public  void testDividirValoresPositivos() {
    	int respuesta = objMetodo.dividir(variableB,variableA);
        assertEquals(esperado,respuesta);
    }  
}
*/