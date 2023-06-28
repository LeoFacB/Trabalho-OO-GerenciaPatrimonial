package controle;
import modelo.*;

public class ControleFilial {
	private Filial[] filiais;    // Declaração de um array de objetos do tipo Filial
	private int qtdFiliais;      // Variável para armazenar a quantidade de filiais
	
	public ControleFilial(ControleDados d) {
		filiais = d.getFiliais();           // Obtém o array de filiais do objeto ControleDados passado como parâmetro
		qtdFiliais = d.getQtdFiliais();     // Obtém a quantidade de filiais do objeto ControleDados passado como parâmetro
	}
	
	public String[] getNomeFilial() {
		String[] nomes = new String[qtdFiliais];    // Declaração de um array de Strings com tamanho igual à quantidade de filiais
		for(int i = 0; i < qtdFiliais; i++) {
			nomes[i] = filiais[i].getNome();       // Armazena o nome de cada filial no array de Strings
		}
		
		return nomes;    // Retorna o array de nomes das filiais
	}
	
	public int getQtdFiliais() {
		return qtdFiliais;    // Retorna a quantidade de filiais
	}

	public void setQtdFiliais(int qtd) {
		this.qtdFiliais = qtd;    // Define a quantidade de filiais
	}
	
	public String getNomeFilial(int i) {		
		return filiais[i].getNome();    // Retorna o nome da filial na posição i
	}
}
