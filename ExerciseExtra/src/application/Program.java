package application;

public class Program {

	public static void main(String[] args) {

		int n = 65;

		int inicio = 0;
		int fim = 0;
		int intervalo = 10;
		int times = n / intervalo;
		int resto = n % intervalo;

		for (int i = 0; i < n; i += intervalo) {
			inicio = i + 1;
			fim += intervalo;
			if (inicio + intervalo > n) {
				inicio = i + 1;
				fim = n;
			}
			System.out.printf("%d, %d\n", inicio, fim);

		}

	}

}
