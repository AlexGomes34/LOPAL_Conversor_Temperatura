package br.dev.Alex.temperatura.model;

public class Temperatura {
	
	//Cria atributos da classe
	private double celsius;
	
	//Cria metodos de classe
	
	//Cria o get para retornar o valor de celsius
	public double getCelsius() {
		return celsius;
		
	}
	
	//Cria o set para definir o valor de celsius
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		
	}
	
	//Cria o metodo de conversao de celsius para kelvin
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
		
		
	}
	
	//Cria o metodo de conversao de celsius para fahreinheit
	public double converterParafahrenheit() {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}

}
