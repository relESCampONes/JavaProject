package entities;

class NormalException extends Exception{}

class EspecialException extends RuntimeException{}

public class Carro {
	
	public void metodo() throws NormalException{
		throw new NormalException();
	}
	
	public static void main(String args[]) {
		int a, b, c, d;
		a = b = c = d = 0;
		
		try {
			new Carro().metodo();
			a++;
		}catch (NormalException e) {
			b++;
		}catch (EspecialException e) {
			c++;
		}finally {
			d++;
		}
		System.out.println(a + ',' + b + ',' + c + ',' + d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
