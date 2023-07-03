package view;
import controle.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * Classe para criação da janela de busca de bens em uma determinada filial
 * @author Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.0
 * */
public class TelaBusca implements ActionListener {
	 private JFrame janela;
	 
	 private static JLabel labelNome = new JLabel("Nome do objeto:");
	 
	 private static JButton botaoPesquisar = new JButton("Pesquisar");
	 
	 private JTextField valorNome= new JTextField(200);
	 private ControleDados dados;
	 private int opcao;
	 /**
	  * Classe para adicionar e corrigir elemntos na janela
	  * @param opção escolhida no menu
	  * @param dados armazanedos no banco de dados
	  * */
	 public void BuscarPatrimonio(int op, ControleDados d) {
		 opcao= op;
		 dados=d;
		 String s = null;
		 if(opcao==1)
			 s=("Busca de Veículos");
		 if(opcao==2)
			 s=("Busca de Imovel");
		 if(opcao==3)
			 s=("Busca de Eletronico");
		 if(opcao==4)
			 s=("Busca de Consumivel");
		 janela= new JFrame(s);
		 janela.setSize(500, 500);
		 janela.getContentPane().setBackground(Color.DARK_GRAY);
		 janela.setLayout(null);
		 
		 labelNome.setBounds(25, 10,150,100);
		 labelNome.setFont(new Font("Arial", Font.BOLD, 15));
		 labelNome.setForeground(Color.LIGHT_GRAY);
		 
		 valorNome.setBounds(175, 55,200,15);
		 valorNome.setFont(new Font("Arial", Font.BOLD, 15));
		 valorNome.setForeground(Color.LIGHT_GRAY);
		 
		 botaoPesquisar.setBounds(380, 55,100,15);
		 botaoPesquisar.setForeground(Color.GRAY);
		 
		 botaoPesquisar.addActionListener(this);
		 
		 this.janela.add(labelNome);
		 this.janela.add(valorNome);
		 this.janela.add(botaoPesquisar);
		 
		 
		 
		 janela.setVisible(true);
	 }
 /**
  * Método para tratar eventos de clique de mouse.
  * @param Evento de clique
  * */
	 public void actionPerformed(ActionEvent e) {
	        Object src = e.getSource();
	        if (src==botaoPesquisar) {
	        	if(opcao==1) {
	        		for(int i=0; i<dados.getQtdVeiculo(); i++) {
	        		if(dados.getVeiculo()[i].getNome().equals(valorNome.getText())){
	        			new TelaDetalhe().inserirEditarBem(31, dados, i);
	        		}
	        	}
	        	}
	        	if(opcao==2) {
		        	for(int i=0; i<dados.getQtdImovel(); i++) {
		        		if(dados.getImovel()[i].getNome().equals(valorNome.getText())){
		        			new TelaDetalhe().inserirEditarBem(11, dados, i);
		        		}
		        	}
		        	}
	        	if(opcao==3) {
		        	for(int i=0; i<dados.getQtdEletronico(); i++) {
		        		if(dados.getEletronico()[i].getNome().equals(valorNome.getText())){
		        			new TelaDetalhe().inserirEditarBem(21, dados, i);
		        		}
		        	}
		        	}
	        	if(opcao==4) {
		        	for(int i=0; i<dados.getQtdConsumivel(); i++) {
		        		if(dados.getConsumivel()[i].getNome().equals(valorNome.getText())){
		        			new TelaDetalhe().inserirEditarBem(41, dados, i);
		        		}
		        	}
		        	}
	        }
 	}
}
