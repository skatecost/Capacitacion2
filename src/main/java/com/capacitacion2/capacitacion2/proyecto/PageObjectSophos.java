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
	
	public void imprimirperfiles() {
		
		System.out.println("\n \n \n  LOS PERFILES QUE SE BUSCAN PARA TRABAJAR CON SOPHOS SON \n \n");
		for (WebElement posicion: listaPerfiles) {
			System.out.println(" Los perfiles disponibles para el SOPHOS : "+posicion.getText());
		}		     
							
	}
	
}

