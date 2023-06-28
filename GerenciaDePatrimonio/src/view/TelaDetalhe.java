package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
import controle.ControleDados;

public class TelaDetalhe implements ActionListener {
    private JFrame janela;
    
    private JLabel labelNome = new JLabel("Nome da Filial:");
    private JLabel labelEndereco = new JLabel("Endereço da Filial:");
    
    private JTextField valorNome;
    private JTextField valorEndereco;
    
    private JButton botaoSalvar  = new JButton("Salvar");
    private JButton botaoExcluir = new JButton("Excluir");
    
    private String novoDadoFilial[] = new String[9];
    private static ControleDados dados;
	private String s;
    
    private int opcao;
    private int posicao;

    public void inserirEditar(int op, ControleDados d, int pos) {
    	posicao= pos;
    	opcao=op;
    	dados=d;
    	if (opcao == 1) s = "Cadastro de Filial";
        if (opcao == 3) s = "Detalhe de Filial";
        janela = new JFrame(s);
        
      //Preenche dados com dados clicado
        if (opcao == 3) {
			valorNome = new JTextField(d.getFiliais()[posicao].getNome(), 200);
			valorEndereco = new JTextField(d.getFiliais()[posicao].getEndereco(),200);
			
		}
        else { //Nao preenche com dados
			valorNome = new JTextField(200);
			valorEndereco = new JTextField(200);
	        botaoSalvar.setBounds(100, 80, 100, 25);
		}

        labelNome.setBounds(10, 10, 150, 25);
        labelEndereco.setBounds(10, 40, 150, 25);
        valorNome.setBounds(160, 10, 200, 25);
        valorEndereco.setBounds(160, 40, 200, 25);
        
        labelNome.setFont(new Font("Arial", Font.PLAIN, 15));
        labelEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
        
        labelNome.setForeground(Color.white);
        labelEndereco.setForeground(Color.white);
        
        valorNome.setBackground(Color.GRAY);
        valorEndereco.setBackground(Color.GRAY);
        
        botaoSalvar.setBackground(Color.GRAY);
        botaoExcluir.setBackground(Color.GRAY);
        
		janela.getContentPane().setBackground(Color.DARK_GRAY);

      //Coloca os campos relacionados a endereco 
      	if (opcao == 1 || opcao == 3 ) {
      		this.janela.add(labelEndereco);
      		this.janela.add(valorEndereco);
      	}
      //Coloca botoes de excluir e salvar
      	if (opcao == 3) {
	        botaoSalvar.setBounds(100, 80, 100, 25);
            botaoExcluir.setBounds(220, 80, 100, 25);
      		this.janela.add(botaoExcluir);
      	}
      	this.janela.add(labelNome);
      	this.janela.add(valorNome);
      	this.janela.add(labelEndereco);
      	this.janela.add(valorEndereco);
      	this.janela.add(botaoSalvar);

      	this.janela.setLayout(null);

      	this.janela.setSize(500, 250);
      	this.janela.setVisible(true);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == botaoSalvar) {
        	try {	
    			/*Cadastro de filial*/
    			if(opcao==1) {
    				novoDadoFilial[0]=Integer.toString(dados.getQtdFiliais());
    			}
    			else {
        			novoDadoFilial[0]=Integer.toString(posicao);
        		}

    			novoDadoFilial[1]= valorNome.getText();
    			novoDadoFilial[2]= valorEndereco.getText();}
    			

    		catch (NullPointerException exc1) {
    			mensagemErroCadastro1();

        }

        	if(opcao==1 ) {
        		boolean res = dados.inserirEditarFilial(novoDadoFilial);
    			if(res) {
    				mensagemSucessoCadastro();
    			}
    			else 
    				mensagemErroCadastro();
        	}else {
        		boolean res = dados.inserirEditarFilial(novoDadoFilial);
    			if(res) {
    				mensagemSucessoCadastro();
    			}
    			else 
    				mensagemErroCadastro();
        	}
        		}

        	if (src == botaoExcluir){
        		boolean res = false;
            	res=dados.removerFilial(posicao);
            	if (res) {
                mensagemSucessoExclusao();
        		} 
        		else {
        			mensagemErroExclusao();
            	}
    		}
    	}
    public void inserirEditarBem(int op, ControleDados d, int pos) {
    	
    }
    public void mensagemSucessoExclusao() {
        JOptionPane.showMessageDialog(null, "Os dados foram excluídos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }
    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }
    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados da filial!", null,
                JOptionPane.ERROR_MESSAGE);
    }
    public void mensagemErroCadastro1() {
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados da filial", null,
                JOptionPane.ERROR_MESSAGE);
    }
    public void mensagemErroExclusao() {
        JOptionPane.showMessageDialog(null, "Erro ao excluir os dados da filial!", null,
                JOptionPane.ERROR_MESSAGE);
    }
}