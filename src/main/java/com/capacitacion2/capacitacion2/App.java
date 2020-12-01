package com.capacitacion2.capacitacion2;

import com.capacitacion2.capacitacion2.clase3.AutomatizacionPaginaWeb;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectTourFrancia;
import com.capacitacion2.capacitacion2.clase5.AnalizarTexto;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
	}
	
	public  void tareaUno () {
		/* TERCERA  CLASE		
		// AutomatizacionPaginaWeb aut = new AutomatizacionPaginaWeb();
		// aut.interactuarConGmail();
        */
		/* TAREA 1 */ 
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
		/*FIN TAREA  1*/ 
	}

	
	
}
