package atividade;
// classe filha
public class Euro extends Moeda {

	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	// retorna informações dos valores
	public void info() {
		System.out.printf("\nEuro: %.2f",this.valor);
	}
	
	@Override
	// converte o euro para real
	public double converter() {
		return this.valor*5.40;
		
		
	}
	
	
}
