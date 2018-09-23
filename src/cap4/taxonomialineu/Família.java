package cap4.taxonomialineu;

public class Família extends Ordem{
	protected String nomeFamilia;

	public Família(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem);
		this.nomeFamilia = nomeFamilia; 
	}

	@Override
	public String toString() {
		return "Família [nomeFamilia=" + nomeFamilia + ", nomeOrdem=" + nomeOrdem + ", nomeClasse=" + nomeClasse
				+ ", nomeFilo=" + nomeFilo + ", nomeReino=" + nomeReino + "]";
	}   
}
