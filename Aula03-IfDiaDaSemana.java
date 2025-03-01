package main;
import java.util.Scanner;

public class DiaDaSemanaIf 
{
	public static void main(String[]args) 
	{
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		int dia = scanner.nextInt();
		
		scanner.close();
		
		
		if(dia == 1) 
		{
			System.out.print("Domingo");
		}
		
		else if(dia == 2) 
		{
			System.out.print("Segunda-feira");
		}
		
		else if(dia == 3) 
		{
			System.out.print("Terça-feira");
		}
		
		else if(dia == 4) 
		{
			System.out.print("Quarta-feira");
		}
		
		else if(dia == 5) 
		{
			System.out.print("Quinta-feira");
		}
		
		else if(dia == 6) 
		{
			System.out.print("Sexta-feira");
		}
		
		else if(dia == 7) 
		{
			System.out.print("Sabado");
		}
		
		else 
		{
			System.out.print("Dia invalido");
		}
			
	}

}
