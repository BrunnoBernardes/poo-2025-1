package peso_ideal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
