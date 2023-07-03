package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import controle.ControleDados;
import controle.ControleFilial;
/**
 * Classe responsável por exibir a lista de bens cadastrados em uma filial e interagir com o usuário.
 * @author Angelica da Costa Campos
 * @since 2023
 * @version 1.4
 */
public class TelaListaFilial {
	private JFrame janela;
	
	private static JLabel tituloVeiculo= new JLabel("Veiculos da Filial");
	private static JLabel tituloEletronico = new JLabel("Eletronicos da Filial");
	private static JLabel tituloImovel = new JLabel("Imoveis da Filial");
	private static JLabel tituloConsumivel = new JLabel("Consumiveis da Filial");
	
	private static JList<String> listaConsumivelCadastrados;
	private static String[] listaConsumivel = new String[50];
	
	private static JList<String> listaEletronicoCadastrados;
	private static String[] listaEletronico = new String[50];
	
	private static JList<String> listaImovelCadastrados;
	private static String[] listaImovel = new String[50];
	
	private static JList<String> listaVeiculoCadastrados;
	private static String[] listaVeiculo = new String[50];
	private int posicao;
	
	public static ControleDados dados = new ControleDados();
/**
 * Exibe a lista de bens cadastrados em uma filial.
 * @param pos Posição da filial na lista de filiais cadastradas
 * @param d Objeto ControleDados contendo os dados do sistema
 */
	public void ListaBens(int pos, ControleDados d) {
		posicao=pos;
		dados=d;
		janela= new JFrame("Bens Cadastrados");
		
		listaConsumivel = new ControleFilial(dados).getNomeBemConsumivel(posicao);
		listaEletronico = new ControleFilial(dados).getNomeBemEletronico(posicao);
		listaImovel = new ControleFilial(dados).getNomeBemImovel(posicao);
		listaVeiculo = new ControleFilial(dados).getNomeBemVeiculo(posicao);
		
		
		listaConsumivelCadastrados = new JList<String>(listaConsumivel);
		listaEletronicoCadastrados = new JList<String>(listaEletronico);
		listaImovelCadastrados = new JList<String>(listaImovel);
		listaVeiculoCadastrados = new JList<String>(listaVeiculo);
		
		janela.getContentPane().setBackground(Color.DARK_GRAY);
		janela.setSize(950, 450);
		janela.setLayout(null);
		
		tituloVeiculo.setBounds(50, 5, 250, 50);
		tituloVeiculo.setFont(new Font("Arial", Font.BOLD, 20));
		tituloVeiculo.setForeground(Color.LIGHT_GRAY);
		
		tituloEletronico.setBounds(250, 5, 250, 50);
		tituloEletronico.setFont(new Font("Arial", Font.BOLD, 20));
		tituloEletronico.setForeground(Color.LIGHT_GRAY);
		
		tituloImovel.setBounds(475, 5, 250, 50);
		tituloImovel.setFont(new Font("Arial", Font.BOLD, 20));
		tituloImovel.setForeground(Color.LIGHT_GRAY);
		
		tituloConsumivel.setBounds(675, 5, 250, 50);
		tituloConsumivel.setFont(new Font("Arial", Font.BOLD, 20));
		tituloConsumivel.setForeground(Color.LIGHT_GRAY);
		
		listaConsumivelCadastrados.setBounds(50, 70, 160, 300);
		listaEletronicoCadastrados.setBounds(250, 70, 160, 300);
		listaImovelCadastrados.setBounds(475, 70, 160, 300);
		listaVeiculoCadastrados.setBounds(675, 70, 160, 300);
		
		this.janela.add(tituloVeiculo);
		this.janela.add(tituloEletronico);
		this.janela.add(tituloImovel);
		this.janela.add(tituloConsumivel);
		this.janela.add(listaConsumivelCadastrados);
		this.janela.add(listaEletronicoCadastrados);
		this.janela.add(listaImovelCadastrados);
		this.janela.add(listaVeiculoCadastrados);
		janela.setVisible(true);
	}
}
