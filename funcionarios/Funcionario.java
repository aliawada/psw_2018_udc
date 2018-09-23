package cap5.funcionarios;

import ex.data.hora.Data;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String departamento;
	Data dataDeEntradaNaEmpresa;
	private String RG;
	private String CPF;
	private float salario;
	
	public float validaSalario(float salario) {
		if(salario < 0)
			salario = 0;
		return salario;
	}
	
	public void recebeAumento(float aumento) {
		this.salario = this.salario * aumento;
	}
	
	public float calculaGanhoAnual() {
		float anual = salario * 13;
		return anual;
	}
	
	/*public int equals(Funcionario funcionario1, Funcionario funcionario2) {
		if(funcionario1 != null || funcionario2 != null) {
			if(funcionario1.getClass() == Funcionario.class && funcionario2.getClass() == Funcionario.class) {
				//testar igualdade
			}
		}
	}*/

	public Funcionario(String nome, String sobrenome, String departamento, Data dataDeEntradaNaEmpresa, String rG,
			String cPF, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.departamento = departamento;
		this.dataDeEntradaNaEmpresa = dataDeEntradaNaEmpresa;
		this.RG = rG;
		this.CPF = cPF;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataDeEntradaNaEmpresa() {
		return dataDeEntradaNaEmpresa;
	}

	public void setDataDeEntradaNaEmpresa(Data dataDeEntradaNaEmpresa) {
		this.dataDeEntradaNaEmpresa = dataDeEntradaNaEmpresa;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		this.RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Funcionario [nome=" + nome + ", sobrenome=" + sobrenome + ", departamento=" + departamento
				+ ", dataDeEntradaNaEmpresa=" + dataDeEntradaNaEmpresa.mostraData() + ", RG=" + RG + ", CPF=" + CPF + ", salario="
				+ salario + "]";
	}
	
}
