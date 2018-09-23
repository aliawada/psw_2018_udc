package cap4.taxonomialineu;

public class Ordem extends Classe {
	protected String nomeOrdem;

	public Ordem(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem) {
		super(nomeReino, nomeFilo, nomeClasse);
		this.nomeOrdem = nomeOrdem;
	} 

	@Override
	public String toString() {
		return "Ordem [nomeOrdem=" + nomeOrdem + ", nomeClasse=" + nomeClasse + ", nomeFilo=" + nomeFilo
				+ ", nomeReino=" + nomeReino + "]";
	}  
}
