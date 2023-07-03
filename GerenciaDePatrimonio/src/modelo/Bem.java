package modelo;

/**
 * Classe abstrata que representa um bem.
 * 
 * @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
 * @since 2023
 * @version 1.5
 */
public abstract class Bem {

	private String nome;
	private String descricao;
	private String dataAquisicao;
	private int numeroSerie;

	/**
     * Construtor da classe Bem.
     * 
     */	
	public Bem(String nome, String descricao, String dataAquisicao, 
			int numeroSerie) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataAquisicao = dataAquisicao;
		this.numeroSerie = numeroSerie;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(String String) {
		this.dataAquisicao = String;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.numeroSerie + " " + this.descricao + " " 
	+ this.dataAquisicao;
	}
}