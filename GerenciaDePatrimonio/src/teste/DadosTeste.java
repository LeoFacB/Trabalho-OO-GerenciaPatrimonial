package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Consumivel;
import modelo.Dados;
/**
 * Classe para execução de testes unitários para adicionar um objeto e verificar
 * sua quantidade
 * @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
 * @since 2023
 * @version 1.0
 * */
public class DadosTeste {

	@Test
	public void test2() {
		Consumivel consumivel1= new Consumivel("Consumivel1" ,"Cadeira", "22/11/22" ,1221321, 12);
		Consumivel consumivel2= new Consumivel("Consumivel2" ,"Lapis", "15/12/20" ,6765576, 1);
		Dados dados = new Dados();
		dados.inserirEditarConsumivel(consumivel1, 0);
		dados.inserirEditarConsumivel(consumivel2, 1);
		assertEquals(2, dados.getQtdConsumivel());
	}

}
