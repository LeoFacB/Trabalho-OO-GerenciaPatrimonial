package modelo;

public class Dados {
	private Filial[] filiais = new Filial[50];
	private int qtdFiliais = 0;
	private Consumivel[] consumivel= new Consumivel[50];
	private int qtdConsumivel=0;
	private Eletronico[] eletronico= new Eletronico[50];
	private int qtdEletronico=0;
	private Imovel[] imovel= new Imovel[50];
	private int qtdImovel = 0;
	private Veiculo[] veiculo= new Veiculo[50];
	private int qtdVeiculo = 0;
	
	public void fillWithSomeData() {
		for(int i = 0; i <= 5 ; i++) {
			
			/*Cria objetos aleatorios no banco de dados*/
			
			filiais[i] = new Filial("Filial " + i, "Endereço " + i);
			consumivel[i]= new Consumivel("Consumivel "+ i, "teste", i*5142,"testelol", i*4);
			imovel[i]= new Imovel("Imovel "+ i, null, i, null, i, i, null);
			veiculo[i]= new Veiculo("Veiculo"+ i, null, i, null, null, null, null);
			eletronico[i]= new Eletronico("Eletronico"+i,null,i, null, i*12, null);
			
			/*Atualiza a qtd de objetos com a qtd criada na funcao*/
			
			qtdFiliais=i;
			qtdVeiculo=i;
			qtdImovel=i;
			qtdConsumivel=i;
			qtdEletronico=i;
					
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
		this.qtdVeiculo= qtdVeiculo;
	}
	public void inserirEditarFilial(Filial f, int posicao) {
		this.filiais[posicao] = f;
		if(posicao == qtdFiliais) 
			qtdFiliais++;
	}
	public void inserirEditarImovel(Imovel imovel, int posicao) {
		this.imovel[posicao]= imovel;
		if(posicao == qtdImovel) 
			qtdImovel++;
	}
	public void inserirEditarVeiculo(Veiculo veiculo, int posicao) {
		this.veiculo[posicao]= veiculo;
		if(qtdVeiculo==posicao)
			qtdVeiculo++;
	}
	public void inserirEditarEletronico(Eletronico eletronico, int posicao) {
		this.eletronico[posicao]= eletronico;
		if(qtdEletronico==posicao)
			qtdEletronico++;
	}
	public void inserirEditarConsumivel(Consumivel consumivel, int posicao) {
		this.consumivel[posicao]= consumivel;
		if(qtdConsumivel==posicao)
			qtdConsumivel++;
	}

}
