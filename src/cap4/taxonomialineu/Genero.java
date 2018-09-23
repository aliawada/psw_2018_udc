package cap4.taxonomialineu;

public class Genero extends Família{
	protected String nomeGenero;

	public Genero(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia,
			String nomeGenero) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia);
		this.nomeGenero = nomeGenero; 
	}

	@Override
	public String toString() {
		return "Genero [nomeGenero=" + nomeGenero + ", nomeFamilia=" + nomeFamilia + ", nomeOrdem=" + nomeOrdem
				+ ", nomeClasse=" + nomeClasse + ", nomeFilo=" + nomeFilo + ", nomeReino=" + nomeReino + "]";
	}  
}
