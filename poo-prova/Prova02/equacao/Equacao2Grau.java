package equacao;

public class Equacao2Grau {
int x;
int y;
	public Equacao2Grau(int x, int y) {
		this.x = x;
		this.y = y;
	} // fim metodo construtor
	
	public int calculaEquacao1() {
		/*
		 * Metodo que calcula a equacao x^2 + y^2 + 2xy
		*/
		return x*x + y*y + 2*x*y;
	}//fim calculaEquacao1

	public int calculaEquacao2() {
		/*
		 * Metodo que calcula a equacao x^2 + y^2 + 2xy
		*/
		return x*x + y*y - 2*x*y;
	}//fim calculaEquacao2
	
}
