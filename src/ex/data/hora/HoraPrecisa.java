package ex.data.hora;

public class HoraPrecisa extends HoraAproximada {
	private int centesimosSegundos;

	public void inicializaHoraPrecisa(int hora,int minuto, int segundo, int centesimosSegundos) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.centesimosSegundos = centesimosSegundos;
	}
	
	public void mostraHoraPrecisa() {
		System.out.println(hora+":"+minuto+":"+segundo+":"+centesimosSegundos);
	}
	
}
