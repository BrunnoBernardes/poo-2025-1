package peso_ideal;

import static org.junit.Assert.*;
import org.junit.Test;

public class SaudeTestes {

@Test
	public void testeIMC() {
		Saude saude = new Saude(20, 1.64, 62);
	assertEquals( saude.calculaIMC(), 23, 0.5 );
	
}

@Test
	public void testeCondicao() {
		Saude saude = new Saude(20, 1.64, 62);
	assertTrue( saude.condicaoFisica().equals("Peso adequado") );
}
}
