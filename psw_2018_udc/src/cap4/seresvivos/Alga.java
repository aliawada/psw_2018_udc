package cap4.seresvivos;

public class Alga extends Vegetal {
	private boolean agua;

	public Alga(boolean extinto, boolean vivo, String data, boolean unicelular, boolean agua) {
		super(extinto, vivo, data, unicelular);
		this.agua = agua;
	}
	
	public String toString() {
		return "Alga [agua=" + agua + ", unicelular=" + unicelular + ", extinto=" + extinto + ", vivo=" + vivo
				+ ", data=" + data + "]";
	}
	
}
