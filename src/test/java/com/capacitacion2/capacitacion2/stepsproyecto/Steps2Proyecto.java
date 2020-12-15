package com.capacitacion2.capacitacion2.stepsproyecto;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase6tarea.Calculadora;
import com.capacitacion2.capacitacion2.proyecto.PageObjectSophos;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2Proyecto {
	private ManagerDriver managerFriver;
	private String  nombreNavegador;
	private String  urlPagina;
	private PageObjectSophos objsophos;

	@Given("^El usuario  elige  el navegador \"([^\"]*)\"$")
	public void el_usuario_elige_el_navegador(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.nombreNavegador = arg1;
		
	}
	
	@Given("^El usuario elige la pagina  \"([^\"]*)\"$")
	public void el_usuario_elige_la_pagina(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.urlPagina = arg1;
	}
	
	
	
	@Then("^el usuario  lanza el navegador con la pagina$")
	public void el_usuario_lanza_el_navegador_con_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		managerFriver = new ManagerDriver(nombreNavegador,urlPagina);
		managerFriver.navergarAPagina();
	}
	
	


	
	@Then("^el usuario da click en trabaja con nosotros$")
	public void el_usuario_da_click_en_trabaja_con_nosotros() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objsophos = new PageObjectSophos(managerFriver.getWebDriver());
		objsophos.menu();	
	}
	
	@Then("^Se imprimen los datos de los perfiles$")
	public void se_imprimen_los_datos_de_los_perfiles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objsophos.imprimirperfiles();
	}


	
	@Then("^el  usuario cierra el navegador$")
	public void el_usuario_cierra_el_navegador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
			managerFriver.cerrar();
		}catch (Exception e) {
		}
	}



}
