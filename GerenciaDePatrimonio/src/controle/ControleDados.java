package controle;

import javax.swing.JOptionPane;
import java.util.Arrays;
import modelo.*;

/*
 * Classe intermediaria entre a tela e o banco de dados permitindo o repasse de informacoes
 * @author Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.1
 * */
public class ControleDados {
    private Dados dados = new Dados();

    public ControleDados() {
        dados.fillWithSomeData();
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados d) {
        this.dados = d;
    }

    public Filial[] getFiliais() {
        return this.dados.getFiliais();
    }

    public int getQtdFiliais() {
        return this.dados.getQtdFiliais();
    }
    public Imovel[] getImovel() {
        return this.dados.getImovel();
    }
    public int getQtdImovel() {
    	int qtd=dados.getQtdImovel();
    	return qtd;
    }
    
    public Veiculo[] getVeiculo() {
        return this.dados.getVeiculo();
    }
    public int getQtdVeiculo() {
    	int qtd=dados.getQtdVeiculos();
    	return qtd;
    }
    
    public Consumivel[] getConsumivel() {
        return this.dados.getConsumivel();
    }
    public int getQtdConsumivel() {
    	int qtd=dados.getQtdConsumivel();
    	return qtd;
    }
    
    public Eletronico[] getEletronico() {
        return this.dados.getEletronico();
    }
    public int getQtdEletronico() {
    	int qtd=dados.getQtdEletronico();
    	return qtd;
    }
    public boolean inserirEditarFilial (String[] dadosFilial) {
       if (dadosFilial[1].isEmpty() || dadosFilial[2].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.",
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
    public boolean inserirEditarVeiculo (String[] dadosVeiculo) {
    	
    	/*Erro caso nao se preencha nenhum campo*/
    	
        if (dadosVeiculo[1].isEmpty() || dadosVeiculo[2].isEmpty() || dadosVeiculo[3].isEmpty()
        		|| dadosVeiculo[4].isEmpty() || dadosVeiculo[5].isEmpty()
        		|| dadosVeiculo[6].isEmpty() || dadosVeiculo[7].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Veiculo v = new Veiculo(dadosVeiculo[1],dadosVeiculo[2], Integer.parseInt(dadosVeiculo[3]),
            		dadosVeiculo[4],dadosVeiculo[5],dadosVeiculo[6],dadosVeiculo[7]);
            dados.inserirEditarVeiculo(v, Integer.parseInt(dadosVeiculo[0]));
            JOptionPane.showMessageDialog(null, "Veiculo inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public boolean removerVeiculo(int i) {
        String veiculoRemovido = dados.getVeiculo()[i].getNome();

        if (i == (dados.getQtdVeiculos() - 1)) {
            dados.setQtdVeiculo(dados.getQtdVeiculos() - 1);
            dados.getVeiculo()[dados.getQtdVeiculos()] = null;
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            int cont = 0;
            while (!dados.getVeiculo()[cont].getNome().equals(veiculoRemovido)) {
                cont++;
            }
            for (int j = cont; j < dados.getQtdFiliais() - 1; j++) {
                dados.getFiliais()[j] = dados.getFiliais()[j + 1];
            }
            dados.getVeiculo()[dados.getQtdVeiculos()] = null;
            dados.setQtdFiliais(dados.getQtdVeiculos() - 1);
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public boolean inserirEditarConsumivel (String[] dadosConsumivel) {
    	
    	/*Erro caso nao se preencha nenhum campo*/
    	
        if (dadosConsumivel[1].isEmpty() || dadosConsumivel[2].isEmpty() || dadosConsumivel[3].isEmpty()
        		|| dadosConsumivel[4].isEmpty() || dadosConsumivel[5].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Consumivel c = new Consumivel(dadosConsumivel[1], dadosConsumivel[2],
            		Integer.parseInt(dadosConsumivel[3]),dadosConsumivel[4], 
            		Integer.parseInt(dadosConsumivel[5]));
            dados.inserirEditarConsumivel(c,Integer.parseInt(dadosConsumivel[0]));
            JOptionPane.showMessageDialog(null, "Consumivel inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public boolean removerConsumivel(int i) {
        String consumivelRemovido = dados.getConsumivel()[i].getNome();

        if (i == (dados.getQtdVeiculos() - 1)) {
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
            JOptionPane.showMessageDialog(null, "Filial removida com sucesso.", "Sucesso",
            		JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public boolean inserirEditarImovel (String[] dadosImovel) {
    	
    	/*Erro caso nao se preencha nenhum campo*/
    	
        if (dadosImovel[1].isEmpty() || dadosImovel[2].isEmpty() || dadosImovel[3].isEmpty() ||
        		dadosImovel[4].isEmpty()|| Integer.parseInt(dadosImovel[5])==0 ||
        		dadosImovel[6].isEmpty() || dadosImovel[7].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Imovel i = new Imovel(dadosImovel[1],dadosImovel[2],Integer.parseInt(dadosImovel[3]),
            		dadosImovel[4],
            		Integer.parseInt(dadosImovel[5]),Integer.parseInt(dadosImovel[6]),dadosImovel[7]);
            dados.inserirEditarImovel(i,Integer.parseInt(dadosImovel[0]));
            JOptionPane.showMessageDialog(null, "Imovel inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public boolean inserirEditarEletronico (String[] dadosEletronico) {
    	
    	/*Erro caso nao se preencha nenhum campo*/
    	
        if (dadosEletronico[1].isEmpty() || dadosEletronico[2].isEmpty() || dadosEletronico[3].isEmpty() ||
        		dadosEletronico[4].isEmpty() ||
        		dadosEletronico[5].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos "
            		+ "com letras ou numeros nao nulos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else {
            Eletronico e = new Eletronico(dadosEletronico[1], dadosEletronico[2], 
            		Integer.parseInt(dadosEletronico[3]),dadosEletronico[4],
            		dadosEletronicos[5], dadosEletronico[6]);
            dados.inserirEditarEletronico(e,Integer.parseInt(dadosEletronico[0]));
            JOptionPane.showMessageDialog(null, "Eletronico inserido/editado com sucesso.",
            		"Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
}
