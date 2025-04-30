package br.dev.Alex.temperatura;

import br.dev.Alex.temperatura.gui.TelaConversor;
import br.dev.Alex.temperatura.model.Temperatura;

public class TemperaturaApp {
	
	public static void main(String[] args) {
		Temperatura t1 = new Temperatura();
		t1.setCelsius(1);
		t1.mostrarResultado();
		
		TelaConversor tc1 = new TelaConversor();
		tc1.criarTelaConversor();
		
	}
	
}
