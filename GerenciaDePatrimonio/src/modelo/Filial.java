package modelo;
import java.util.ArrayList;
/** Classe para definir o comportamento das filiais 
 * 
 * @author Angelica da Costa Campos e Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.4
 */
public class Filial {
	private String nome;
	private String endereco;
	private ArrayList <Consumivel> consumivel;
	private ArrayList <Eletronico> eletronico;
	private ArrayList <Imovel> imovel;
	private ArrayList <Veiculo> veiculo;
/** 
 * Construtor da classe Filial
 */		    
	public Filial(String nome, String endereco) {
		this.nome = nome;
	    this.endereco = endereco;
	    this.consumivel = new ArrayList<>();
	    this.eletronico = new ArrayList<>();
	    this.imovel = new ArrayList<>();
	    this.veiculo = new ArrayList<>();
	}
	public String getNome() {
	    return nome;
	}
	public String getEndereco() {
	    return endereco;
	}

	public void setNome(String nome) {
	    this.nome = nome;
	}
	public void setEndereco(String endereco) {
	    this.endereco = endereco;
	}
	public ArrayList<Consumivel> getConsumivel() {
		return consumivel;
	}
	public void setConsumivel(ArrayList<Consumivel> consumivel) {
		this.consumivel = consumivel;
	}
	public ArrayList<Eletronico> getEletronico() {
		return eletronico;
	}
	public void setEletronico(ArrayList<Eletronico> eletronico) {
		this.eletronico = eletronico;
	}
	public ArrayList<Imovel> getImovel() {
		return imovel;
	}
	public void setImovel(ArrayList<Imovel> imovel) {
		this.imovel = imovel;
	}
	public ArrayList<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(ArrayList<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	public void setImovelList(Imovel imovelEs) {
		imovel.add(imovelEs);
	}
	public void setConsumivelList(Consumivel consumivel) {
		this.consumivel.add(consumivel);
	}
	public void setVeiculoList(Veiculo veiculoEs) {
		veiculo.add(veiculoEs);
	}
	public void setEletronicoList(Eletronico eletronicoEs) {
		eletronico.add(eletronicoEs);
	}
	public int getQtdVeiculo() {
		int tamanho = this.veiculo.size();
		return tamanho;
	}
	public int getQtdImovel() {
		int tamanho = this.imovel.size();
		return tamanho;	
		}
	public int getQtdConsumivel() {
		int tamanho = this.consumivel.size();
		return tamanho;
	}
	public int getQtdEletronico() {
		int tamanho = this.eletronico.size();
		return tamanho;
	}
	public String getNomeVeiculo(int i) {
		String nome;
		nome = this.veiculo.get(i).getNome();
		return nome;
	}
	public String getNomeImovel(int i) {
		String nome;
		nome = this.imovel.get(i).getNome();
		return nome;
		}
	public String getNomeConsumivel(int i) {
		String nome;
		nome = this.consumivel.get(i).getNome();
		return nome;
	}
	public String getNomeEletronico(int i) {
		String nome;
		nome = this.eletronico.get(i).getNome();
		return nome;
	}
}