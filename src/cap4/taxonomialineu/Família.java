package cap4.taxonomialineu;

public class Fam�lia extends Ordem{
	protected String nomeFamilia;

	public Fam�lia(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem);
		this.nomeFamilia = nomeFamilia; 
	}

	@Override
	public String toString() {
		return "Fam�lia [nomeFamilia=" + nomeFamilia + ", nomeOrdem=" + nomeOrdem + ", nomeClasse=" + nomeClasse
				+ ", nomeFilo=" + nomeFilo + ", nomeReino=" + nomeReino + "]";
	}   
}
