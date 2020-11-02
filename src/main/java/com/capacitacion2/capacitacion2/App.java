package com.capacitacion2.capacitacion2;

import com.capacitacion2.case3.AutomatizacionPaginaWeb;
import com.cpacitacion2.clase4.ManagerDriver;
import com.cpacitacion2.clase4.PageObjectTourFrancia;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/* TERCERA  CLASE		
		// AutomatizacionPaginaWeb aut = new AutomatizacionPaginaWeb();
		// aut.interactuarConGmail();
        */
        String urlPagina = "https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
		ManagerDriver objMnager = new ManagerDriver("google", urlPagina);
		objMnager.navergarAPagina();
		PageObjectTourFrancia objTour = new PageObjectTourFrancia(objMnager.getWebDriver());
		
		for (int i=1;i<=21;i++ ) {

			
				objTour.seleccionListaDesokegable("Etapa "+i);
			try {
				Thread.sleep(5000);
				objTour.impromirListaCiclistas();
			}catch (Exception e) {
				
			}

		}

		try {
			Thread.sleep(5000);
			
		}catch (Exception e) {
			
		}
		
		objMnager.cerrar();
	}
}
