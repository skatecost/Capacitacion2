package com.capacitacion2.capacitacion2.clase4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerDriver {
	private WebDriver webDriver;
	private String nombreNavegador;
	private String urlPagina;
		
	public ManagerDriver(String nombreNavegador,String urlPagina){

			this.nombreNavegador = nombreNavegador;
			this.urlPagina = urlPagina;
			seleccionarNavegador();
	
		}
	private void seleccionarNavegador() {
		
		switch(nombreNavegador.toLowerCase().trim()) {
		
		case "google":
				System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
				webDriver = new ChromeDriver();
				System.out.print("datos de la url de la pagina"+nombreNavegador.toLowerCase().trim());
			break;
		case "firefox":
		
			break;
		case "ie":
		
			break;
		}
	
	}
	
	public void  navergarAPagina() {
		
		webDriver.get(urlPagina);
	}
		
	public void  cerrar() {
		webDriver.close();		
	}
	public WebDriver getWebDriver() {
		try {
			Thread.sleep(8000);
			
		}catch (Exception e) {
			
		}
		
		
		return webDriver;
	}
	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	public String getNombreNavegador() {
		return nombreNavegador;
	}
	public void setNombreNavegador(String nombreNavegador) {
		this.nombreNavegador = nombreNavegador;
	}
	public String getUrlPagina() {
		return urlPagina;
	}
	public void setUrlPagina(String urlPagina) {
		this.urlPagina = urlPagina;
	}	
}
