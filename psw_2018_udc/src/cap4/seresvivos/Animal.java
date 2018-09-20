package cap4.seresvivos;

public class Animal extends SerVivo{
	protected boolean vertebrado;
	
	public Animal(boolean extinto, boolean vivo, String data, boolean vertebrado) {
		super(extinto, vivo, data);
		this.vertebrado = vertebrado;
	}

	public String toString() {
		return "Animal [vertebrado=" + vertebrado + ", extinto=" + extinto + ", vivo=" + vivo + ", data=" + data + "]";
	}
	
}
