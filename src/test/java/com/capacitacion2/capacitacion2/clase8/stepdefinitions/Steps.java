package com.capacitacion2.capacitacion2.clase8.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.capacitacion2.capacitacion2.clase10.Palabras;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private List<Integer> listaNumeros;
	private int ultimoResultado;
	private Palabras objPalabras;
	@Before
	public void antesDe() {
		ultimoResultado = 0;	
		System.out.println("inicializan las variables");
	}
	
	@After
	public void despuesDe() {
		listaNumeros.clear();
		ultimoResultado = 0 ; 	
		System.out.println("Se reinician los valores");
	} 
	
	@Given("^el usuario escribe la oracion")
	public void tomaroracion() throws Throwable {
		String oracion = JOptionPane.showInputDialog("ingrese la oracion"); 
		objPalabras  = new Palabras(oracion);
	    
	}
	
	@Given("^el usuario envia oracion \"([^\"]*)\"$")
	public void envioOracion(String oracion) throws Throwable {
		objPalabras  = new Palabras(oracion);
	    System.out.println("Se ingresa elemento a la lista" + oracion);
	}
	
	@Given("^dada unalista de numeros$")
	public void establecerlista() {
		listaNumeros = new ArrayList<>();
		System.out.println("Se crea la lista");
	}
	
	@Given("^el numero a igual a (\\d+)$")
	public void el_numero_a_igual_a(int arg1) throws Throwable {
	    listaNumeros.add(arg1); 
	    System.out.println("Se ingresa elemento a la lista" + arg1);
	}

	@Given("^el numero b igual a (\\d+)$")
	public void el_numero_b_igual_a(int arg1) throws Throwable {
		listaNumeros.add(arg1);
		System.out.println("Se ingresa elemento a la lista" + arg1);
	}

	@Given("^el numero c igual a (\\d+)$")
	public void el_numero_c_igual_a(int arg1) throws Throwable {
		listaNumeros.add(arg1);
		System.out.println("Se ingresa elemento a la lista" + arg1);
	}
 
 
	@When("^sume los  dos valores$")
	public void sume_los_dos_valores() throws Throwable {
	    for (Integer numero : listaNumeros) {
	    	 ultimoResultado +=numero; System.out.println("Se suma el valor" + ultimoResultado);
	    	 
	    }
	}

	@Then("^la suma debe ser igual a (\\d+)$")
	public void la_suma_debe_ser_igual_a(int arg1) throws Throwable {
	   	 System.out.println("Se comparan los valores" );
	    assertEquals(arg1,ultimoResultado);
	}
	
	@And("^el usuario envia la palabra \"([^\"]*)\"$")
	public void el_usuario_envia_la_palabra(String arg1) throws Throwable {
		System .out.println("La oracion recibida es " + arg1);
	}
	
	@Then("^el usuario valida la longitud (\\d+)$")
	public void validaLongitud(int numero) throws Throwable {
		System.out.println("longitud de entrada" + numero);
		assertEquals(numero,objPalabras.longitudPalabra());
	}
	
	@When("^El usuario concatena la  oracion \"([^\"]*)\"$")
	public void concatenar(String complemento ) throws Throwable {
		System.out.println("el usuario concatena la oracion");
		assertTrue(!objPalabras.concatenar(complemento).isEmpty());
	}
	
	@When("^El usuario valida la oracion esperada  \"([^\"]*)\"$")
	public void validarOracion(String oracionValidar ) throws Throwable {
		assertEquals(oracionValidar,objPalabras.getPalabra());
	}
}
