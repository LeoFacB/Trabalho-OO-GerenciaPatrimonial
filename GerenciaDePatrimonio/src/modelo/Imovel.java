package modelo;

public class Imovel extends Bem {
	private int tamanhoTerreno;
	private int valor;
	private String endereco;
	
	public Imovel(String nome,String descricao,int numeroSerie, String 
	dataAquisicao, int tamanhoTerreno, int valor, String endereco) {
		super(nome, descricao, numeroSerie, dataAquisicao);
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
