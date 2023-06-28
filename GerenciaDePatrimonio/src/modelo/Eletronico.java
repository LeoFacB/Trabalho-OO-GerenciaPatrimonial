package modelo;

public class Eletronico extends Bem {
	private int voltagem;
	private String necessitaTomada;
	public Eletronico(String nome, String descricao, int numeroSerie, String dataAquisicao,
			int voltagem, String necessitaTomada) {
		super(nome, descricao, numeroSerie, dataAquisicao);
		this.voltagem= voltagem;
		this.necessitaTomada=necessitaTomada;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public String isNecessitaTomada() {
		return necessitaTomada;
	}
	public void setNecessitaTomada(String necessitaTomada) {
		this.necessitaTomada = necessitaTomada;
	}
}
