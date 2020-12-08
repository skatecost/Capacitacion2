package com.capacitacion2.capacitacion2.clase8.Tarea.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

import com.capacitacion2.capacitacion2.clase6tarea.Calculadora;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 {
	private  double  numeroA;
	private  double  numeroB;
	private  double  resultadoSuma;
	private  double  resultadoResta;
	private  double  resultadoMultiplicacion;
	private  double  resultadoDivision;
	private Calculadora calc;
	
	
	@Before
	public void antesDe() {
		numeroA = 0 ;
		numeroB = 0 ;
		resultadoSuma = 0 ;
		resultadoResta =  0 ;
		resultadoMultiplicacion = 0 ;
		resultadoDivision = 0 ;
		System.out.println("inicializan las variables");
	}
	
	@After
	public void despuesDe() {
		numeroA = 0 ;
		numeroB = 0 ;
		resultadoSuma = 0 ;
		resultadoResta =  0 ;
		resultadoMultiplicacion = 0 ;
		resultadoDivision = 0 ;
		System.out.println("Se reinician los valores");
	}
	
	@Given("^ingresar primer numero (\\d+)$")
	public void ingresar_primer_numero_nuemeroA(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    numeroA = arg1;
	}

	@Given("^ingresar segundo numero (\\d+)$")
	public void ingresar_segundo_numero(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 numeroB = arg1;
	}

	@Given("^instanciar la  calculadora$")
	public void instanciar_la_calculadora() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calc = new  Calculadora();
		calc.Calculadora(numeroA,numeroB);
	}
	
	@When("^sume los valores$")
	public void sume_los_valores() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 resultadoSuma = calc.suma();
	     
	}

	@Then("^La suma debe ser igual a (\\d+)$")
	public void la_suma_debe_ser_igual_a(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(resultadoSuma,arg1,1);
	}

	@When("^reste los valores$")
	public void reste_los_valores() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		resultadoResta = calc.resta();

	}

	@Then("^La resta debe ser igual a (\\d+)$")
	public void la_resta_debe_ser_igual_a(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(resultadoResta,arg1,1);
	}

	@When("^multiplique los valores$")
	public void multiplique_los_valores() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 resultadoMultiplicacion = calc.multiplicacion();
		 
	}

	@Then("^la multiplicacion debe ser igual a (\\d+)$")
	public void la_multiplicacion_debe_ser_igual_a(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(resultadoMultiplicacion,arg1,1);
	}

	@When("^divida los valores$")
	public void divida_los_valores() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		resultadoDivision = calc.division();
	}

	@Then("^la divisio es igual a  (\\d+)$")
	public void la_divisio_es_igual_a(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(resultadoDivision,arg1,1);
	}
	
	
}
