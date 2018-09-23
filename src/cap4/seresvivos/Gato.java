package cap4.seresvivos;

public class Gato extends Animal {
	private String cor;
	private int idade;
	
	public Gato(boolean extinto, boolean vivo, String data, boolean vertebrado, String cor, int idade) {
		super(extinto, vivo, data, vertebrado);
		this.cor = cor;
		this.idade = idade;
	}

	public String toString() {
		return "Gato [cor=" + cor + ", idade=" + idade + ", vertebrado=" + vertebrado + ", extinto=" + extinto
				+ ", vivo=" + vivo + ", data=" + data + "]";
	}
	
	
	
}
