package cap4.hierarquia.animais;

public class TestasAnimais {

	public static void main(String[] args) {
		
		Peixe peixe = new Peixe("Tubarão",300,0,"Cinzento","Mar",1.5F,"Barbatanas e cauda");
		peixe.dadosPeixe();
		
		Mamifero tubarao = new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"cactos");
		tubarao.dadosMamifero();
		
		Mamifero ursodocanada = new Mamifero("Urso-do-Canadá",180,4,"Vermelho","Terra",0.5F,"Mel");
		ursodocanada.dadosMamifero();
	}

}
