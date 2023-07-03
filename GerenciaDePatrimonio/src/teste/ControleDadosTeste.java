package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import controle.ControleDados;
/**
 * Classe para execução de testes unitários caso a inserção de um objeto certo e outro errado
 * @author Leonardo Fachinello Bonetti e Angelica Da Costa Campos
 * @since 2023
 * @version 1.0
 * */
public class ControleDadosTeste {

	@Test
	public void test() {
	    	ControleDados d= new ControleDados();
	        
	        String[] consumivelCorreto = {"0","consumvel 1" , "Vermelho" , "22/05/2023" , "2222222" 
	        		,"2"};
		        
	        String[] consumivelIncorreto ={"0", "veiculo" , "teste" , "22/05/2023" , "nadad" 
	        		,"2"};
	        assertTrue(d.inserirEditarConsumivel(consumivelCorreto));
	        assertFalse(d.inserirEditarConsumivel(consumivelIncorreto));
	    }
}

