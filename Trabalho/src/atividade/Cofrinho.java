package atividade;

import java.util.ArrayList;

public class Cofrinho {
	
	// criando um arraylist para armazenar as moedas
	private static ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// método para adicionar moeda
	public void adicionar(Moeda m) {
		listaMoedas.add(m);	
		System.out.println("Moeda adicionada!!!");
	}
	
	// método para remover moeda
	public void remover(Moeda m) {
		listaMoedas.remove(m);		
	}
	
	// método para listar todas as moedas armazenadas no cofrinho
	public void listagemMoedas() {
		if (listaMoedas.isEmpty()) {
			System.out.println("O Cofrinho está vazio!!!");
			return;
		}
		for(Moeda moedas : listaMoedas) {
			moedas.info();}
		}
	
	// método para converter as todas as moedas em reais
	public void totalConvertido() {
		if (listaMoedas.isEmpty()) {
			System.out.println("O Cofrinho está vazio!!!");
			return;
		}
		
		double total = 0;
		for(Moeda valores : listaMoedas) {
			total = total + valores.converter();
			
	}
		System.out.printf("Total convertido em Reais: %.2f\n",total);
	}
	
	
	
	
}
