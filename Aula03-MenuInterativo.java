package main;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NomesLista {
	
	public static void main(String[]args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		int opcao;
		
		do 
		{
			System.out.println("-----MENU-----");
			System.out.println("1 - ADD NOME");
			System.out.println("2 - LISTA NOME");
			System.out.println("3 - REMOVER NOME");
			System.out.println("4 - SAIR");
			System.out.println("ESCOLHA UMA OPÇÃO");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) 
			{
				case 1:
					System.out.println("Digite o nome que deseja adicionar: ");
					String nomeAdicionar = scanner.nextLine();
					nomes.add(nomeAdicionar);
					System.out.println("Sucesso!");
					break;
					
				case 2:
					if (nomes.isEmpty()) 
					{
						System.out.println("Não tem ninguém cadastrado.");
					}
					
					else 
					{
						System.out.println("Lista de nomes: ");
						for (int i = 0; i < nomes.size(); i++) 
						{
							System.out.println((i + 1) + " " + nomes.get(i));
							
						}
					}
					break;
					
				case 3:
					if (nomes.isEmpty()) 
					{
						System.out.println("Não tem nomes para remover.");
					}
					
					else 
					{
						System.out.println("Digite o nome que deseja remover: ");
						String nomeRemover = scanner.nextLine();
						
						if(nomes.remove(nomeRemover)) 
						{
							System.out.println("Nome removido com sucesso.");
						}
						
						else 
						{
							System.out.println("Nome não encontrado.");
						}
					}
					break;
					
				case 4:
					System.out.println("Saindo do programa.");
					break;
					
				default:
					System.out.println("Opção invalida.");
			}

		}
		
		while(opcao != 4);
		
		scanner.close();
		
		
	}

}
