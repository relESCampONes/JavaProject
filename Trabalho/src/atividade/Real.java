package atividade;
// classe filha
public class Real extends Moeda {
		
	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override
	// retorna informações dos valores
	public void info() {
		System.out.printf("\nReal: %.2f",this.valor);
	}
	
	@Override
	// retorna o próprio valor do real
	public double converter() {
		return this.valor;
		
		
	}
	

}
