package modelo;

public class Teste {

	public static void main(String[] args) {
		Filial filial1=new Filial(null, null);
		filial1.setNome("Bom Demais");
		filial1.setEndereco("Brasilia");
		
		Filial filial2=new Filial(null, null);
		filial2.setNome("Bom Demais");
		filial2.setEndereco("Goiania");
		
		Funcionario funcionario1=new Funcionario(null, null, null, null);
		funcionario1.setNome("Francisco");
		funcionario1.setCpf("113348856");
		funcionario1.setCargo("Gerente");
		funcionario1.setTelefone("982350421");
		
		Funcionario funcionario2=new Funcionario(null, null, null, null);
		funcionario2.setNome("Angelina");
		funcionario2.setCpf("11399829");
		funcionario2.setCargo("Contadora");
		funcionario2.setTelefone("982392612");
		
		
		Consumivel patrimonio1= new Consumivel(null, null, 0, null, 0);
		patrimonio1.setNome("Lapis");
		patrimonio1.setDataAquisicao("01/04/2022");
		patrimonio1.setNumeroSerie(334551);
		patrimonio1.setDescricao("Lapis azul");
		patrimonio1.setDepreciacao(3);
		
		Eletronico patrimonio2= new Eletronico(false, 0, null, null, 0, null);
		patrimonio2.setNome("Computador");
		patrimonio2.setDataAquisicao("07/08/2019");
		patrimonio2.setNumeroSerie(334551);
		patrimonio2.setDescricao("Computador na sala de reuniao");
		patrimonio2.setVoltagem(120);
		patrimonio2.setNecessitaTomada(true);

		Imovel patrimonio3= new Imovel(null, 0, 0, null, null, 0, null);
		patrimonio3.setNome("Edifico Larangeiras");
		patrimonio3.setDataAquisicao("02/06/1997");
		patrimonio3.setNumeroSerie(523836871);
		patrimonio3.setDescricao("Predio azul na esquina");
		patrimonio3.setTamanhoTerreno(190);
		patrimonio3.setValor(1200000);
		
		Veiculo patrimonio4= new Veiculo(null, null, null, null, null, 0, null);
		patrimonio4.setNome("Carro de Serviço");
		patrimonio4.setDataAquisicao("01/01/2023");
		patrimonio4.setNumeroSerie(529836777);
		patrimonio4.setDescricao("Carro para entregas");
		patrimonio4.setMarca("Ford");
		patrimonio4.setModelo("Renegade");
		patrimonio4.setPlaca("ABC-2861");
		
		funcionario2.anexarPatrimonioFuncionario(patrimonio1);
		funcionario1.anexarPatrimonioFuncionario(patrimonio4);
		funcionario1.anexarPatrimonioFuncionario(patrimonio3);
		funcionario1.listarBemFuncionario();
		filial2.anexarBemFilial(patrimonio4);
		filial2.anexarBemFilial(patrimonio3);
		filial2.anexarBemFilial(patrimonio2);
		filial1.anexarBemFilial(patrimonio1);
		filial2.anexarFuncionarioFilial(funcionario2);
		filial1.anexarFuncionarioFilial(funcionario1);
		filial2.listarPatrimonioFilial();
		filial1.listarPatrimonioFilial();
		System.out.print(funcionario1+"\n\n");
		System.out.print(funcionario2+"\n\n");
		System.out.print(filial1+"\n\n");
		System.out.print(filial2+"\n\n");
		System.out.print(patrimonio1+"\n\n");
		System.out.print(patrimonio2+"\n\n");
		System.out.print(patrimonio3+"\n\n");
		System.out.print(patrimonio4+"\n\n");

	}

}
