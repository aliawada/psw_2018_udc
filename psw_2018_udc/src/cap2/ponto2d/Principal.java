package cap2.ponto2d;

public class Principal {

	public static void main(String[] args) {
		Ponto2D ponto = new Ponto2D(3,2);
		System.out.println(ponto);
		
		Ponto2D ponto2 = new Ponto2D(4,5);
		
		Linha linha = new Linha(ponto,ponto2);
		System.out.println(linha);
		
		Poligono poligono = new Poligono(8);
		System.out.println(poligono);
		System.out.println(poligono.mostraNomePoligono());
	}

}
