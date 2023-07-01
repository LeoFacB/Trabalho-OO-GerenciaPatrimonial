package modelo;
import java.util.ArrayList;

public class Filial {
//ATRIBUTOS
	private String nome;
	private String endereco;
//PATRIMONIOS DE UMA FILIAL
	private Consumivel[] consumivel;
	private Eletronico[] eletronico;
	private Imovel[] imovel;
	private Veiculo[] veiculo;
	
//CONSTRUTOR	    
	public Filial(String nome, String endereco) {
		this.nome = nome;
	    this.endereco = endereco;
	}
//GETTERS E SETTERS
	public String getNome() {
	    return nome;
	}
	public String getEndereco() {
	    return endereco;
	}

	public void setNome(String nome) {
	    this.nome = nome;
	}
	public void setEndereco(String endereco) {
	    this.endereco = endereco;
	}
	public Consumivel[] getConsumivel() {
		return consumivel;
	}
	public void setConsumivel(Consumivel[] consumivel) {
		this.consumivel = consumivel;
	}
	public Eletronico[] getEletronico() {
		return eletronico;
	}
	public void setEletronico(Eletronico[] eletronico) {
		this.eletronico = eletronico;
	}
	public Imovel[] getImovel() {
		return imovel;
	}
	public void setImovel(Imovel[] imovel) {
		this.imovel = imovel;
	}
	public Veiculo[] getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}	
	
}