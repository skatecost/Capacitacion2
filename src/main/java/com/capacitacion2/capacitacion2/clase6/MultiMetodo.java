package com.capacitacion2.capacitacion2.clase6;

public class MultiMetodo {
	
	public String  getPalabra(String finalPalabra){
		return "Palabra"+finalPalabra;		
	}
	
	public char[] getArregloDeCaracteres(String Palabra) {
		char[] arreglo = new char[Palabra.length()];
		for (int i = 0; i<Palabra.length();i++) {
			arreglo[i] = Palabra.charAt(i);
			System.out.println(arreglo[i]);
		}
		return arreglo;
	} 
	
	public boolean getOpositive(boolean valor) {
		return !valor;
	}
	
	
	public int  dividir (int divisor , int  dividendo) {
		int resultado  = dividendo / divisor ;
		return  resultado;
	}
	
	public String metodoNulo() {
		return "afsdfaf";		
	}
	
	public void timeout() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
