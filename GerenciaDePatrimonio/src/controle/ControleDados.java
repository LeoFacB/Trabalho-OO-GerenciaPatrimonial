package controle;

import javax.swing.JOptionPane;
import java.util.Arrays;
import modelo.*;

/**
 * Classe intermediaria entre a tela e o banco de dados permitindo o repasse de
 * informacoes
 * @author Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.6
 */
public class ControleDados {
    private Dados dados = new Dados();
/**
 * Cria e manipula os exemplos banco de dados
 * */
    public ControleDados() {
        dados.preencherDados();
    }
    /**
     * Cria e manipula os exemplos banco de dados
     * @return dados
     * */
    public Dados getDados() {
        return dados;
    }
    /**
     * Cria e manipula os exemplos banco de dados
     *@param d dados
     * */
    public void setDados(Dados d) {
        this.dados = d;
    }
    /**
     * Pega as filiais
     * @return filiais existentes
     * */
    public Filial[] getFiliais() {
        return this.dados.getFiliais();
    }
    /**
     * Pega a quantidade de filiais
     * @return quantidade de filiais
     * */
    public int getQtdFiliais() {
        return this.dados.getQtdFiliais();
    }
    /**
     * Pega os imoveis
     * @return imoveis existentes
     * */
    public Imovel[] getImovel() {
        return this.dados.getImovel();
    }
    /**
     * Pega a quantidade de imoveis
     * @return quantidade de imoveis 
     * */
    public int getQtdImovel() {
    	int qtd = dados.getQtdImovel();
    	return qtd;
    }
    /**
     * Pega os veiculos
     * @return veiculos existentes
     * */
    public Veiculo[] getVeiculo() {
        return this.dados.getVeiculo();
    }
    /**
     * Pega a quantidade de veiculos
     * @return quantidade de veiculos
     * */
    public int getQtdVeiculo() {
    	int qtd = dados.getQtdVeiculos();
    	return qtd;
    }
/**
 * Pega os consumiveis
 * @return os consumiveis do banco de dados
 * */
    public Consumivel[] getConsumivel() {
        return this.dados.getConsumivel();
    }
/**
 * Pega a quantidade de consumiveis
 * @return quantidade
 * */
    public int getQtdConsumivel() {
    	int qtd = dados.getQtdConsumivel();
    	return qtd;
    }
/**
 * Pega os eletronicos
 * @return os eletronicos do banco de dados
 * */
    public Eletronico[] getEletronico() {
        return this.dados.getEletronico();
    }
/**
 * Pega a quantidade de consumiveis
 * @return quantidade
 * */
    public int getQtdEletronico() {
    	int qtd = dados.getQtdEletronico();
    	return qtd;
    }
/**
 * Insere ou edita uma filial com base nos dados fornecidos.
 *
 * @param dadosFilial um array contendo os dados da filial, onde:
 *   - dadosFilial[0]: o identificador da filial
 *   - dadosFilial[1]: o nome da filial
 *   - dadosFilial[2]: o endereço da filial
 * @return true se a filial foi inserida ou editada com sucesso, false caso contrário
 */
    public boolean inserirEditarFilial (String[] dadosFilial) {
       if (dadosFilial[1].isEmpty() || dadosFilial[2].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os "
            		+ "campos.",
            		"Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Filial f = new Filial(dadosFilial[1], dadosFilial[2]);
            dados.inserirEditarFilial(f, Integer.parseInt(dadosFilial[0]));
            JOptionPane.showMessageDialog(null, "Filial inserida/editada com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Remove a filial com o índice especificado.
 *
 * @param i o índice da filial a ser removida
 * @return true se a filial foi removida com sucesso, false caso contrário
 */
    public boolean removerFilial(int i) {
        String filialRemovida = dados.getFiliais()[i].getNome();

        if (i == (dados.getQtdFiliais() - 1)) {
            dados.setQtdFiliais(dados.getQtdFiliais() - 1);
            dados.getFiliais()[dados.getQtdFiliais()] = null;
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getFiliais()[cont].getNome().equals(filialRemovida)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdFiliais() - 1; j++) {
                dados.getFiliais()[j] = dados.getFiliais()[j + 1];
            }
            dados.getFiliais()[dados.getQtdFiliais()] = null;
            dados.setQtdFiliais(dados.getQtdFiliais() - 1);
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Insere ou edita um veículo com base nos dados fornecidos.
 *
 * @param dadosVeiculo um array contendo os dados do veículo a ser inserido ou editado
 * @return true se o veículo foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarVeiculo (String[] dadosVeiculo) {
        if (dadosVeiculo[1].isEmpty() || dadosVeiculo[2].isEmpty() || dadosVeiculo[3].isEmpty()
        		|| dadosVeiculo[4].isEmpty() || dadosVeiculo[5].isEmpty()
        		|| dadosVeiculo[6].isEmpty() || dadosVeiculo[7].isEmpty() ||
        		dadosVeiculo[3].matches("[a-zA-Z]+")|| dadosVeiculo[4].matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Dados inseridos incorretamente", "Erro",
            		JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Veiculo v = new Veiculo(dadosVeiculo[1], dadosVeiculo[2],dadosVeiculo[3],
            		Integer.parseInt(dadosVeiculo[4]), dadosVeiculo[5], dadosVeiculo[6], dadosVeiculo[7]);
            dados.inserirEditarVeiculo(v, Integer.parseInt(dadosVeiculo[0]));
            JOptionPane.showMessageDialog(null, "Veiculo inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Remove o veículo com o índice especificado.
 *
 * @param i o índice do veículo a ser removido
 * @return true se o veículo foi removido com sucesso, false caso contrário
 */
    public boolean removerVeiculo(int i) {
        String veiculoRemovido = dados.getVeiculo()[i].getNome();

        if (i == (dados.getQtdVeiculos() - 1)) {
            dados.setQtdVeiculo(dados.getQtdVeiculos() - 1);
            dados.getVeiculo()[dados.getQtdVeiculos()] = null;
            JOptionPane.showMessageDialog(null, "Veiculo removida com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getVeiculo()[cont].getNome().equals(veiculoRemovido)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdVeiculos() - 1; j++) {
                dados.getVeiculo()[j] = dados.getVeiculo()[j + 1];
            }
            dados.getVeiculo()[dados.getQtdVeiculos()] = null;
            dados.setQtdVeiculo(dados.getQtdVeiculos() - 1);
            JOptionPane.showMessageDialog(null, "Veiculo removido com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Insere ou edita um consumível com base nos dados fornecidos.
 *
 * @param dadosConsumivel um array contendo os dados do consumível a ser inserido ou editado
 * @return true se o consumível foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarConsumivel (String[] dadosConsumivel) {
        if (dadosConsumivel[1].isEmpty() || dadosConsumivel[2].isEmpty() || 
        		dadosConsumivel[3].isEmpty()
        		|| dadosConsumivel[4].isEmpty() || dadosConsumivel[5].isEmpty()||
        		dadosConsumivel[3].matches("[A-za-z]+")|| dadosConsumivel[4].matches("[A-za-z]+")
        		|| dadosConsumivel[5].matches("[A-za-z]+")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        
        else {
            Consumivel c = new Consumivel(dadosConsumivel[1], dadosConsumivel[2],
            		dadosConsumivel[3],
            		Integer.parseInt(dadosConsumivel[4]),Integer.parseInt(dadosConsumivel[5]));
            dados.inserirEditarConsumivel(c,Integer.parseInt(dadosConsumivel[0]));
            JOptionPane.showMessageDialog(null, "Consumivel inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Remove o consumível com o índice especificado.
 *
 * @param i o índice do consumível a ser removido
 * @return true se o consumível foi removido com sucesso, false caso contrário
 */
    public boolean removerConsumivel(int i) {
        String consumivelRemovido = dados.getConsumivel()[i].getNome();

        if (i == (dados.getQtdConsumivel() - 1)) {
            dados.setQtdConsumivel(dados.getQtdConsumivel() - 1);
            dados.getConsumivel()[dados.getQtdConsumivel()] = null;
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getConsumivel()[cont].getNome().equals(consumivelRemovido)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdConsumivel() - 1; j++) {
                dados.getConsumivel()[j] = dados.getConsumivel()[j + 1];
            }
            dados.getConsumivel()[dados.getQtdConsumivel()] = null;
            dados.setQtdConsumivel(dados.getQtdConsumivel() - 1);
            JOptionPane.showMessageDialog(null, "Consumivel removido com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Insere ou edita um imóvel com base nos dados fornecidos.
 *
 * @param dadosImovel um array contendo os dados do imóvel a ser inserido ou editado
 * @return true se o imóvel foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarImovel (String[] dadosImovel) {
   	 if (dadosImovel[1].isEmpty() || dadosImovel[2].isEmpty() || dadosImovel[3].isEmpty() ||
      		dadosImovel[6].isEmpty() || dadosImovel[7].isEmpty()||
      		dadosImovel[3].matches("[A-za-z]+") || dadosImovel[4].matches("[A-za-z]+")||
    		dadosImovel[5].matches("[A-za-z]+")|| dadosImovel[3].isEmpty()||dadosImovel[4].isEmpty()||
    		dadosImovel[5].isEmpty()
      		) {
          JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
          		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
          return false;
      } 
        else {
            Imovel i = new Imovel(dadosImovel[1], dadosImovel[2], dadosImovel[3],
            		Integer.parseInt(dadosImovel[4]),Integer.parseInt(dadosImovel[5]),
            		Integer.parseInt(dadosImovel[6]),dadosImovel[7]);
            dados.inserirEditarImovel(i,Integer.parseInt(dadosImovel[0]));
            JOptionPane.showMessageDialog(null, "Imovel inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Remove o imóvel com o índice especificado.
 *
 * @param i o índice do imóvel a ser removido
 * @return true se o imóvel foi removido com sucesso, false caso contrário
 */
    public boolean removerImovel(int i) {
        String imovelRemovido = dados.getImovel()[i].getNome();

        if (i == (dados.getQtdImovel() - 1)) {
            dados.setQtdImovel(dados.getQtdImovel() - 1);
            dados.getImovel()[dados.getQtdImovel()] = null;
            JOptionPane.showMessageDialog(null, "Imovel removido com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getImovel()[cont].getNome().equals(imovelRemovido)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdImovel() - 1; j++) {
                dados.getImovel()[j] = dados.getImovel()[j + 1];
            }
            dados.getImovel()[dados.getQtdVeiculos()] = null;
            dados.setQtdImovel(dados.getQtdImovel() - 1);
            JOptionPane.showMessageDialog(null, "Imovel removido com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Insere ou edita um eletrônico com base nos dados fornecidos.
 *
 * @param dadosEletronico um array contendo os dados do eletrônico a ser inserido ou editado
 * @return true se o eletrônico foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarEletronico (String[] dadosEletronico) {
    	
        if (dadosEletronico[1].isEmpty() || dadosEletronico[2].isEmpty() || 
        		dadosEletronico[3].isEmpty() ||
        		dadosEletronico[4].isEmpty() ||
        		dadosEletronico[5].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Eletronico e = new Eletronico(dadosEletronico[1], dadosEletronico[2], 
            		dadosEletronico[3],Integer.parseInt(dadosEletronico[4]),
            		Integer.parseInt(dadosEletronico[5]));
            dados.inserirEditarEletronico(e,Integer.parseInt(dadosEletronico[0]));
            JOptionPane.showMessageDialog(null, "Eletronico inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Remove o eletronico com o índice especificado.
 *
 * @param i o índice do eletronico a ser removido
 * @return true se o eletronico foi removido com sucesso, false caso contrário
 */
    public boolean removerEletronico(int i) {
        String eletronicoRemovido = dados.getEletronico()[i].getNome();

        if (i == (dados.getQtdEletronico() - 1)) {
            dados.setQtdEletronico(dados.getQtdEletronico() - 1);
            dados.getEletronico()[dados.getQtdEletronico()] = null;
            JOptionPane.showMessageDialog(null, "Eletronico removido com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getEletronico()[cont].getNome().equals(eletronicoRemovido)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdVeiculos() - 1; j++) {
                dados.getEletronico()[j] = dados.getEletronico()[j + 1];
            }
            dados.getEletronico()[dados.getQtdVeiculos()] = null;
            dados.setQtdEletronico(dados.getQtdVeiculos() - 1);
            JOptionPane.showMessageDialog(null, "Eletronico removido com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
/**
 * Insere ou edita um imovel e o coloca em uma filial com base
 *  nos dados fornecidos.
 *
 * @param dadosImovel um array contendo os dados do imóvel a ser inserido ou editado
 * @return true se o imóvel foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarImovelFilial(String[] dadosImovel) {
    	 if (dadosImovel[1].isEmpty() || dadosImovel[2].isEmpty() || dadosImovel[3].isEmpty() ||
         		dadosImovel[4].isEmpty()|| Integer.parseInt(dadosImovel[5])==0 ||
         		dadosImovel[6].isEmpty() || dadosImovel[7].isEmpty()) {
             JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
             		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
             return false;
         } 
         else {
             Imovel i = new Imovel(dadosImovel[1], dadosImovel[2], dadosImovel[3],
             		Integer.parseInt(dadosImovel[4]),Integer.parseInt(dadosImovel[5]),
             		Integer.parseInt(dadosImovel[6]),dadosImovel[7]);
             dados.inserirEditarImovel(i,Integer.parseInt(dadosImovel[0]));
             JOptionPane.showMessageDialog(null, "Imovel inserido/editado com sucesso.",
             		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
             for(int j=0; j<dados.getQtdFiliais(); j++) {
     			if(dados.getFiliais()[j].getNome().equals(dadosImovel[8]))
     				dados.getFiliais()[j].setImovelList(i);
     		}
     	}
             return true;
         }
/**
 * Insere ou edita um consumivel e o coloca em uma filial com base nos dados fornecidos.
 *
 * @param dadosConsumivel um array contendo os dados do consumível a ser inserido ou editado
 * @return true se o consumível foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarConsumivelFilial (String[] dadosConsumivel) {
        if (dadosConsumivel[1].isEmpty() || dadosConsumivel[2].isEmpty() ||
        		dadosConsumivel[3].isEmpty()|| dadosConsumivel[4].isEmpty() ||
        		dadosConsumivel[5].isEmpty()|| dadosConsumivel[8].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        
        else {
            Consumivel c = new Consumivel(dadosConsumivel[1], dadosConsumivel[2],
            		dadosConsumivel[3],
            		Integer.parseInt(dadosConsumivel[4]),Integer.parseInt(dadosConsumivel[5]));
            dados.inserirEditarConsumivel(c,Integer.parseInt(dadosConsumivel[0]));
            for(int j=0; j<dados.getQtdFiliais(); j++) {
     			if(dados.getFiliais()[j].getNome().equals(dadosConsumivel[8]))
     				dados.getFiliais()[j].setConsumivelList(c);
     			
   		}
     		}
     	
            JOptionPane.showMessageDialog(null, "Consumivel inserido/editado e anexado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
/**
 * Insere ou edita um eletrônico e o coloca em uma filial com base nos dados
 *  fornecidos.
 *
 * @param dadosEletronico um array contendo os dados do eletrônico a ser inserido ou editado
 * @return true se o eletrônico foi inserido ou editado com sucesso, 
 * false caso contrário
 */
    public boolean inserirEditarEletronicoFilial (String[] dadosEletronico) {
	   if (dadosEletronico[1].isEmpty() || dadosEletronico[2].isEmpty() || 
			   dadosEletronico[3].isEmpty() ||
     		dadosEletronico[4].isEmpty() ||
     		dadosEletronico[5].isEmpty()) {
		    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
         	+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
         return false;
     } 
     else {
         Eletronico e = new Eletronico(dadosEletronico[1], dadosEletronico[2], 
         		dadosEletronico[3],Integer.parseInt(dadosEletronico[4]),
         		Integer.parseInt(dadosEletronico[5]));
         dados.inserirEditarEletronico(e,Integer.parseInt(dadosEletronico[0]));
         for(int j=0; j<dados.getQtdFiliais(); j++) {
        	 if(dados.getFiliais()[j].getNome().equals(dadosEletronico[8]))
				dados.getFiliais()[j].setEletronicoList(e);
		}
         JOptionPane.showMessageDialog(null, "Eletronico inserido/editado com sucesso.",
         		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
         return true;
     }
 }
/**
 * Insere ou edita um veículo e o coloca em uma filial com base nos dados fornecidos.
 *
 * @param dadosVeiculo um array contendo os dados do veículo a ser inserido ou editado
 * @return true se o veículo foi inserido ou editado com sucesso, false caso contrário
 */
    public boolean inserirEditarVeiculoFilial (String[] dadosVeiculo) {
     if (dadosVeiculo[1].isEmpty() || dadosVeiculo[2].isEmpty() || dadosVeiculo[3].isEmpty()
     		|| dadosVeiculo[4].isEmpty() || dadosVeiculo[5].isEmpty()
     		|| dadosVeiculo[6].isEmpty() || dadosVeiculo[7].isEmpty() ||dadosVeiculo[8].isEmpty() ||
     		dadosVeiculo[3].matches("[a-zA-Z]+")|| dadosVeiculo[4].matches("[a-zA-Z]+")) {
         JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
         		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
         return false;
     } 
     else {
         Veiculo v = new Veiculo(dadosVeiculo[1], dadosVeiculo[2],dadosVeiculo[3],
         		Integer.parseInt(dadosVeiculo[4]), dadosVeiculo[5], dadosVeiculo[6], dadosVeiculo[7]);
         dados.inserirEditarVeiculo(v, Integer.parseInt(dadosVeiculo[0]));
         for(int j=0; j<dados.getQtdFiliais(); j++) {
        	 if(dados.getFiliais()[j].getNome().equals(dadosVeiculo[8]))
				dados.getFiliais()[j].setVeiculoList(v);
		}
         JOptionPane.showMessageDialog(null, "Veiculo inserido/editado com sucesso.",
         		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
         return true;
     }
 }
}
    

