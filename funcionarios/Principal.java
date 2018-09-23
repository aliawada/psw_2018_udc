package cap5.funcionarios;

import ex.data.hora.Data;

public class Principal {

	public static void main(String[] args) {
		Data data = new Data((byte)23,(byte)9,(short)2018);
		Funcionario funcionario = new Funcionario("Ali","Awada","CC",data,"123456789","12345678901",1234.5F);
		Funcionario funcionario2 = new Funcionario("Ali","Awada","CC",data,"123456789","12345678901",1234.5F);
		
		System.out.println(funcionario.calculaGanhoAnual());
		funcionario2.recebeAumento(1.10F);
		System.out.println(funcionario2.calculaGanhoAnual());
	}

}
