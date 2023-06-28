package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import controle.*;


public class TelaMenu implements ActionListener, ListSelectionListener {
	//Atribustos
	//titulo
	private static JLabel tituloPrincipal = new JLabel("Menu Principal");
	private static JLabel tituloBens = new JLabel("Bens Cadastrados");
	private static JLabel tituloFiliais = new JLabel("Filiais Cadastradas");
	
	private static JFrame janela = new JFrame("Filiais");
	//botões
	private static JButton cadastroFilial = new JButton("Cadastrar Filiais");
	private static JButton atualizarFilial = new JButton("Atualizar Filiais");
	private static JButton atualizarImovel = new JButton("Atualizar Imovel");
	private static JButton atualizarVeiculo = new JButton("Atualizar Veiculo");
	private static JButton atualizarEletronico = new JButton("Atualizar Eletronico");
	private static JButton atualizarConsumivel = new JButton("Atualizar Consumivel");
	
	private static JButton cadastroImovel = new JButton("Cadastrar Imovel");
	private static JButton cadastroVeiculo = new JButton("Cadastrar Veiculo");
	private static JButton cadastroEletronico = new JButton("Cadastrar Eletronico");
	private static JButton cadastroConsumivel = new JButton("Cadastrar Consumivel");

	//banco de dados
	public static ControleDados dados = new ControleDados();
	
	private static JList<String> listaFilialsCadastrados;
	private static String[] listaNomes = new String[50];
	
	private static JList<String> listaConsumivelCadastrados;
	private static String[] listaConsumivel = new String[50];
	
	private static JList<String> listaEletronicoCadastrados;
	private static String[] listaEletronico = new String[50];
	
	private static JList<String> listaImovelCadastrados;
	private static String[] listaImovel = new String[50];
	
	private static JList<String> listaVeiculoCadastrados;
	private static String[] listaVeiculo = new String[50];

		public TelaMenu(){
			// Mostrar dados de Filials cadastrados (JList)
			
			listaNomes = new ControleFilial(dados).getNomeFilial();
			//listaBens = new ControleBem(dados).getNomeBensTotal();
			listaConsumivel = new ControleBem(dados).getNomeBemConsumivel();
			listaEletronico = new ControleBem(dados).getNomeBemEletronico();
			listaImovel = new ControleBem(dados).getNomeBemImovel();
			listaVeiculo = new ControleBem(dados).getNomeBemVeiculo();
			
			listaFilialsCadastrados = new JList<String>(listaNomes);
			listaConsumivelCadastrados = new JList<String>(listaConsumivel);
			listaEletronicoCadastrados = new JList<String>(listaEletronico);
			listaImovelCadastrados = new JList<String>(listaImovel);
			listaVeiculoCadastrados = new JList<String>(listaVeiculo);
			
			//personalizar tamanhos e fontes
			tituloPrincipal.setFont(new Font("Arial", Font.BOLD, 40));
			tituloBens.setFont(new Font("Arial", Font.BOLD, 20));
			tituloFiliais.setFont(new Font("Arial", Font.BOLD, 20));
			
			cadastroFilial.setFont(new Font("Arial", Font.BOLD, 10));
			atualizarFilial.setFont(new Font("Arial", Font.BOLD, 10));
			atualizarImovel.setFont(new Font("Arial", Font.BOLD, 10));
			
			cadastroImovel.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroVeiculo.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroEletronico.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroConsumivel.setFont(new Font("Arial", Font.BOLD, 10));
			
			//lista de cadastrados
			listaFilialsCadastrados.setBounds(10, 130, 350, 330);
			//BENS
			listaConsumivelCadastrados.setBounds(470, 130, 200, 120);
			listaEletronicoCadastrados.setBounds(730, 130, 200, 120);
			listaImovelCadastrados.setBounds(470, 330, 200, 120);
			listaVeiculoCadastrados.setBounds(730, 330, 200, 120);
			
			cadastroFilial.setBounds(40, 480, 140, 20);
			atualizarFilial.setBounds(200, 480, 120, 20);
			//BENS
			atualizarImovel.setBounds(500, 480, 150, 20);
			atualizarVeiculo.setBounds(750, 480, 150, 20);
			atualizarEletronico.setBounds(750, 279, 150, 20);
			atualizarConsumivel.setBounds(500, 279, 150, 20);
			//BENS
			cadastroImovel.setBounds(500, 455, 150, 20);
			cadastroVeiculo.setBounds(750, 455, 150, 20);
			cadastroEletronico.setBounds(750, 255, 150, 20);
			cadastroConsumivel.setBounds(500, 255, 150, 20);

			
			tituloPrincipal.setBounds(350, 2, 450, 100);
			tituloBens.setBounds(600, 60, 450, 100);
			tituloFiliais.setBounds(	100, 60, 450, 100);
			
			tituloPrincipal.setForeground(Color.LIGHT_GRAY);
			tituloFiliais.setForeground(Color.LIGHT_GRAY);
			tituloBens.setForeground(Color.LIGHT_GRAY);
			
			listaFilialsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFilialsCadastrados.setVisibleRowCount(50);
			
			listaConsumivelCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaConsumivelCadastrados.setVisibleRowCount(50);
			
			listaEletronicoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEletronicoCadastrados.setVisibleRowCount(50);
			
			listaImovelCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaImovelCadastrados.setVisibleRowCount(50);
			
			listaVeiculoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVeiculoCadastrados.setVisibleRowCount(50);
			
			cadastroFilial.setBackground(Color.GRAY);
			atualizarFilial.setBackground(Color.GRAY);
			//BENS
			atualizarImovel.setBackground(Color.GRAY);
			atualizarVeiculo.setBackground(Color.GRAY);
			atualizarEletronico.setBackground(Color.GRAY);
			atualizarConsumivel.setBackground(Color.GRAY);
			 
			listaFilialsCadastrados.setBackground(Color.GRAY);
			listaConsumivelCadastrados.setBackground(Color.GRAY);
			listaEletronicoCadastrados.setBackground(Color.GRAY);
			listaImovelCadastrados.setBackground(Color.GRAY);
			listaVeiculoCadastrados.setBackground(Color.GRAY);
			
			listaFilialsCadastrados.setBackground(Color.GRAY);
			
			janela.getContentPane().setBackground(Color.DARK_GRAY);
			
			janela.setLayout(null);

			janela.add(tituloFiliais);
			janela.add(tituloPrincipal);
			janela.add(tituloBens);
			
			janela.add(listaFilialsCadastrados);
			janela.add(listaFilialsCadastrados);
			janela.add(listaConsumivelCadastrados);
			janela.add(listaEletronicoCadastrados);
			janela.add(listaImovelCadastrados);
			janela.add(listaVeiculoCadastrados);
			
			janela.add(cadastroFilial);
			janela.add(atualizarFilial);
			janela.add(atualizarImovel);
			janela.add(atualizarVeiculo);
			janela.add(atualizarEletronico);
			janela.add(atualizarConsumivel);
			
			janela.add(cadastroImovel);
			janela.add(cadastroVeiculo);
			janela.add(cadastroEletronico);
			janela.add(cadastroConsumivel);

			janela.setSize(1000, 550);
			janela.setVisible(true);
			//temporario
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			cadastroFilial.addActionListener(this);
			atualizarFilial.addActionListener(this);
			
			cadastroImovel.addActionListener(this);
			cadastroVeiculo.addActionListener(this);
			cadastroEletronico.addActionListener(this);
			cadastroConsumivel.addActionListener(this);
			
			atualizarImovel.addActionListener(this);
			atualizarVeiculo.addActionListener(this);
			atualizarEletronico.addActionListener(this);
			atualizarConsumivel.addActionListener(this);
			
			listaFilialsCadastrados.addListSelectionListener(this);
			listaConsumivelCadastrados.addListSelectionListener(this);
			listaEletronicoCadastrados.addListSelectionListener(this);
			listaImovelCadastrados.addListSelectionListener(this);
			listaVeiculoCadastrados.addListSelectionListener(this);
	}
		public static void main(String[] args) {
			TelaMenu menu = new TelaMenu();
			
			cadastroFilial.addActionListener(menu);
			atualizarFilial.addActionListener(menu);
			
			atualizarImovel.addActionListener(menu);
			atualizarVeiculo.addActionListener(menu);
			atualizarEletronico.addActionListener(menu);
			atualizarConsumivel.addActionListener(menu);
			
			cadastroImovel.addActionListener(menu);
			cadastroVeiculo.addActionListener(menu);
			cadastroEletronico.addActionListener(menu);
			cadastroConsumivel.addActionListener(menu);
		}

	//Captura eventos relacionados aos bot�es da interface
		public void actionPerformed(ActionEvent e) {
			cadastroFilial.addActionListener(this);
			atualizarFilial.addActionListener(this);
			
			atualizarImovel.addActionListener(this);
			atualizarVeiculo.addActionListener(this);
			atualizarEletronico.addActionListener(this);
			atualizarConsumivel.addActionListener(this);
			
			cadastroImovel.addActionListener(this);
			cadastroVeiculo.addActionListener(this);
			cadastroEletronico.addActionListener(this);
			cadastroConsumivel.addActionListener(this);
			
			listaFilialsCadastrados.addListSelectionListener(this);
			listaConsumivelCadastrados.addListSelectionListener(this);
			listaEletronicoCadastrados.addListSelectionListener(this);
			listaImovelCadastrados.addListSelectionListener(this);
			listaVeiculoCadastrados.addListSelectionListener(this);
			Object src = e.getSource();
		
			//Cadastro de novo aluno
			if(src == cadastroFilial)
				new TelaDetalhe().inserirEditar(1, dados, 0);
			
			if(src == cadastroImovel)
				new TelaDetalhe().inserirEditarBem(2, dados, 0);
			if(src == cadastroVeiculo)
				new TelaDetalhe().inserirEditarBem(4, dados, 0);
			if(src == cadastroEletronico)
				new TelaDetalhe().inserirEditarBem(8, dados, 0);
			if(src == cadastroConsumivel)
				new TelaDetalhe().inserirEditarBem(6, dados, 0);

			// Atualiza a lista de nomes de alunos mostrada no JList
			if(src == atualizarFilial) {
				listaFilialsCadastrados.setListData(new ControleFilial(dados).getNomeFilial());			
				listaFilialsCadastrados.updateUI();
			}
			if(src == atualizarImovel) {
				listaImovelCadastrados.setListData(new ControleBem(dados).getNomeBemImovel());			
				listaImovelCadastrados.updateUI();
			}
			if(src == atualizarVeiculo) {
				listaVeiculoCadastrados.setListData(new ControleBem(dados).getNomeBemVeiculo());			
				listaVeiculoCadastrados.updateUI();
			}
			if(src == atualizarEletronico) {
				listaEletronicoCadastrados.setListData(new ControleBem(dados).getNomeBemEletronico());			
				listaEletronicoCadastrados.updateUI();
			}
			if(src == atualizarConsumivel) {
				listaConsumivelCadastrados.setListData(new ControleBem(dados).getNomeBemConsumivel());			
				listaConsumivelCadastrados.updateUI();
			}
			
			if(src == cadastroImovel)
				new TelaDetalhe().inserirEditar(2, dados, 0);
			if(src == cadastroVeiculo)
				new TelaDetalhe().inserirEditar(4, dados, 0);
			if(src == cadastroEletronico)
				new TelaDetalhe().inserirEditar(8, dados, 0);
			if(src == cadastroConsumivel)
				new TelaDetalhe().inserirEditar(6, dados, 0);
			
			if(src == atualizarFilial) {
				//listaBensCadastrados.setListData(new ControleBem(dados).getNomeBensTotal());			
				listaFilialsCadastrados.updateUI();
			}
			//BENS
			if(src == atualizarImovel) {	
				listaImovelCadastrados.updateUI();
			}
			if(src == atualizarVeiculo) {	
				listaVeiculoCadastrados.updateUI();
			}
			if(src == atualizarEletronico) {	
				listaEletronicoCadastrados.updateUI();
			}
			if(src == atualizarConsumivel) {	
				listaConsumivelCadastrados.updateUI();
			}
	}
	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaFilialsCadastrados) {
			new TelaDetalhe().inserirEditar(3, dados, listaFilialsCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaConsumivelCadastrados) {
			new TelaDetalhe().inserirEditar(9, dados, listaConsumivelCadastrados.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == listaEletronicoCadastrados) {
			new TelaDetalhe().inserirEditar(10, dados, listaEletronicoCadastrados.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == listaImovelCadastrados) {
			new TelaDetalhe().inserirEditar(5, dados, listaImovelCadastrados.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == listaVeiculoCadastrados) {
			new TelaDetalhe().inserirEditar(7, dados, listaVeiculoCadastrados.getSelectedIndex());
		}
	}
}