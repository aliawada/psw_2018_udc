package cap2.retangulo;

public class Retangulo {
	private float comprimento = 1;
	private float largura = 1;
	
	public Retangulo() {
		comprimento = 0;
		largura = 0;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		if(comprimento <= 0 || comprimento >= 20)
			this.comprimento = 1;
		else this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		if(largura <= 0 || largura >= 20)
			this.largura = 1;
		else this.largura = largura;
	}
	
	public float calcularPerimetro() {
		float perimetro = 2*(comprimento + largura);
		return perimetro;
	}
	
	public float calcularArea() {
		float area = comprimento * largura;
		return area;
	}
}
