package cap5.funcionarios;

import ex.data.hora.Data;

public class testeCompFuncionario {

	public static void main(String[] args) {
		Data data = new Data((byte)1,(byte)1,(short)2018);
		Funcionario func1 = new Funcionario("a", "a", "a", data, "a", "a", 1);
		Funcionario func2 = new Funcionario("b", "b", "b", data, "b", "b", 2);
		Funcionario func3 = new Funcionario("c", "c", "c", data, "c", "c", 3);
		Funcionario func4 = new Funcionario("c", "c", "c", data, "c", "c", 3);
		if(func1 == func2)
			System.out.println("iguais");
		else System.out.println("diferentes");
		
		if(func3 == func4)
			System.out.println("iguais");
		else System.out.println("diferentes");
	
		Funcionario func5 = func4; //duas referencias para o mesmo objeto
		if(func4 == func5)
			System.out.println("iguais");
		else System.out.println("diferentes");
		
		System.out.println(func1.toString());
	}

}
