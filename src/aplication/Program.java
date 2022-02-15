package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Qual seu nome? ");
		func.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.println("Qual porcentagem aumentar o salário? ");
		int porcentagem = sc.nextInt();
		func.aumentarSalario(porcentagem);
		
		System.out.println(func.toString());
		
		sc.close();
	}
}
