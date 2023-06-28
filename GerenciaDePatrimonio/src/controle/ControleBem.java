package controle;
import modelo.*;


/* Classe para fazer o controle de dados dos Bens
 * Controla a quantidade de filiais, seus nomes
 * @author Angélica da Costa Campos
 * @since 2023
 * @version 1.2 
 * */


public class ControleBem {
	private Imovel[] imovel;    
	private int qtdImovel;
	private Veiculo[] veiculo;    
	private int qtdVeiculo;
	private Consumivel[] consumivel;    
	private int qtdConsumivel;
	private Eletronico[] eletronico;    
	private int qtdEletronico;
	
	public ControleBem(ControleDados d) {
		imovel = d.getImovel();           
		qtdImovel = d.getQtdImovel(); 
		
		veiculo = d.getVeiculo();           
		qtdVeiculo = d.getQtdVeiculo();
		
		consumivel = d.getConsumivel();           
		qtdConsumivel = d.getQtdConsumivel();
		
		eletronico = d.getEletronico();           
		qtdEletronico = d.getQtdEletronico();	
	}
	
	public Imovel[] getImovel() {
		return imovel;
	}

	public void setImovel(Imovel[] imovel) {
		this.imovel = imovel;
	}

	public int getQtdImovel() {
		return qtdImovel;
	}

	public void setQtdImovel(int qtdImovel) {
		this.qtdImovel = qtdImovel;
	}

	public Veiculo[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}

	public int getQtdVeiculo() {
		return qtdVeiculo;
	}

	public void setQtdVeiculo(int qtdVeiculo) {
		this.qtdVeiculo = qtdVeiculo;
	}

	public Consumivel[] getConsumivel() {
		return consumivel;
	}

	public void setConsumivel(Consumivel[] consumivel) {
		this.consumivel = consumivel;
	}

	public int getQtdConsumivel() {
		return qtdConsumivel;
	}

	public void setQtdConsumivel(int qtdConsumivel) {
		this.qtdConsumivel = qtdConsumivel;
	}

	public Eletronico[] getEletronico() {
		return eletronico;
	}

	public void setEletronico(Eletronico[] eletronico) {
		this.eletronico = eletronico;
	}

	public int getQtdEletronico() {
		return qtdEletronico;
	}

	public void setQtdEletronico(int qtdEletronico) {
		this.qtdEletronico = qtdEletronico;
	}

	public String[] getNomeBemImovel() {
		String[] nomes = new String[qtdImovel];    
		for(int i = 0; i < qtdImovel; i++) {
			nomes[i] = imovel[i].getNome();      
		}
		return nomes;   
	}
	public String[] getNomeBemVeiculo() {
		String[] nomes = new String[qtdVeiculo];    
		for(int i = 0; i < qtdVeiculo; i++) {
			nomes[i] = veiculo[i].getNome();      
		}
		return nomes;   
	}
	public String[] getNomeBemConsumivel() {
		String[] nomes = new String[qtdConsumivel];    
		for(int i = 0; i < qtdConsumivel; i++) {
			nomes[i] = consumivel[i].getNome();      
		}
		return nomes;   
	}
	public String[] getNomeBemEletronico() {
		String[] nomes = new String[qtdEletronico];    
		for(int i = 0; i < qtdEletronico; i++) {
			nomes[i] = eletronico[i].getNome();      
		}
		return nomes;   
	}
}