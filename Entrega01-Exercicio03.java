package main;
import java.util.Scanner;

public class Exercicio03 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o saldo: ");
		double saldo = scanner.nextDouble();
		scanner.nextLine();
		
		
		double resultado = saldo + (saldo * 0.01);
		
		System.out.println("O saldo de " + saldo + " com reajuste de 1% fica = " + resultado);
		
		scanner.close();
		
	}

}
