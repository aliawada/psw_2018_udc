package cap4.seresvivos;

public class Principal {

	public static void main(String[] args) {
		SerVivo servivo = new SerVivo(false,false,"00/00/0000");
		servivo.nascer("30/01/1999");
		servivo.morrer("30/01/2025");
		servivo.extinguir();
		System.out.println(servivo.toString());

	}

}
