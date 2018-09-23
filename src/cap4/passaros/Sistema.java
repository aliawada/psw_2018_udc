package cap4.passaros;

import java.util.ArrayList;

public class Sistema {
	private int total;
	private int valorTotal;
	private String especies[];
	ArrayList<Passaro> birds;
	
	public Sistema() {
		birds = new ArrayList<Passaro>();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionaPassaroNoSistema(Passaro passaro) {
		birds.add(passaro);
		total++;
		valorTotal += passaro.getValor();
	}
	
	public void listaDosPassaros() {	
		for(int i=0;i<birds.size();i++) {	
			System.out.println(birds.get(i));
		}
	}
	
	/*public void passaroMaisAntigoDeCadaEspecie() {
		int x = 0;
		for(int i=0;i<birds.size();i++) {
			Passaro p = birds.get(i);
		for(int j=0;j<birds.size();j++) {
			Passaro p2 = birds.get(j);
		if(p.getEspecie().equals(p2.getEspecie())) {
			if(p.getTempo() > p2.getTempo()) {
				x = p.getTempo();
			} else x = p2.getTempo();
		}
		}
	}
	System.out.println(x);	
}*/
}
