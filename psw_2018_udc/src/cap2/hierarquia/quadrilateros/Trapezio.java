package cap2.hierarquia.quadrilateros;

public class Trapezio extends Quadrilatero {
	protected String ladosParalelos;
	private double baseMenor;
	
	public Trapezio(double base, double altura, double baseMenor, String ladosParalelos) {
		super(base, altura);
		this.ladosParalelos = ladosParalelos;
		this.baseMenor = baseMenor;
	}
	
	public String toString() {
		return " Trapezio [ladosParalelos=" + ladosParalelos + ", baseMenor=" + baseMenor + ", base=" + base
				+ ", altura=" + altura + "]";
	}

	public double calcularArea() {
		double area = ((base + baseMenor) * altura)/2;
		return area;
	}
	
}
