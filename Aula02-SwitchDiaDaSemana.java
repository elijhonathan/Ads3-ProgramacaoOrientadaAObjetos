package main;
import java.util.Scanner;

public class DiaDaSemana 
{
	
	public static void  main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		int dia = scanner.nextInt();
		
		scanner.close();
		
		switch(dia) 
		{
		
		
		
		case 2:
			System.out.print("Segunda-feira");
			break;
			
		case 3:
			System.out.print("Terça-feira");
			break;
			
		case 4:
			System.out.print("Quarta-feira");
			break;
			
		case 5:
			System.out.print("Quinta-feira");
			break;
			
		case 6:
			System.out.print("Sexta-feira");
			break;
			
		case 7:
			System.out.print("Sabado");
			break;
			
		case 1:
			System.out.print("Domingo");
			break;
			
		default:
			System.out.print("Dia invalido.");
			break;
			
		}
		
	}

}
