package modelo;

public class Veiculo extends Bem{
	private String placa;
	private String marca;
	private String modelo;

	public Veiculo(String modelo,String marca,String placa,String nome, String descricao, int numeroSerie, String dataAquisicao) {
		super(nome, descricao, numeroSerie, dataAquisicao);
		this.marca=marca;
		this.placa=placa;
		this.modelo=modelo;
	}
	
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
	
	
