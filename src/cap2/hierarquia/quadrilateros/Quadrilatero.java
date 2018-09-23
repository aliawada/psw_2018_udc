package cap2.hierarquia.quadrilateros;

public class Quadrilatero {
	protected double base;
	protected double altura;
	
	public Quadrilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public String toString() {
		return " Quadrilatero [base=" + base + ", altura=" + altura + "]";
	}
	
}
