package ex.data.hora;

public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora(Data data,Hora hora) {
		this.data = data;
		this.hora = hora;
	}
	
	public DataHora() {
		data  = new Data();
		hora = new Hora();
	}
	
	public String mostraDataHora() {		
		return String.format("%s - %s", data.mostraData(),hora.mostraHora());
	}
}