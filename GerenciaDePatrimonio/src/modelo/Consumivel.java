package modelo;

public class Consumivel extends Bem {
	private int depreciacao;
	public Consumivel(String nome, String descricao, String dataAquisicao, int numeroSerie,
			int depreciacao) {
		super(nome, descricao, dataAquisicao, numeroSerie);
		this.depreciacao=depreciacao;
	}
	
	public int getDepreciacao() {
		return depreciacao;
	}
	public void setDepreciacao(int depreciacao) {
		this.depreciacao = depreciacao;
	}
}
