package modelo;
/**
 * Classe que representa um objeto eletrônico.
 * 
 * @author Angelica da Costa Campos e Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.4
 */
public class Eletronico extends Bem {
	private int voltagem;
	
	public Eletronico(String nome, String descricao, String dataAquisicao, 
			int numeroSerie,int voltagem) {
		
		super(nome, descricao, dataAquisicao, numeroSerie);
		this.voltagem = voltagem;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
}
