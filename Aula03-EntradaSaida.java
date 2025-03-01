package main;
import java.util.Scanner;

public class aula25 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int inteiro = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Digite um numero fracionado: ");
        double fracionado = scanner.nextDouble();
        
        double soma = inteiro + fracionado;
        
        double resultado = soma * inteiro;
        
        scanner.close();
        
        System.out.printf("O resultado foi: %.2f", resultado);
    }
}
