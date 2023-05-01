package modelo;
import java.util.Date;
public abstract class Bem{
	
	private String nome;
	private String descricao;
	private Date dataAquisicao;
	private int numeroSerie;
	
	public Bem(String nome, String descricao, int numeroSerie, Date dataAquisicao) {
		this.nome= nome;
		this.descricao= descricao;
		this.dataAquisicao= dataAquisicao;
		this.numeroSerie= numeroSerie;
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
	public Date getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public void cadastraBem(Bem bem) {
	}
	public void editarBem() {
	}
}
