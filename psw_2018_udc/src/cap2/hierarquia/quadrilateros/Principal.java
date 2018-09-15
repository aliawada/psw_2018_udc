package cap2.hierarquia.quadrilateros;

public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(4,5,"a","a");
		System.out.println(retangulo.toString());
		System.out.println(retangulo.calcularArea());
		
		Trapezio trapezio = new Trapezio(4,5,2,"a");
		System.out.println(trapezio.toString());
		System.out.println(trapezio.calcularArea());
		
		Paralelogramo paralelogramo = new Paralelogramo(6,6,"6");
		System.out.println(paralelogramo);
		System.out.println(paralelogramo.calcularArea());
	}

}
