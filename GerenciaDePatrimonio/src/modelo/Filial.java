package modelo;
import java.util.ArrayList;

public class Filial {
//ATRIBUTOS
	private String nome;
	private String endereco;
//PATRIMONIOS DE UMA FILIAL
	private Bem[] bens;
//CONSTRUTOR	    
	public Filial(String nome, String endereco) {
		this.nome = nome;
	    this.endereco = endereco;
	}
//GETTERS
	public String getNome() {
	    return nome;
	}
	public Bem[] getBens() {
		return bens;
	}
	public void setBens(Bem[] bens) {
		this.bens = bens;
	}
	public String getEndereco() {
	    return endereco;
	}

//SETTERS
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public void setEndereco(String endereco) {
	    this.endereco = endereco;
	}	
}