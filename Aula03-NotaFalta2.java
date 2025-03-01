package main;
import java.util.Scanner;

public class App2 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();
		
		System.out.print("Digite a presença do aluno: ");
		double presenca = scanner.nextDouble();
		
		if(nota >= 70 && presenca >= 75) 
		{
			System.out.print("Aprovado");
		}
		
		else if(nota >= 70 && presenca < 75 ) 
		{
			System.out.print("Reprovado por falta");
		}
		
		else if(nota < 70 && nota > 40 && presenca >= 75) 
		{
			System.out.print("Recuperação");
		}
		
		else 
		{
			System.out.print("Reprovado por nota");
		}
			
		scanner.close();
		
	}
}
