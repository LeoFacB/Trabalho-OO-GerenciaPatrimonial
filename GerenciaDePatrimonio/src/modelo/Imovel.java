package modelo;

public class Imovel extends Bem {
	private int tamanhoTerreno;
	private int valor;
	private String endereco;
	
	public Imovel(String nome, String descricao, String dataAquisicao,
			int numeroSerie,int tamanhoTerreno, int valor, String endereco) {
		super(nome, descricao, dataAquisicao, numeroSerie);
		this.tamanhoTerreno=tamanhoTerreno;
		this.valor=valor;
		this.endereco=endereco;
	}

	public int getTamanhoTerreno() {
		return tamanhoTerreno;
	}
	public void setTamanhoTerreno(int tamanhoTerreno) {
		this.tamanhoTerreno = tamanhoTerreno;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	
}
