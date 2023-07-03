package modelo;
/**
* Classe abstrata que representa um bem de pouca duração.
* 
* @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
* @since 2023
* @version 1.3
*/
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
