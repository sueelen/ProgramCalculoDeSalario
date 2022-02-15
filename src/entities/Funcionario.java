package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return "Nome: " + nome + ", " +
				"Salário Bruto: " + "$ " + String.format("%.2f", salarioBruto)  + ", " +
				"Salário líquido: " + "$ " + String.format("%.2f", salarioLiquido());
	}
}
