package com.capacitacion2.capacitacion2.clase6tarea;

public class Calculadora {
	private double numerouno;
	private double numerodos;
	
	public void  Calculadora (double numerouno, double numerodos) {
		this.numerouno = numerouno;
		this.numerodos = numerodos;
	}
	
	public  double  suma() {
		return  numerouno+numerodos;	
	}
	
	public  double  resta() {
		return  numerouno-numerodos;	
	}
	
	public  double  multiplicacion() {
		return  numerouno*numerodos;	
	}
	
	public  double  division () {
		return  numerouno/numerodos;	
	}

}
