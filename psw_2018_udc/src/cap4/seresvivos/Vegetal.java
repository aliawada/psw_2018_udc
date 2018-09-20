package cap4.seresvivos;

public class Vegetal extends SerVivo{
	protected boolean unicelular;
	
	public Vegetal(boolean extinto, boolean vivo, String data, boolean unicelular) {
		super(extinto, vivo, data);
		this.unicelular = unicelular;
	}

	public String toString() {
		return "Vegetal [unicelular=" + unicelular + ", extinto=" + extinto + ", vivo=" + vivo + ", data=" + data + "]";
	}
	
	
}
