package cap4.taxonomialineu;

public class Classe extends Filo{
	protected String nomeClasse;

	public Classe(String nomeReino, String nomeFilo, String nomeClasse) {
		super(nomeReino, nomeFilo);
		this.nomeClasse = nomeClasse; 
	}

	@Override
	public String toString() {
		return "Classe [nomeClasse=" + nomeClasse + ", nomeFilo=" + nomeFilo + ", nomeReino=" + nomeReino + "]";
	} 
}
