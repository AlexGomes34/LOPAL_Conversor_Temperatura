package br.dev.Alex.temperatura.model;

public class Temperatura {
	
	private double celsius;
	
	public double getCelsius() {
		return celsius;
		
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
		
	}
	
	public double converterParafahrenheit() {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}
	
	public void mostrarResultado() {
		System.out.println("Fahrenheit: " + converterParafahrenheit());
		System.out.println("Kelvin: " + converterParaKelvin());
		
	}
	
	

}
