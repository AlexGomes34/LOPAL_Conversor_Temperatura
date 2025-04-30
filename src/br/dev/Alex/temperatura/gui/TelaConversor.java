package br.dev.Alex.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {

	private JTextField textCelsius;
	
	private JLabel labelCelsius;
	
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(500, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//Criacao da interface grafica e seus elementos
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(30, 50, 240, 20);
		
		textCelsius = new JTextField();
		textCelsius.setText("");
		textCelsius.setBounds(30, 70, 440, 40);
		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(30, 120, 220, 40);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(250, 120, 220, 40);
		
		labelResultado = new JLabel();
		labelResultado.setText("FAHREINHEIT");
		labelResultado.setBounds(210, 200, 240, 20);
		
		//Criacao do painel de conteudo e get
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		
		//Essa DEVE ser a ultima linha
		tela.setVisible(true);
		
	}
	
	
	
}
