package main;
import java.util.Scanner;

public class Desafio01 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a sua idade:  ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o seu batmento cardiaco: ");
		int batimento = scanner.nextInt();
		scanner.nextLine();
		
		if (idade > 60 && batimento > 150) 
		{
			System.out.println("Classificação: URGENTE");
		}
		
		else if(idade > 60 && batimento <= 150) 
		{
			System.out.println("Classificação: Urgencia moderada");
		}
		
		else if(idade <= 60 && batimento > 150) 
		{
			System.out.println("Classificação: Urgencia moderada");
		}
		
		else if(idade <= 60 && batimento <= 150) 
		{
			System.out.println("Classificação: Não é urgente");
		}

		
		scanner.close();
		
	}

}
