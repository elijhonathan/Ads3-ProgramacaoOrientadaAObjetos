package main;
import java.util.Scanner;

public class EntradaTeclado
{
	
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade da pessoa: ");
		
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome da pessoa: ");
		
		String nome = scanner.nextLine();
		
		
		scanner.close();
		
		
		System.out.println("A idade da pessoa é: " + idade);
		System.out.println("O nome da pessoa é: " + nome);
	
		

	}
}
