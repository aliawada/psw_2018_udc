package cap5.hierarquia.funcionarios;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ali","01397715901","30/01/1999","CC","20/09/2018",5000F);
		Funcionario f2 = new Funcionario("Ali","01397715901","30/01/1999","CC","20/09/2018",5000F);
		Empresa empresa = new Empresa("cnpj");
		
		empresa.adicionaFuncionario(f1);
		empresa.adicionaFuncionario(f2);
		empresa.removeFuncionariO(f2);
		empresa.imprimiEmpresaComFuncionarios();

	}

}
