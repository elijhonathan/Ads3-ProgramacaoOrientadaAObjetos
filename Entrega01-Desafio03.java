package main;
import java.util.Scanner;

public class Desafio03
{
	
	public static void main(String[]args) 
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite o segundo numero: ");
		double numero2 = scanner.nextDouble();
		scanner.nextLine();
		
		
		System.out.println("Digite a operação desejada: ");
		System.out.println("Digite 1 para soma ");
		System.out.println("Digite 2 para subtração ");
		System.out.println("Digite 3 para divisão ");
		System.out.println("Digite 4 para multiplicação ");
		int operacao = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(operacao) 
		{
			case 1:
				System.out.println(numero1 + numero2);
				break;
			
			case 2:
				System.out.println(numero1 - numero2);
				break;
				
			case 3:
				System.out.println(numero1 / numero2);
				break;
				
			case 4:
				System.out.println(numero1 * numero2);
				break;
				
			default:
				System.out.println("Opção invalida!");
		
		}
		
		
		scanner.close();
		

	}
}
