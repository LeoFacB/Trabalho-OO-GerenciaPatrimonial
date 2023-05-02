package modelo;

public class Eletronico extends Bem {
	private int voltagem;
	private boolean necessitaTomada;
	public Eletronico(boolean necessitaTomada,int voltagem,String nome, String descricao, int numeroSerie, String dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
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
