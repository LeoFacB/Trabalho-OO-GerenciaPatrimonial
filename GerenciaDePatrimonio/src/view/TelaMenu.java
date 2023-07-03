package view;
/**
 * Classe responsável por exibir o menu principal e interagir com o usuário.
 * @author Angelica da Costa Campos e Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.4
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaMenu implements ActionListener, ListSelectionListener {
	private static JLabel tituloPrincipal = new JLabel("Menu Principal");
	private static JLabel tituloBens = new JLabel("Bens Cadastrados");
	private static JLabel tituloFiliais = new JLabel("Filiais Cadastradas");
	
	private static JFrame janela = new JFrame("Filiais");
	
	private static JButton cadastroFilial = new JButton("Cadastrar Filiais");
	
	private static JButton atualizar = new JButton("Atualizar Sistema");
	
	private static JButton pesquisarFilial = new JButton("Pesquisar Filiais");
	private static JButton pesquisarImovel = new JButton("Pesquisar Imovel");
	private static JButton pesquisarVeiculo = new JButton("Pesquisar Veiculo");
	private static JButton pesquisarEletronico = new JButton("Pesquisar Eletronico");
	private static JButton pesquisarConsumivel = new JButton("Pesquisar Consumivel");
	
	private static JButton cadastroImovel = new JButton("Cadastrar Imovel");
	private static JButton cadastroVeiculo = new JButton("Cadastrar Veiculo");
	private static JButton cadastroEletronico = new JButton("Cadastrar Eletronico");
	private static JButton cadastroConsumivel = new JButton("Cadastrar Consumivel");
	
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
/**
 * Construtor da classe TelaMenu.
 * Inicializa os componentes da interface e configura os listeners.
 */
		public TelaMenu(){
			listaNomes = new ControleFilial(dados).getNomeFilial();
			listaConsumivel = new ControleBem(dados).getNomeBemConsumivel();
			listaEletronico = new ControleBem(dados).getNomeBemEletronico();
			listaImovel = new ControleBem(dados).getNomeBemImovel();
			listaVeiculo = new ControleBem(dados).getNomeBemVeiculo();
			
			listaFilialsCadastrados = new JList<String>(listaNomes);
			listaConsumivelCadastrados = new JList<String>(listaConsumivel);
			listaEletronicoCadastrados = new JList<String>(listaEletronico);
			listaImovelCadastrados = new JList<String>(listaImovel);
			listaVeiculoCadastrados = new JList<String>(listaVeiculo);
			
			tituloPrincipal.setFont(new Font("Arial", Font.BOLD, 40));
			tituloBens.setFont(new Font("Arial", Font.BOLD, 20));
			tituloFiliais.setFont(new Font("Arial", Font.BOLD, 20));
			
			cadastroFilial.setFont(new Font("Arial", Font.BOLD, 10));
			atualizar.setFont(new Font("Arial", Font.BOLD, 10));
			
			cadastroImovel.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroVeiculo.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroEletronico.setFont(new Font("Arial", Font.BOLD, 10));
			cadastroConsumivel.setFont(new Font("Arial", Font.BOLD, 10));
			
			pesquisarFilial.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarImovel.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarVeiculo.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarEletronico.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarConsumivel.setFont(new Font("Arial", Font.BOLD, 10));
			
			listaFilialsCadastrados.setBounds(10, 130, 350, 330);
			listaConsumivelCadastrados.setBounds(470, 130, 200, 120);
			listaEletronicoCadastrados.setBounds(730, 130, 200, 120);
			listaImovelCadastrados.setBounds(470, 330, 200, 120);
			listaVeiculoCadastrados.setBounds(730, 330, 200, 120);
			
			atualizar.setBounds(200, 480, 120, 20);
			
			cadastroFilial.setBounds(40, 480, 140, 20);
			cadastroImovel.setBounds(500, 455, 150, 20);
			cadastroVeiculo.setBounds(750, 455, 150, 20);
			cadastroEletronico.setBounds(750, 255, 150, 20);
			cadastroConsumivel.setBounds(500, 255, 150, 20);
			
			pesquisarFilial.setBackground(Color.GRAY);
			pesquisarImovel.setBackground(Color.GRAY);
			pesquisarVeiculo.setBackground(Color.GRAY);
			pesquisarEletronico.setBackground(Color.GRAY);
			pesquisarConsumivel.setBackground(Color.GRAY);
			
			tituloPrincipal.setBounds(350, 2, 450, 100);
			tituloBens.setBounds(600, 60, 450, 100);
			tituloFiliais.setBounds(100, 60, 450, 100);
			
			tituloPrincipal.setForeground(Color.LIGHT_GRAY);
			tituloFiliais.setForeground(Color.LIGHT_GRAY);
			tituloBens.setForeground(Color.LIGHT_GRAY);
			
			pesquisarFilial.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarImovel.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarVeiculo.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarEletronico.setFont(new Font("Arial", Font.BOLD, 10));
			pesquisarConsumivel.setFont(new Font("Arial", Font.BOLD, 10));
			
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
			atualizar.setBackground(Color.GRAY);
			pesquisarImovel.setBounds(500, 480, 150, 20);
			pesquisarVeiculo.setBounds(750, 480, 150, 20);
			pesquisarEletronico.setBounds(750, 279, 150, 20);
			pesquisarConsumivel.setBounds(500, 279, 150, 20);
			atualizar.setBounds(700, 50, 160, 25);
			
			listaFilialsCadastrados.setBackground(Color.GRAY);
			listaConsumivelCadastrados.setBackground(Color.GRAY);
			listaEletronicoCadastrados.setBackground(Color.GRAY);
			listaImovelCadastrados.setBackground(Color.GRAY);
			listaVeiculoCadastrados.setBackground(Color.GRAY);
			
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
			
			janela.add(atualizar);
			
			janela.add(cadastroFilial);
			janela.add(cadastroImovel);
			janela.add(cadastroVeiculo);
			janela.add(cadastroEletronico);
			janela.add(cadastroConsumivel);
			
			janela.add(pesquisarFilial);
			janela.add(pesquisarImovel);
			janela.add(pesquisarVeiculo);
			janela.add(pesquisarEletronico);
			janela.add(pesquisarConsumivel);

			janela.setSize(1000, 650);
			janela.setVisible(true);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			atualizar.addActionListener(this);
			
			cadastroFilial.addActionListener(this);
			cadastroImovel.addActionListener(this);
			cadastroVeiculo.addActionListener(this);
			cadastroEletronico.addActionListener(this);
			cadastroConsumivel.addActionListener(this);
			
			listaFilialsCadastrados.addListSelectionListener(this);
			listaConsumivelCadastrados.addListSelectionListener(this);
			listaEletronicoCadastrados.addListSelectionListener(this);
			listaImovelCadastrados.addListSelectionListener(this);
			listaVeiculoCadastrados.addListSelectionListener(this);
	}
/**
 * Método principal para iniciar a aplicação.
 * @param args Argumentos da linha de comando (não utilizados)
 */
		public static void main(String[] args) {
			TelaMenu menu = new TelaMenu();
			
			cadastroFilial.addActionListener(menu);
			atualizar.addActionListener(menu);
		
			cadastroImovel.addActionListener(menu);
			cadastroVeiculo.addActionListener(menu);
			cadastroEletronico.addActionListener(menu);
			cadastroConsumivel.addActionListener(menu);
			
			pesquisarFilial.addActionListener(menu);
			pesquisarImovel.addActionListener(menu);
			pesquisarVeiculo.addActionListener(menu);
			pesquisarEletronico.addActionListener(menu);
			pesquisarConsumivel.addActionListener(menu);
		}
/**
 * Método para tratar eventos de clique de mouse.
 * @param Evento de clique
 */
		public void actionPerformed(ActionEvent e) {
			cadastroFilial.addActionListener(this);
			atualizar.addActionListener(this);
			
			cadastroImovel.addActionListener(this);
			cadastroVeiculo.addActionListener(this);
			cadastroEletronico.addActionListener(this);
			cadastroConsumivel.addActionListener(this);
			cadastroImovel.addActionListener(this);
			
			listaFilialsCadastrados.addListSelectionListener(this);
			listaConsumivelCadastrados.addListSelectionListener(this);
			listaEletronicoCadastrados.addListSelectionListener(this);
			listaImovelCadastrados.addListSelectionListener(this);
			listaVeiculoCadastrados.addListSelectionListener(this);
			Object src = e.getSource();
		
			if(src == cadastroFilial)
				new TelaDetalhe().inserirEditar(1, dados, 0);
			if(src == cadastroImovel)
				new TelaDetalhe().inserirEditarBem(10, dados, 0);
			if(src == cadastroVeiculo)
				new TelaDetalhe().inserirEditarBem(30, dados, 0);
			if(src == cadastroEletronico)
				new TelaDetalhe().inserirEditarBem(20, dados, 0);
			if(src == cadastroConsumivel)
				new TelaDetalhe().inserirEditarBem(40, dados, 0);
			if(src == pesquisarFilial)
				new TelaBusca().BuscarPatrimonio(1, dados);
			if(src == pesquisarImovel)
				new TelaBusca().BuscarPatrimonio(2, dados);
			if(src == pesquisarEletronico)
				new TelaBusca().BuscarPatrimonio(3, dados);
			if(src == pesquisarConsumivel)
				new TelaBusca().BuscarPatrimonio(4, dados);

			if(src == atualizar) {
				listaFilialsCadastrados.setListData(new ControleFilial(dados).getNomeFilial());			
				listaFilialsCadastrados.updateUI();		
				listaImovelCadastrados.setListData(new ControleBem(dados).getNomeBemImovel());			
				listaImovelCadastrados.updateUI();					
				listaVeiculoCadastrados.setListData(new ControleBem(dados).getNomeBemVeiculo());			
				listaVeiculoCadastrados.updateUI();			
				listaEletronicoCadastrados.setListData(new ControleBem(dados).getNomeBemEletronico());			
				listaEletronicoCadastrados.updateUI();
				listaConsumivelCadastrados.setListData(new ControleBem(dados).getNomeBemConsumivel());			
				listaConsumivelCadastrados.updateUI();
			}	
	}
/**
 * Método para tratar eventos de seleção em listas.
 * @param e Evento de seleção disparado
 */	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaFilialsCadastrados) {
			new TelaDetalhe().inserirEditar(3, dados, listaFilialsCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaConsumivelCadastrados) {
			new TelaDetalhe().inserirEditarBem(41, dados, listaConsumivelCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaEletronicoCadastrados) {
			new TelaDetalhe().inserirEditarBem(21, dados, listaEletronicoCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaImovelCadastrados) {
			new TelaDetalhe().inserirEditarBem(11, dados, listaImovelCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaVeiculoCadastrados) {
			new TelaDetalhe().inserirEditarBem(31, dados, listaVeiculoCadastrados.getSelectedIndex());
		}
	}
}