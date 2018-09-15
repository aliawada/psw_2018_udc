package cap2.retangulo;

public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.setComprimento(4);
		retangulo.setLargura(5);
		System.out.println("Area = " + retangulo.calcularArea());
		System.out.println("Perimetro = " + retangulo.calcularPerimetro());
	}

}
