package cap4.taxonomialineu;

public class Especie extends Genero {
	private String nomeEspecie;

	public Especie(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia,
			String nomeGenero, String nomeEspecie) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero);
		this.nomeEspecie = nomeEspecie; 
	}

	public String obterDescricao() {
		return "Especie [nomeEspecie=" + nomeEspecie + ", nomeGenero=" + nomeGenero + ", nomeFamilia=" + nomeFamilia
				+ ", nomeOrdem=" + nomeOrdem + ", nomeClasse=" + nomeClasse + ", nomeFilo=" + nomeFilo + ", nomeReino="
				+ nomeReino + "]";
	} 
}
