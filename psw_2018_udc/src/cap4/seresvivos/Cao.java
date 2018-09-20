package cap4.seresvivos;

public class Cao extends Animal {
	private String cor;
	private int porte;
	private float peso;

	public Cao(boolean extinto, boolean vivo, String data, boolean vertebrado, String cor, int porte, float peso) {
		super(extinto, vivo, data, vertebrado);
		this.cor = cor;
		this.porte = validaPorte(porte);
		this.peso = validaPeso(peso);
	}

	public int validaPorte(int porte) {
		if(porte < 0 || porte > 2) {
			porte = 1;
		}
		return porte;
	}
	
	public float validaPeso(float peso) {
		if(peso < 5)
			peso = 5; //ate 5kg
		if(peso < 20 && peso > 5)
			peso = 20; //ate 20kg
		if(peso > 20)
			peso = 21; //acima de 20kg
		return peso;
		
	}
	
	public String toString() {
		return "Cao [cor=" + cor + ", porte=" + porte + ", peso=" + peso + ", vertebrado=" + vertebrado + ", extinto="
				+ extinto + ", vivo=" + vivo + ", data=" + data + "]";
	}
	
}
