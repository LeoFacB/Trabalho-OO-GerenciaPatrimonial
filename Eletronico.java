package modelo;

import java.util.Date;

public class Eletronico extends Bem {

	public Eletronico(String nome, String descricao, int numeroSerie, Date dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
	}
	private int voltagem;
	private boolean necessitaTomada;
	
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
