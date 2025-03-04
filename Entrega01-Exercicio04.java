package main;
import java.util.Scanner;

public class Exercicio04 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a porcentagem do IPI:");
		double ipi = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite o codigo da peça 1: ");
		int  codigo1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o valor unitario da peça " + codigo1);
		double valor1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite a quantidade da peça " + codigo1);
		double quantidade1 = scanner.nextDouble();
		scanner.nextLine();
		
		
		System.out.println("Digite o codigo da peça 2: ");
		int  codigo2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o valor unitario da peça " + codigo2);
		double valor2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite a quantidade da peça " + codigo2);
		double quantidade2 = scanner.nextDouble();
		scanner.nextLine();
		
		double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);
		
		System.out.printf("O valor total será %.2f", total);
		
		scanner.close();
		
		
	}

}
