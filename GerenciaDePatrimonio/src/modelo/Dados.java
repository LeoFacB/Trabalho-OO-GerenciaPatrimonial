package modelo;

/**
 * Classe que representa os dados do sistema.
 * 
 * @author Angelica da Costa Campos e Leonardo Fachinello Bonetti
 * @since 2023
 * @version 1.5
 */
public class Dados {
	private Filial[] filiais = new Filial[50];
	private int qtdFiliais = 0;
	private Consumivel[] consumivel = new Consumivel[50];
	private int qtdConsumivel = 0;
	private Eletronico[] eletronico = new Eletronico[50];
	private int qtdEletronico = 0;
	private Imovel[] imovel = new Imovel[50];
	private int qtdImovel = 0;
	private Veiculo[] veiculo = new Veiculo[50];
	private int qtdVeiculo = 0;

	public void preencherDados() {
		for (int i = 0; i <= 5; i++) {

			filiais[i] = new Filial("Filial " + i, "Endereço " + i);
			consumivel[i] = new Consumivel("Consumivel " + i, "testeConsumivel",
					"testeConsumivel", i, i);
			imovel[i] = new Imovel("Imovel " + i, "testeConsumivel", "testeCons"
					+ "umivel", i, i, i,
					"testeConsumivel");
			veiculo[i] = new Veiculo("Veiculo" + i, "teste", "teste", i, "teste"
					+ "", "teste", "teste");
			eletronico[i] = new Eletronico("Eletronico" + i, "teste", "testeCon"
					+ "sumivel", i, i * 12);

			qtdFiliais = i;
			qtdVeiculo = i;
			qtdImovel = i;
			qtdConsumivel = i;
			qtdEletronico = i;

		}
	}

	public Filial[] getFiliais() {
		return filiais;
	}

	public void setFiliais(Filial[] filiais) {
		this.filiais = filiais;
	}

	public Consumivel[] getConsumivel() {
		return consumivel;
	}

	public void setConsumivel(Consumivel[] consumivel) {
		this.consumivel = consumivel;
	}

	public Eletronico[] getEletronico() {
		return eletronico;
	}

	public void setEletronico(Eletronico[] eletronico) {
		this.eletronico = eletronico;
	}

	public Imovel[] getImovel() {
		return imovel;
	}

	public void setImovel(Imovel[] imovel) {
		this.imovel = imovel;
	}

	public Veiculo[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}

	public int getQtdFiliais() {
		return qtdFiliais;
	}

	public void setQtdFiliais(int qtdFiliais) {
		this.qtdFiliais = qtdFiliais;
	}

	public int getQtdConsumivel() {
		return qtdConsumivel;
	}

	public void setQtdConsumivel(int qtdConsumivel) {
		this.qtdConsumivel = qtdConsumivel;
	}

	public int getQtdEletronico() {
		return qtdEletronico;
	}

	public void setQtdEletronico(int qtdEletronico) {
		this.qtdEletronico = qtdEletronico;
	}

	public int getQtdImovel() {
		return qtdImovel;
	}

	public void setQtdImovel(int qtdImovel) {
		this.qtdImovel = qtdImovel;
	}

	public int getQtdVeiculos() {
		return qtdVeiculo;
	}

	public void setQtdVeiculo(int qtdVeiculo) {
		this.qtdVeiculo = qtdVeiculo;
	}

	/**
	 * Insere ou edita uma filial na posição especificada.
	 * 
	 * @param f       a filial a ser inserida ou editada
	 * @param posicao a posição em que a filial será inserida ou editada
	 */
	public void inserirEditarFilial(Filial f, int posicao) {
		this.filiais[posicao] = f;
		if (posicao == qtdFiliais)
			qtdFiliais++;
	}

	/**
	 * Insere ou edita um imóvel na posição especificada.
	 * 
	 * @param imovel  o imóvel a ser inserido ou editado
	 * @param posicao a posição em que o imóvel será inserido ou editado
	 */
	public void inserirEditarImovel(Imovel imovel, int posicao) {
		this.imovel[posicao] = imovel;
		if (posicao == qtdImovel)
			qtdImovel++;
	}

	/**
	 * Insere ou edita um veículo na posição especificada.
	 * 
	 * @param veiculo o veículo a ser inserido ou editado
	 * @param posicao a posição em que o veículo será inserido ou editado
	 */
	public void inserirEditarVeiculo(Veiculo veiculo, int posicao) {
		this.veiculo[posicao] = veiculo;
		if (qtdVeiculo == posicao)
			qtdVeiculo++;
	}

	/**
	 * Insere ou edita um eletrônico na posição especificada.
	 * 
	 * @param eletronico o eletrônico a ser inserido ou editado
	 * @param posicao    a posição em que o eletrônico será inserido ou editado
	 */
	public void inserirEditarEletronico(Eletronico eletronico, int posicao) {
		this.eletronico[posicao] = eletronico;
		if (qtdEletronico == posicao)
			qtdEletronico++;
	}

	/**
	 * Insere ou edita um consumível na posição especificada.
	 * 
	 * @param consumivel o consumível a ser inserido ou editado
	 * @param posicao    a posição em que o consumível será inserido ou editado
	 */
	public void inserirEditarConsumivel(Consumivel consumivel, int posicao) {
		this.consumivel[posicao] = consumivel;
		if (qtdConsumivel == posicao)
			qtdConsumivel++;
	}

}
