package cap4.seresvivos;

public class SerVivo {
	protected boolean extinto;
	protected boolean vivo; 
	protected String data;
	
	public SerVivo(boolean extinto, boolean vivo, String data) {
		this.extinto = extinto;
		this.vivo = vivo;
		this.data = data;
	}

	public void extinguir() {
		this.extinto = true;
	}
	
	public void nascer(String data) {
		if(extinto == false) {
		if(vivo == false)
			this.data = data;
			vivo = true;
		}
	}
	
	public void morrer(String data) {
		if(extinto == false) {
		if(vivo == true)
			this.data = data;
			vivo = false;
		}
	}
	public String toString() {
		return "SerVivo [extinto=" + extinto + ", vivo=" + vivo + ", data=" + data + "]";
	}
	
	
	
}
