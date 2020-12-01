package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.capacitacion2.capacitacion2.clase5.AnalizarTexto;

public class AnalizrTextoTest {
	private AnalizarTexto objAnalizarTexto;
	private String  oracion ;
	
	@Before 
	public void  before(){
		System.out.println("se ejecuto el antes ");
		oracion = " esta clase es de pruebas unitarias  ";
		objAnalizarTexto = new AnalizarTexto(oracion);
	}
	
	@Test
	public void testDeterminarNumeroDePalabras() {
		System.out.println("testDeterminarNumeroDePalabras");
		int valorEsperado = 6 ;
		int valorRecibido = objAnalizarTexto.determinarNumeroDePalabras(oracion) ;
		assertEquals(valorEsperado,valorRecibido);		
	}
	@Test
	public void testCantidadCaracteres() {
		System.out.println("testCantidadCaracteres");
		int esperado = 37;
		int resultado = objAnalizarTexto.cantidadCaracteres();
		assertEquals(esperado,resultado);		
	}
		
	@After
	public void After() {
		System.out.println("se ejecuto el After ");		
	}

}
