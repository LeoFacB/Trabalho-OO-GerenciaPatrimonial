package modelo;

public class Consumivel extends Bem {
	private int depreciacao;
	public Consumivel(String nome, String descricao, int numeroSerie, String dataAquisicao, int depreciacao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
		this.depreciacao=depreciacao;
	}
	
	public int getDepreciacao() {
		return depreciacao;
	}
	public void setDepreciacao(int depreciacao) {
		this.depreciacao = depreciacao;
	}
}
