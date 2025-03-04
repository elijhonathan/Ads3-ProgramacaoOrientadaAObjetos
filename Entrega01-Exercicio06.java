package main;
import java.util.Scanner;

public class Exercicio06 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		int antecessor = numero - 1;
		
		int sucessor = numero + 1;
		
		System.out.println("O numero " + numero + " tem como antecessor o " + antecessor + " e o sucessor " + sucessor);
		

		
		
		
		scanner.close();
		
	}

}
