package cap4.taxonomialineu;

public class Filo extends Reino{
	protected String nomeFilo;
	
	public Filo(String nomeReino, String nomeFilo) {
		super(nomeReino);
		this.nomeFilo = nomeFilo; 
	}

	@Override
	public String toString() {
		return "Filo [nomeFilo=" + nomeFilo + ", nomeReino=" + nomeReino + "]";
	} 
}
