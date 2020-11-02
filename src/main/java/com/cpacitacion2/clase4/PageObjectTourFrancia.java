package com.cpacitacion2.clase4;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectTourFrancia extends PageFactory {
   private  WebDriver  webDriver;
	public PageObjectTourFrancia(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		this.webDriver = webDriver;
	}
	
	@FindBy(id = "selectweb")
	private  WebElement listaSeleccionableMultiple;
	

	@FindBy(className = "ue-table-ranking__cyclist-name")
	private List<WebElement> listaCiclistas;
 	
	public void seleccionListaDesokegable(String opcion) {
		Select select = new Select (listaSeleccionableMultiple);
		select.selectByVisibleText(opcion);
		System.out.println("De la "+opcion);
	}
	
	public void impromirListaCiclistas() {
		//WebElement lista = webDriver.findElement(By.name()); 
		int acumulador = 1;
		for (WebElement posicion: listaCiclistas) {
			
			if (acumulador ==1) {
				System.out.println(" llegando en  "+acumulador+" posicion el ganador es : "+posicion.getText());
			}		     
			acumulador++;			
		}acumulador = 1;
	}
	
}

