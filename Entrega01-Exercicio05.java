package main;
import java.util.Scanner;

public class Exercicio05 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do salario minimo: ");
		double salarioMinimo = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite o valor do seu salario: ");
		double salarioPessoa = scanner.nextDouble();
		scanner.nextLine();
		
		double resultado = salarioPessoa / salarioMinimo;
		
		System.out.println("Você ganha " + resultado + " salario minimo");
		
		
		
		scanner.close();
		
	}

}
