package br.dev.Alex.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.Alex.temperatura.model.Temperatura;

public class TelaConversor {

	//Cria atributos para a classe
	private JTextField textCelsius;
	
	private JLabel labelCelsius;
	
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	//Cria os metodos de Classe
	public void criarTelaConversor() {
		
		//Cria a interface grafica
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(500, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Deixa disponivel a formatacao dos dados da tela grafica
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
		labelResultado.setText("");
		labelResultado.setBounds(120, 200, 400, 40);
		
		//Cria o Font para alterar as configuracoes de labelResultado
		Font fonte1 = new Font("Bold", 20, 30);
		labelResultado.setFont(fonte1);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("ERRO: impossível realizar conta");
		labelMensagemErro.setBounds(160, 250, 600, 30);
		
		//Configura a cor de labelMensagemErro
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setVisible(false);
		
		
		
		
		
		
		 
		
		//Criar listeners para realizar a acao do botão
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Cria a funcao try e catch com o intuito de identificar
				//Quando a conta nao for possivel de ser realizada para que
				//apareca a mensagem de erro
				try {
					String celsius = textCelsius.getText();
					Temperatura temp1 = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temp1.setCelsius(celsiusDouble);
					double fahreinheit = temp1.converterParafahrenheit();
					
					
					
					labelResultado.setText(fahreinheit + " FAHREINHEIT");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					
				}catch(Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
				}
				
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					String celsius = textCelsius.getText();
					Temperatura temp2 = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temp2.setCelsius(celsiusDouble);
					double kelvin = temp2.converterParaKelvin();
					
					labelResultado.setText(kelvin + " KELVIN");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					
				}catch(Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
				}
				
				
			}
		});
		
		//Criacao do painel de conteudo e get
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelMensagemErro);
		
		//Essa DEVE ser a ultima linha
		//Ela define se a tela e visivel ou nao
		tela.setVisible(true);
		
	}
	
	
	
}
