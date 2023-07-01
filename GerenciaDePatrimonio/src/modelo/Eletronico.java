package modelo;

public class Eletronico extends Bem {
	private int voltagem;
	private boolean necessitaTomada;
	public Eletronico(String nome, String descricao, String dataAquisicao, int numeroSerie,
			int voltagem, boolean necessitaTomada) {
		super(nome, descricao,dataAquisicao,numeroSerie);
		this.voltagem= voltagem;
		this.necessitaTomada=necessitaTomada;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public boolean isNecessitaTomada() {
		return necessitaTomada;
	}
	public void setNecessitaTomada(boolean necessitaTomada) {
		this.necessitaTomada = necessitaTomada;
	}
}
