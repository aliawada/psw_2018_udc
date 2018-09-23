package ex.data.hora;

public class Principal {

	public static void main(String[] args) {
		
		Hora horaZero = new Hora();
		Hora hora = new Hora((byte)4,(byte)20);
		Hora hora2 = new Hora((byte)4,(byte)20);

		System.out.println("horaZero: " + horaZero.mostraHora());
		System.out.println("hora: " + hora.mostraHora());
		
		
		Data data = new Data((byte)2,(byte)1,(short)2018);
		System.out.println(data.mostraData());
		Data data1 = new Data((byte)2,(byte)1,(short)2018);
		System.out.println(data.mostraData());
		
		
		DataHora dataHora = new DataHora();
		System.out.println(dataHora.mostraDataHora());
		
		DataHora dataHora2 = new DataHora(data, hora);
		System.out.println(dataHora2.mostraDataHora());
		
		System.out.println(Hora.comparaHoras(hora,hora2));
		
		HoraAproximada horaaproximada = new HoraAproximada();
		horaaproximada.inicializaHora(17, 10, 30);
		horaaproximada.mostraHora();
	}
	
}