package atividade;

//import java.util.Objects;
// classe mãe
public abstract class Moeda {

	double valor;

	public abstract void info();

	public abstract double converter();

	// criando método equals para verificação do objeto
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
}