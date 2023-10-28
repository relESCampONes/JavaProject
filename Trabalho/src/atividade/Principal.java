package atividade;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho(); // criando um objeto e instanciando
		Scanner printar = new Scanner(System.in); // instanciando objeto da classe Scanner para receber entrada do usuário
		int opcaoMenu = 1;
		// criando um loop do menu principal do cofrinho
		while (opcaoMenu != 0) { 
			System.out.println("\nCOFRINHO:\n"
					+ "1-Adicionar Moeda\n"
					+ "2-Remover Moeda\n"
					+ "3-Listar Moedas\n"
					+ "4-Calcular total convertido para Real\n"
					+ "0-Encerrar");
			opcaoMenu = printar.nextInt(); // armazenando no atributo a opção escolhida
			// Criando um switch com as opções do menu
			switch(opcaoMenu) {
			
			case 1:
				int cont = 0;
				// criando um loop com a opção de moeda para adicionar
				while(cont>3 || cont<=0) {
					System.out.println("Escolha a Moeda:\n"
							+ "1-Real\n"
							+ "2-Dolar\n"
							+ "3-Euro");
					cont = printar.nextInt();
					} 
					// condicionais para adição de valor
					if (cont == 1) {
						System.out.println("Digite o valor desejado: ");
						// criando novo objeto com valor digitado pelo usuário e adicionando a lista de moedas
						cofrinho.adicionar(new Real(printar.nextDouble()));
					
					}
					else if (cont == 2) {
						System.out.println("Digite o valor desejado: ");
						cofrinho.adicionar(new Dolar((printar.nextDouble())));
					}
					else if (cont == 3) {
						System.out.println("Digite o valor desejado: ");
						cofrinho.adicionar(new Euro((printar.nextDouble())));
					}
			
					break;
			case 2:
				cont = 0;
				// criando um loop com a opção de moeda para remover
				while(cont>3 || cont<=0) {
					System.out.println("Escolha a Moeda:\n"
							+ "1-Real\n"
							+ "2-Dolar\n"
							+ "3-Euro");
					cont = printar.nextInt();}
				System.out.println("Digite o valor que deseja remover: ");
				// condicionais para remoção de valor
				if (cont == 1) {
					// removendo valor específico pelo usuário
					cofrinho.remover(new Real(printar.nextDouble()));
				}
				else if (cont == 2) {
					cofrinho.remover(new Dolar(printar.nextDouble()));
				}
				else if (cont == 3) {
					cofrinho.remover(new Euro(printar.nextDouble()));
				}
			
				break;
			case 3:
				// listar as moedas armazenadas no cofrinho
				cofrinho.listagemMoedas();
				break;
			case 4:
				// somando todas as moedas no cofrinho e convertendo em reais
				cofrinho.totalConvertido();
				break;
			case 0:
				// encerra o sistema
				System.out.println("Sistema Encerrado!!!");
				break;
			default:
				System.out.println("Opção inválida!!!");
										
		}	
		}
		
	printar.close(); // fechando o scanner
	}

}
