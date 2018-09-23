package cap5.hierarquia.funcionarios;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private String cnpj;
	private List<Funcionario> func;
	
	public Empresa(String cnpj) {
		super();
		this.cnpj = cnpj;
		func = new ArrayList<Funcionario>();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void adicionaFuncionario(Funcionario funcionario)
 	{ 		
 		func.add(funcionario); 		
 	}
	
	public void removeFuncionariO(Funcionario funcionario) {
		func.remove(funcionario);
	}
 	
	public void imprimiEmpresaComFuncionarios()
 	{
 		for(int i=0;i<func.size();i++){
 			System.out.println(func.get(i));
 		}
 	}
 }
