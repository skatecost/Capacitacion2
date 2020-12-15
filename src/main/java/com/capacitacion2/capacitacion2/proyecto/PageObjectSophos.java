package com.capacitacion2.capacitacion2.proyecto;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectSophos extends PageFactory {
   private  WebDriver  webDriver;
   private WebElement menuTrabaja;
   private List<WebElement> perfiles;
   private String [] nombre ;
   private String [] descripcion ;
   private String [] fecha ;
   
	
		   
	public PageObjectSophos(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		this.webDriver = webDriver;
	}
	
 
	@FindBy(xpath = "//*[@id=\"mega-menu-item-1541\"]/a")
	private WebElement menu;
	public void menu() {
		webDriver.navigate().refresh();
		menu.click();
	}
	
	@FindBy(className = "premium-blog-entry-title")
	private List<WebElement> listaPerfiles;
	
	@FindBy(className = "premium-blog-post-content")
	private List<WebElement> listaDescripciones;
	
	@FindBy(className = "premium-blog-post-time")
	private List<WebElement> listaFechas;
	
	public void imprimirperfiles() {
		
		nombre = new String [9];
		descripcion = new String [9];
		fecha = new String [9];
		
		
		System.out.println("\n \n \n  LOS PERFILES QUE SE BUSCAN PARA TRABAJAR CON SOPHOS SON \n \n");
		int i = 0;
		int e = 0;
		int f = 0;
		
		for (WebElement posicion: listaPerfiles) {
			//System.out.println(" Los perfiles disponibles para el SOPHOS : "+posicion.getText());
			nombre[i] = posicion.getText();
			i = i + 1;
		}i = 0;
		
		for (WebElement posicion2: listaDescripciones) {
			//System.out.println(" Descripcion : "+posicion2.getText());
			descripcion[e] = posicion2.getText();
			e = e + 1;
		}e = 0;		
		
		for (WebElement posicion3: listaFechas) {
			fecha[f] = posicion3.getText();
			f = f + 1;
		}f = 0;				
		
		for (int y = 0 ; y < 9 ; y++) {
			System.out.print(" \n");
			System.out.println(" Nombre : "+ nombre [y]);
			System.out.println(" Descripcion : "+ descripcion [y]);
		    System.out.println ("fecha" + fecha[y]);  
			System.out.print(" \n");
		}	
	}
	
}

