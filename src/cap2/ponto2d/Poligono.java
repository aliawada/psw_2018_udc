package cap2.ponto2d;

public class Poligono {
	private int lados;
	
	public Poligono(int lados) {
		this.lados = dezLados(lados);
	}
	
	public int dezLados(int lados) {
		if(lados > 10 || lados < 3)
			lados = 3;
			return lados;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public String mostraNomePoligono() {
		if(lados == 3)
			return "Tril�tero";
		else if(lados == 4)
			return "Quadril�tero";
		else if(lados == 5)
			return "Pental�tero";
		else if(lados == 6)
			return "Hexal�tero";
		else if(lados == 7)
			return "Heptal�tero";
		else if(lados == 8)
			return "Octol�tero";
		else if(lados == 9)
			return "Undecal�tero";
		else if(lados == 10);
			return "Decal�tero";
	}
	
}
