package atividade;
// classe filha
public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		this.valor = valor;
	}
	
	@Override
	// retorna informações dos valores
	public void info() {
		System.out.printf("\nDolar: %.2f",this.valor);
	}
	
	@Override
	// converte o dolar para real
	public double converter() {
		return this.valor * 4.80;
		
		
	}
	
}
