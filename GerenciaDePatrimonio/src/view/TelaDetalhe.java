package view;
/**
 * Classe da tela de detalhes de um bem.
 * 
 * @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
 * @since 2023
 * @version 1.5
 */
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
    private JLabel labelNomePatrimonio = new JLabel("Nome do patrimonio:");
    private JLabel labelDescricao = new JLabel("Descricao:");
    private JLabel labelDataAquisicao = new JLabel("Data de Aquisição:");
    private JLabel labelNumeroSerie = new JLabel("Numero de Serie:");
    private JLabel labelTamanhoTerreno = new JLabel("Tamanho do Terreno:");
    private JLabel labelValor = new JLabel("Valor:");
    private JLabel labelEnderecoI = new JLabel("Endereço:");
    private JLabel labelVoltagem = new JLabel("Voltagem:");
    private JLabel labelPlaca = new JLabel("Placa:");
    private JLabel labelMarca = new JLabel("Marca do Veiculo:");
    private JLabel labelModelo = new JLabel("Modelo do Veiculo:");
    private JLabel labelDepreciacao = new JLabel("Depreciação:");
    private JLabel labelDecisaoCadastro = new JLabel("Deseja cadastrar esse bem em uma filial?");
    private JLabel labelNomeFilial = new JLabel("Nome da Filial:");
    
    private JTextField valorNome;
    private JTextField valorEndereco;
    private JTextField valorNomePatrimonio;
    private JTextField valorDescricao;
    private JTextField valorDataAquisicao;
    private JTextField valorNumeroSerie;
    private JTextField valorTamanhoTerreno;
    private JTextField valorValor;
    private JTextField valorEnderecoI;
    private JTextField valorVoltagem;
    private JTextField valorNomeFilial;
    private JTextField valorPlaca;
    private JTextField valorMarca;
    private JTextField valorModelo;
    private JTextField valorDepreciacao;

    private JRadioButton simCadastro=new JRadioButton("Sim", false);
    private JRadioButton naoCadastro= new JRadioButton("Não", true);
    private ButtonGroup bg = new ButtonGroup();
    private ButtonGroup bg2 = new ButtonGroup();
    
    private JButton botaoSalvar  = new JButton("Salvar");
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoVerBens  = new JButton("Bens");
    
    private String novoDado[] = new String[9];
    private ControleDados dados;
    private ControleDados dados2;
	private String titulo;
	private int opcao;
	private int posicao;

    public void inserirEditar(int op, ControleDados d, int pos) {
    	opcao=op;
    	posicao=pos;
    	dados=d;
    	dados2=d;
    	if (opcao == 1) titulo = "Cadastro de Filial";
        if (opcao == 3) titulo = "Detalhe de Filial";
        janela = new JFrame(titulo);
        
        if (opcao == 3) {
			valorNome = new JTextField(dados.getFiliais()[posicao].getNome(), 200);
			valorEndereco = new JTextField(dados.getFiliais()[posicao].getEndereco(),200);
			
		}
        else {
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
        botaoVerBens.setBackground(Color.GRAY);
        
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
            botaoVerBens.setBounds(100, 120, 220, 25);
      		this.janela.add(botaoExcluir);
      	}
      	this.janela.add(labelNome);
      	this.janela.add(valorNome);
      	this.janela.add(labelEndereco);
      	this.janela.add(valorEndereco);
      	this.janela.add(botaoSalvar);
      	this.janela.add(botaoVerBens);

      	this.janela.setLayout(null);

      	this.janela.setSize(500, 250);
      	this.janela.setVisible(true);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
        botaoVerBens.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == botaoSalvar) {
        	try {	
    			/*Cadastro de filial*/
    			if(opcao==1) {
    				novoDado[0]=Integer.toString(dados.getQtdFiliais());
    				novoDado[1]= valorNome.getText();
    				novoDado[2]= valorEndereco.getText();
    			}
    			if(opcao==3) {
    				novoDado[0]=Integer.toString(posicao);
    				novoDado[1]= valorNome.getText();
    				novoDado[2]= valorEndereco.getText();
        		}
    			if(opcao==10 || opcao==11 || opcao == 20 || opcao ==21 ||opcao ==30
    					||opcao ==31|| opcao==40||opcao ==41) {
    				novoDado[1]= valorNomePatrimonio.getText();
    				novoDado[2]= valorDescricao.getText();
    				novoDado[3]= valorDataAquisicao.getText();
    				novoDado[4]= valorNumeroSerie.getText();
    			}
    			if(opcao==10) {
    				novoDado[0]= Integer.toString(dados.getQtdImovel());
    				novoDado[5]= valorTamanhoTerreno.getText();
    				novoDado[6]= valorValor.getText();
    				novoDado[7]= valorEnderecoI.getText();
    				novoDado[8]= valorNomeFilial.getText();
    			}
    			if(opcao==11) {
    				novoDado[0]=Integer.toString(posicao);
    				novoDado[5]= valorTamanhoTerreno.getText();
    				novoDado[6]= valorValor.getText();
    				novoDado[7]= valorEnderecoI.getText();
    			}
    			if(opcao==20) {
    				novoDado[0]=Integer.toString(dados.getQtdEletronico());
    				novoDado[5]= valorVoltagem.getText();
    				novoDado[8]= valorNomeFilial.getText();
    			}
    			if(opcao==21) {
    				novoDado[0]=Integer.toString(posicao);
    				novoDado[5]= valorVoltagem.getText();
    			}
    			if(opcao==30) {
    				novoDado[0]=Integer.toString(dados.getQtdImovel());
    				novoDado[5]= valorMarca.getText();
    				novoDado[6]= valorPlaca.getText();
    				novoDado[7]= valorModelo.getText();
    				novoDado[8]= valorNomeFilial.getText();
    			}
    			if(opcao==31) {
    				novoDado[0]=Integer.toString(posicao);
    				novoDado[5]= valorMarca.getText();
    				novoDado[6]= valorPlaca.getText();
    				novoDado[7]= valorModelo.getText();
    			}
    			if(opcao==40) {
    				novoDado[0]=Integer.toString(dados.getQtdImovel());
    				novoDado[5]= valorDepreciacao.getText();
    				novoDado[8]= valorNomeFilial.getText();
    			}
    			if(opcao==41) {
    				novoDado[0]=Integer.toString(posicao);
    				novoDado[5]= valorDepreciacao.getText();
    			}
    			}
    		catch (NullPointerException exc1) {
    			mensagemErroCadastro();
        }

        	if(opcao==1) {
        		boolean res = dados.inserirEditarFilial(novoDado);
        		confirmaEnvio(res);
        	}
        	if(opcao==3) {
        		boolean res = dados.inserirEditarFilial(novoDado);
        		confirmaEnvio(res);
    			
        	}
        	if(opcao==10 || opcao==11) {
        		boolean res=false;
        		if(opcao==10 && !novoDado[8].isEmpty()) {
    				res = dados.inserirEditarImovelFilial(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==10 && novoDado[8].isEmpty()) {
        			res =dados.inserirEditarImovel(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==11) {
        			res = dados.inserirEditarImovel(novoDado);
        			confirmaEnvio(res);
        		}
        		}
        	if(opcao==20|| opcao==21) {
        		boolean res=false;
        		if(opcao==20 && !novoDado[8].isEmpty()) {
    				res = dados.inserirEditarEletronicoFilial(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==20 && novoDado[8].isEmpty()) {
        			res =dados.inserirEditarEletronico(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==21) {
        			res = dados.inserirEditarEletronico(novoDado);
        			confirmaEnvio(res);
        		}
        		}
        	if(opcao==30|| opcao==31) {
        		boolean res=false;
        		if(opcao==30 && !novoDado[8].isEmpty()) {
    				res = dados.inserirEditarVeiculoFilial(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==30 && novoDado[8].isEmpty()) {
        			res =dados.inserirEditarVeiculo(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==31) {
        			res = dados.inserirEditarVeiculo(novoDado);
        			confirmaEnvio(res);
        		}
        	}
        	if(opcao==40|| opcao==41) {
        		boolean res=false;
        		if(opcao==40 && !novoDado[8].isEmpty()) {
    				res = dados.inserirEditarConsumivelFilial(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==40 && novoDado[8].isEmpty()) {
        			res =dados.inserirEditarConsumivel(novoDado);
    				confirmaEnvio(res);
            		}
        		if(opcao==41) {
        			res = dados.inserirEditarConsumivel(novoDado);
        			confirmaEnvio(res);
        		}
        	}
        }

        	if (src == botaoExcluir){
        		boolean res = false;
        		if(opcao==3) {
        			res=dados.removerFilial(posicao);
        		}
        		if(opcao==11) {
        			res=dados.removerImovel(posicao);
        		}
        		if(opcao==21) {
        			res=dados.removerEletronico(posicao);
        		}
        		if(opcao==31) {
        			res=dados.removerVeiculo(posicao);
        		}
        		if(opcao==41) {
        			res=dados.removerConsumivel(posicao);
        		}
            	confirmaExclusao(res);
        	}
        	if(src== simCadastro) {
        		valorNomeFilial.setVisible(true);
        		labelNomeFilial.setVisible(true);
        	}
        	if(src == naoCadastro) {
        		valorNomeFilial.setVisible(false);
        		labelNomeFilial.setVisible(false);
        	}
        	if(src== botaoVerBens) {
        		new TelaListaFilial().ListaBens(posicao, dados2);
        	}}
    public void inserirEditarBem(int op, ControleDados d, int pos) {
    	opcao=op;
    	posicao=pos;
    	dados=d;
    	nomeTitulo(opcao);
    	janela = new JFrame(titulo);
    	janela.getContentPane().setBackground(Color.DARK_GRAY);
    	janela.setSize(500,600);
    				
		if(opcao==10 || opcao == 20 || opcao ==30 || opcao==40){
			valorNomePatrimonio= new JTextField(200);
			valorDescricao= new JTextField(200);
			valorDataAquisicao= new JTextField(200);
			valorNumeroSerie= new JTextField(200);
			valorNomeFilial= new JTextField (200);
			
			
		}
		if(opcao==11) {
			valorNomePatrimonio= new JTextField(dados.getImovel()[posicao].getNome(), 200);
			valorDescricao= new JTextField(dados.getImovel()[posicao].getDescricao(), 200);
			valorDataAquisicao= new JTextField(dados.getImovel()[posicao]
					.getDataAquisicao(), 200);
			valorNumeroSerie= new JTextField(Integer.toString(dados.getImovel()
					[posicao].getNumeroSerie()));
		}
		if(opcao==21) {
			valorNomePatrimonio= new JTextField(dados.getEletronico()[posicao].getNome(), 200);
			valorDescricao= new JTextField(dados.getEletronico()[posicao].getDescricao(), 200);
			valorDataAquisicao= new JTextField(dados.getEletronico()[posicao]
					.getDataAquisicao(), 200);
			valorNumeroSerie= new JTextField(Integer.toString(dados.getEletronico()
					[posicao].getNumeroSerie()));
		}
		if(opcao==31) {
			valorNomePatrimonio= new JTextField(dados.getVeiculo()[posicao].getNome(), 200);
			valorDescricao= new JTextField(dados.getVeiculo()[posicao].getDescricao(), 200);
			valorDataAquisicao= new JTextField(dados.getVeiculo()[posicao]
					.getDataAquisicao(), 200);
			valorNumeroSerie= new JTextField(Integer.toString(dados.getVeiculo()
					[posicao].getNumeroSerie()));
		}
		if(opcao==41) {
			valorNomePatrimonio= new JTextField(dados.getConsumivel()[posicao].getNome(), 200);
			valorDescricao= new JTextField(dados.getConsumivel()[posicao].getDescricao(), 200);
			valorDataAquisicao= new JTextField(dados.getConsumivel()[posicao]
					.getDataAquisicao(), 200);
			valorNumeroSerie= new JTextField(Integer.toString(dados.getConsumivel()
					[posicao].getNumeroSerie()));
		}
		
		labelNomePatrimonio.setBounds(10, 10, 150, 25);
		labelDescricao.setBounds(10, 40, 150, 25);
		labelDataAquisicao.setBounds(10, 70, 150, 25);
		labelNumeroSerie.setBounds(10, 100, 150, 25);
		labelNomeFilial.setBounds(10, 300, 150, 25);
		
		botaoSalvar.setBounds(100, 400, 100, 25);
		
		
		
		valorNomePatrimonio.setBounds(160, 10, 200, 25);
		valorDescricao.setBounds(160, 40, 200, 25);
		valorDataAquisicao.setBounds(160, 70, 200, 25);
		valorNumeroSerie.setBounds(160, 100, 200, 25);
		
			
		labelNomePatrimonio.setFont(new Font("Arial", Font.PLAIN, 15));
		labelDescricao.setFont(new Font("Arial", Font.PLAIN, 15));
		labelDataAquisicao.setFont(new Font("Arial", Font.PLAIN, 15));
		labelNumeroSerie.setFont(new Font("Arial", Font.PLAIN, 15));
		
		labelNomeFilial.setFont(new Font("Arial", Font.PLAIN, 15));
		
		labelNomePatrimonio.setForeground(Color.white);
		labelDescricao.setForeground(Color.white);
		labelDataAquisicao.setForeground(Color.white);
		labelNumeroSerie.setForeground(Color.white);
		
		labelNomeFilial.setForeground(Color.white);
		
		valorNomePatrimonio.setForeground(Color.GRAY);
		valorDescricao.setForeground(Color.GRAY);
		valorDataAquisicao.setForeground(Color.GRAY);
		valorNumeroSerie.setForeground(Color.GRAY);
		
		botaoSalvar.setForeground(Color.GRAY);
		
		
					
		this.janela.add(labelNomePatrimonio);
		this.janela.add(valorNomePatrimonio);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelDataAquisicao);
		this.janela.add(valorDataAquisicao);
		this.janela.add(labelNumeroSerie);
		this.janela.add(valorNumeroSerie);
		this.janela.add(labelDecisaoCadastro);
		this.janela.add(botaoSalvar);
		
		botaoSalvar.addActionListener(this);
		
		if(opcao==10 || opcao == 20 || opcao ==30 || opcao==40){
			labelDecisaoCadastro.setBounds(10, 220, 400, 25);
			labelDecisaoCadastro.setFont(new Font("Arial", Font.PLAIN, 15));
			labelDecisaoCadastro.setForeground(Color.white);
			
			valorNomeFilial.setBounds(160, 300, 200, 25);
			valorNomeFilial.setForeground(Color.GRAY);
			
			simCadastro.setBounds(130, 250, 50, 25);
			naoCadastro.setBounds(190, 250, 50, 25);
			
			bg2.add(simCadastro);
			bg2.add(naoCadastro);
			
			simCadastro.addActionListener(this);
	        naoCadastro.addActionListener(this);
			
			this.janela.add(simCadastro);
			this.janela.add(naoCadastro);
			this.janela.add(valorNomeFilial);
			this.janela.add(labelNomeFilial);
			
			valorNomeFilial.setVisible(false);
			labelNomeFilial.setVisible(false);
		}
		
		if(opcao==11||opcao==21||opcao==31||opcao==41)
			adicionarBotaoExcluir();
		
		if(opcao==10 || opcao==11) {
			if(opcao==10) {
				valorTamanhoTerreno= new JTextField(200);
				valorValor= new JTextField(200);
				valorEnderecoI= new JTextField(200);
			}
			if(opcao==11) {
				valorTamanhoTerreno= new JTextField(Integer.toString(dados.getImovel()[posicao]
						.getTamanhoTerreno()));
				valorValor= new JTextField(Integer.toString(dados.getImovel()
						[posicao].getValor()));
				valorEnderecoI= new JTextField(dados.getImovel()[posicao]
						.getEndereco(), 200);
	    	}
			
			
			labelTamanhoTerreno.setBounds(10, 130, 150, 25);
			labelValor.setBounds(10, 160, 150, 25);
			labelEnderecoI.setBounds(10, 190, 150, 25);
			
			valorTamanhoTerreno.setBounds(160, 130, 200, 25);
			valorValor.setBounds(160, 160, 200, 25);
			valorEnderecoI.setBounds(160, 190, 200, 25);
			
			labelTamanhoTerreno.setFont(new Font("Arial", Font.PLAIN, 15));
			labelValor.setFont(new Font("Arial", Font.PLAIN, 15));
			labelEnderecoI.setFont(new Font("Arial", Font.PLAIN, 15));
			
			labelTamanhoTerreno.setForeground(Color.white);
			labelValor.setForeground(Color.white);
			labelEnderecoI.setForeground(Color.white);
			
			valorTamanhoTerreno.setForeground(Color.GRAY);
			valorValor.setForeground(Color.GRAY);
			valorEnderecoI.setForeground(Color.GRAY);
			
			this.janela.add(valorTamanhoTerreno);
			this.janela.add(valorValor);
			this.janela.add(valorEnderecoI);
			this.janela.add(labelTamanhoTerreno);
			this.janela.add(labelValor);
			this.janela.add(labelEnderecoI);
			this.janela.add(botaoSalvar);
		}
		if (opcao==20|| opcao==21) {
			if(opcao==20) {
				valorVoltagem= new JTextField(200);
			}
			if(opcao==21) {
				valorVoltagem= new JTextField(Integer.toString(dados.getEletronico()[posicao]
						.getVoltagem()));
			}
			
			labelVoltagem.setBounds(10, 130, 150, 25);
			valorVoltagem.setBounds(160, 130, 150, 25);
			
			labelVoltagem.setFont(new Font("Arial", Font.PLAIN, 15));
			
			labelVoltagem.setForeground(Color.white);
			valorVoltagem.setForeground(Color.GRAY);
			
			this.janela.add(labelVoltagem);
			this.janela.add(valorVoltagem);

		}
		if(opcao==30|| opcao==31) {
			if(opcao==30) {
				valorMarca= new JTextField(200);
				valorPlaca= new JTextField(200);
				valorModelo= new JTextField(200);
			}
			if(opcao==31) {
				valorMarca= new JTextField(dados.getVeiculo()[posicao].getMarca(), 200);
				valorPlaca= new JTextField(dados.getVeiculo()[posicao]
						.getPlaca(), 200);
				valorModelo= new JTextField(dados.getVeiculo()[posicao]
						.getModelo(), 200);
			}
			labelMarca.setBounds(10, 130, 150, 25);
			labelPlaca.setBounds(10, 160, 150, 25);
			labelModelo.setBounds(10, 190, 150, 25);
			
			valorMarca.setBounds(160, 130, 200, 25);
			valorPlaca.setBounds(160, 160, 200, 25);
			valorModelo.setBounds(160, 190, 200, 25);
			
			labelMarca.setFont(new Font("Arial", Font.PLAIN, 15));
			labelPlaca.setFont(new Font("Arial", Font.PLAIN, 15));
			labelModelo.setFont(new Font("Arial", Font.PLAIN, 15));
			
			labelMarca.setForeground(Color.white);
			labelPlaca.setForeground(Color.white);
			labelModelo.setForeground(Color.white);
			
			valorMarca.setForeground(Color.GRAY);
			valorPlaca.setForeground(Color.GRAY);
			valorModelo.setForeground(Color.GRAY);
			
			this.janela.add(valorMarca);
			this.janela.add(valorPlaca);
			this.janela.add(valorModelo);
			this.janela.add(labelMarca);
			this.janela.add(labelPlaca);
			this.janela.add(labelModelo);
		}
		if(opcao==40||opcao==41) {
			if(opcao==40) {
				valorDepreciacao= new JTextField(200);
			}
			if(opcao==41) {
				valorDepreciacao= new JTextField(Integer.toString(dados.getConsumivel()[posicao]
						.getDepreciacao()));
			}
			labelDepreciacao.setBounds(10, 130, 150, 25);
			
			valorDepreciacao.setBounds(160, 130, 200, 25);
			
			labelDepreciacao.setFont(new Font("Arial", Font.PLAIN, 15));
			
			labelDepreciacao.setForeground(Color.white);
			
			valorDepreciacao.setForeground(Color.GRAY);
			
			this.janela.add(labelDepreciacao);
			this.janela.add(valorDepreciacao);
		}
		this.janela.setLayout(null);
		this.janela.setVisible(true);
    }
/**
 * Manda uma notificação de sucesso quando o processo de exclusao falha
*/
    public void mensagemSucessoExclusao() {
        JOptionPane.showMessageDialog(null, "Os dados foram excluídos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }
/**
 * Manda uma notificação de sucesso quando o processo de cadastro é executado
*/
    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }
/**
 * Manda uma notificação de sucesso quando o processo de exclusao é executado
*/
    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!", null,
                JOptionPane.ERROR_MESSAGE);
    }
/**
 * Manda uma notificação de falha quando o processo de exclusao é executado
*/
    public void mensagemErroExclusao() {
        JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!", null,
                JOptionPane.ERROR_MESSAGE);
    }
/**
 * Manda uma notificação de envio quando o processo de cadastro é executado
 * @param um boolean de confirmaçao da operação
 * */
    public void confirmaEnvio (boolean res) {
    	if(res) {
			mensagemSucessoCadastro();
		}
		else 
			mensagemErroCadastro();
    }
    public void confirmaExclusao(boolean resultado) {
    	if(resultado)
    		mensagemSucessoExclusao();
    	else
    		mensagemErroCadastro();
    }
/**
 * Define o titulo da janela
 * @param a opcao de tela escolhida no menu
 * */
    public void nomeTitulo(int op) {
    	if(op==10)
    		titulo=("Cadastro de Imovel");
    	if(op==20)
    		titulo=("Cadastro de Veiculo");
    	if(op==30)
    		titulo=("Cadastro de Eletronico");
    	if(op==40)
    		titulo=("Cadastro de Consumivel");
    	if(op==11)
    		titulo=("Detalhes do Imovel");
    	if(op==21)
    		titulo=("Detalhes do Veiculo");
    	if(op==31)
    		titulo=("Detalhes do Eletronico");
    	if(op==41)
    		titulo=("Detalhes do Consumivel");
    }
/**
 * Cria e coloca o botao excluir nos editar bens
 * */
    public void adicionarBotaoExcluir() {
    	botaoExcluir.setBounds(220, 400, 100, 25);
  		this.janela.add(botaoExcluir);
  		botaoExcluir.addActionListener(this);
    }
}