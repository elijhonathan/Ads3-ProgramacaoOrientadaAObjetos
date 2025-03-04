package main;
import java.util.Scanner;

public class Exercicio01 
{
	
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos, meses e dias. ");
		
		System.out.println("Digite o numero de anos: ");
		int anos = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o numero de meses: ");
		int meses = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o numero de dias: ");
		int dias = scanner.nextInt();
		scanner.nextLine();
		
		
		int anosDias = anos * 365;
		
		int mesesDias = meses * 30;
		
		int totalDias = anosDias + mesesDias + dias;
		
		scanner.close();
		
		
		System.out.println("De " + anos + " anos, " + meses + " meses e " + dias + " dias = " + totalDias + " dias."  );
		
	}

}
