package modelo;

import java.util.Date;

public class Veiculo extends Bem {

	public Veiculo(String nome, String descricao, int numeroSerie, Date dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
	}
	
	private String placa;
	private String marca;
	private String modelo;
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	
	

}
