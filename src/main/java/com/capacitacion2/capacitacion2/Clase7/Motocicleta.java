package com.capacitacion2.capacitacion2.Clase7;

public class Motocicleta {
	
	private String marca;
	private String color;
	private String cilindraje; 
	private String potencia;
	
	
	public static  void  metodoImppresion() {
		System.out.println("Esto es una impresora");
		
	}
	
	public Motocicleta (String marca, String color, String cilindraje, String potencia) {
		this.marca = marca;
		this.color = color;
		this.cilindraje = cilindraje ;
		this.potencia = potencia ;
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}


}
