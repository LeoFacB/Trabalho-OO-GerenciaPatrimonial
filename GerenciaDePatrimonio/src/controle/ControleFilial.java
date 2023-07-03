package controle;
import modelo.*;
/**
 * Classe responsável por controlar os dados das filiais.
 * Controla a quantidade de filiais e seus nomes.
 *
 * @version 1.4
 * @since 2023
 * @author Angélica da Costa Campos
 */
public class ControleFilial {
	private Filial[] filiais;
	private int qtdFiliais;    
	
	public ControleFilial(ControleDados d) {
		filiais = d.getFiliais();
		qtdFiliais = d.getQtdFiliais();
	}
	
	public String[] getNomeFilial() {
		String[] nomes = new String[qtdFiliais];
		for(int i = 0; i < qtdFiliais; i++) {
			nomes[i] = filiais[i].getNome();
		}
		
		return nomes;
	}
	
	public int getQtdFiliais() {
		return qtdFiliais; 
	}

	public void setQtdFiliais(int qtd) {
		this.qtdFiliais = qtd;
	}
	
	public String getNomeFilial(int i) {		
		return filiais[i].getNome();
	}
	public String[] getNomeBemImovel(int j) {
		String[] nomes = new String[filiais[j].getQtdImovel()];  
		for(int i = 0; i != filiais[j].getQtdImovel(); i++) {
			nomes[i] = filiais[j].getNomeImovel(i); ;    
		}
		return nomes;    
	}
	public String[] getNomeBemVeiculo(int j) {
		String[] nomes = new String[filiais[j].getQtdVeiculo()];  
		for(int i = 0; i != filiais[j].getQtdVeiculo(); i++) {
			nomes[i] = filiais[j].getNomeVeiculo(i); ;    
		}
		return nomes;   
	}
	public String[] getNomeBemConsumivel(int j) {
		String[] nomes = new String[filiais[j].getQtdConsumivel()];  
		for(int i = 0; i != filiais[j].getQtdConsumivel(); i++) {
			nomes[i] = filiais[j].getNomeConsumivel(i); ;    
		}
		return nomes;     
	}
	public String[] getNomeBemEletronico(int j) {
		String[] nomes = new String[filiais[j].getQtdVeiculo()];  
		for(int i = 0; i != filiais[j].getQtdEletronico(); i++) {
			nomes[i] = filiais[j].getNomeEletronico(i); ;    
		}
		return nomes;   
	}
}
