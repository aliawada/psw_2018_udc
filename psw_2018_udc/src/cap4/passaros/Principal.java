package cap4.passaros;

public class Principal {

	public static void main(String[] args) {
		Passaro passaro = new Passaro("a",1,1,1);
		Passaro passaro2 = new Passaro("b",2,2,2);
		Passaro passaro3 = new Passaro("c",3,3,3);
		Passaro passaro4 = new Passaro("a",4,4,4);
		
		Sistema sistema = new Sistema();
		sistema.adicionaPassaroNoSistema(passaro);
		sistema.adicionaPassaroNoSistema(passaro2);
		sistema.adicionaPassaroNoSistema(passaro3);
		sistema.adicionaPassaroNoSistema(passaro4);
		//sistema.listaDosPassaros();
		
		//System.out.println("Total de Passaros = " + sistema.getTotal());
		
		//System.out.println("Valor Total dos Passasros = " + sistema.getValorTotal());
		
		//sistema.passaroMaisAntigoDeCadaEspecie();
	}

}
