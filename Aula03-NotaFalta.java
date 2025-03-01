package main;
import java.util.Scanner;

public class App 
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
		
		else 
		{
			System.out.print("Reprovado");
		}
		
		scanner.close();
		
	}
}
