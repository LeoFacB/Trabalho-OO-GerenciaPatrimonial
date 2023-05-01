package modelo;

import java.util.Date;

public class Imovel extends Bem {
	
	public Imovel(String nome, String descricao, int numeroSerie, Date dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
	}
	
	private int tamanhoTerreno;
	private int valor;
	private String endereco;

	public int getTamanhoTerreno() {
		return tamanhoTerreno;
	}
	public void setTamanhoTerreno(int tamanhoTerreno) {
		this.tamanhoTerreno = tamanhoTerreno;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	

}
