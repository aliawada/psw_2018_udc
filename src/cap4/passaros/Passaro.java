package cap4.passaros;

public class Passaro {
	private String especie;
	private float valor;
	private int id;
	private int tempo;
	
	public Passaro(String ecspecie, float valor, int id, int tempo) {
		this.especie = ecspecie;
		this.valor = valor;
		this.id = id;
		this.tempo = tempo;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String ecspecie) {
		this.especie = ecspecie;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String toString() {
		return "Passaro [ecspecie=" + especie + ", valor=" + valor + ", id=" + id + ", tempo=" + tempo + "]";
	}	
	
}
