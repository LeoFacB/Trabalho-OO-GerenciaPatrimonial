package modelo;

import java.util.Date;

public class Consumivel extends Bem {

	public Consumivel(String nome, String descricao, int numeroSerie, Date dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
	}
	private int depreciacao;
	
	public int getdepreciacao() {
		return depreciacao;
	}
	public void setDataValidade(int depreciacao) {
		this.depreciacao = depreciacao;
	}
}
