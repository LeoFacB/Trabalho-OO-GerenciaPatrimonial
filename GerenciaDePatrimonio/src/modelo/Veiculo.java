package modelo;
/**
 * Classe para definir o comportamento do objeto veículo e herda a classe Bem.
 * @author Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.4
 */
public class Veiculo extends Bem{
	private String placa;
	private String marca;
	private String modelo;

	public Veiculo(String nome, String descricao, String dataAquisicao, 
			int numeroSerie, String marca,
			String placa, String modelo) {
		super(nome, descricao, dataAquisicao, numeroSerie);
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
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
	
	
