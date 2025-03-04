package main;
import java.util.Scanner;

public class Desafio02 
{
	
	public static void main(String[]args) 
	{
		double pesoIdeal = 1.0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a sua altura em metros:  ");
		double altura = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Digite o seu sexo m para masculino e f para feminino:   ");
		String sexo = scanner.next();
		scanner.nextLine();
		
		
		if(!sexo.equals("m") && !sexo.equals("f")) 
		{
			System.out.println("Sexo invalido");
			pesoIdeal = 0;
			
		}
		
		else if(sexo.equals("m")) 
		{
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal é = " + pesoIdeal);
			
		}
		
		else if(sexo.equals("f")) 
		{
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal é = " + pesoIdeal);
			
		}
		
		
		scanner.close();
		
	}

}
