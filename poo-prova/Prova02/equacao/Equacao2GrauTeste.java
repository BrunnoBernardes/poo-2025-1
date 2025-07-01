package equacao;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Equacao2GrauTeste {
	@Test
	public void test1() {
		Equacao2Grau eq = new Equacao2Grau(2,2);
		assertEquals(15, eq.calculaEquacao1());
	}// fim teste1
	@Test
	public void test2() {
		Equacao2Grau eq = new Equacao2Grau(2,2);
		assertEquals(0, eq.calculaEquacao2());
	}// fim teste2

	@Test
	public void test3() {
		Equacao2Grau eq = new Equacao2Grau(3,4);
		assertEquals(46, eq.calculaEquacao1());
	}// fim teste3
	@Test
	public void test4() {
		Equacao2Grau eq = new Equacao2Grau(3,4);
		assertEquals(46, eq.calculaEquacao2());
	}// fim teste4

}
