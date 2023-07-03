package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import controle.ControleDados;
import modelo.Consumivel;
import modelo.Dados;
/**
 * Classe para execução de testes unitários para remover um objeto e verificar
 * sua quantidade já com os predefinidos
 * @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
 * @since 2023
 * @version 1.0
 * */
public class ControleDadosTeste2 {

	@Test
	public void test3() {
		ControleDados dados = new ControleDados();
		Dados d= new Dados();
        String[] consumivel1 = {"0","consumvel 1" , "Vermelho" , "22/05/2023" , "2222222" 
        		,"2"};
        dados.inserirEditarConsumivel(consumivel1);
		assertEquals(1 + 4, dados.getQtdConsumivel());
	}

}
