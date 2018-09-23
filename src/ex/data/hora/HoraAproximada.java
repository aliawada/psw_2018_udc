package ex.data.hora;

public class HoraAproximada {
	protected int hora;
	protected int minuto;
	protected int segundo;
	
	public void inicializaHora(int hora,int minuto,int segundo) {
		this.hora = validaHora(hora);
		this.minuto = validaMinuto(minuto);
		this.segundo = validaSegundo(segundo);
	}
	
	public int validaHora(int hora) {
		if(hora < 0 || hora > 23)
			hora = 0;
		return hora;
	}
	
	public int validaMinuto(int minuto) {
		if(minuto < 0 || minuto > 59)
			minuto = 0;
		return minuto;
	}
	
	public int validaSegundo(int segundo) {
		if(segundo < 0 || segundo > 59)
			segundo = 0;
		return segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void mostraHora() {
		System.out.println(hora+":"+minuto+":"+segundo);
	}
	
}
