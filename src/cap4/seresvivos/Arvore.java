package cap4.seresvivos;

public class Arvore extends Vegetal {
	private float altura;

	public Arvore(boolean extinto, boolean vivo, String data, boolean unicelular, float altura) {
		super(extinto, vivo, data, unicelular);
		this.altura = altura;
	}

	public String toString() {
		return "Arvore [altura=" + altura + ", unicelular=" + unicelular + ", extinto=" + extinto + ", vivo=" + vivo
				+ ", data=" + data + "]";
	}
	
	
	
}
