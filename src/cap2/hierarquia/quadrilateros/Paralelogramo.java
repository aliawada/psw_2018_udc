package cap2.hierarquia.quadrilateros;

public class Paralelogramo extends Quadrilatero {
	protected String ladosOpostosParalelos;

	public Paralelogramo(double base, double altura, String ladosOpostosParalelos) {
		super(base, altura);
		this.ladosOpostosParalelos = ladosOpostosParalelos;
	}

	public String toString() {
		return "Paralelogramo [ladosOpostosParalelos=" + ladosOpostosParalelos + ", base=" + base + ", altura=" + altura
				+ "]";
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
}
