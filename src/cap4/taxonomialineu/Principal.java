package cap4.taxonomialineu;

public class Principal {

	public static void main(String[] args) {
		Especie homosapiens = new Especie("Animalia","Chordata","Mammalia","Primata","Hominidae","Homo","Homo Sapiens");
		System.out.println(homosapiens.obterDescricao()); 
		} 
}
