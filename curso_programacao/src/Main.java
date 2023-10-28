import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tipos primitivos em Java
		char letraA16Bits = '\u0061'; // '\u0000' a '\uFFFF'
		char letraATambem = 'a'; // Uma letra ou caracteres únicos como símbolos ou dígitos(0 a 65535)
		byte _8Bits = 127; // Cada bit pode armazenar 2 valores possíveis (0 ou 1), ou seja, duas possibilidades nesse caso 2**8 = 256 (-128 a 127)
		byte pato = 0xB;
		short _16Bits = 32767;
		int _32Bits = 2147483647;
		long _64Bits = 9223372036854775807l;
		float _32BitsDecimal = 23.4444445f;
		double _64BitsDecimal = 23.444444565676787878343434334d;
		boolean teste = true;
		System.out.printf("%s%n%s%n%d%n%d%n%d%n%d%n%d%n%f%n%.014f ou %e%n%s",letraA16Bits,letraATambem,_8Bits,pato,_16Bits,_32Bits,_64Bits,_32BitsDecimal,_64BitsDecimal,_64BitsDecimal,teste);
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.printf("%nDigite algo: ");
		x = sc.nextLine();
		System.out.printf("Você digitou: %s",x.toUpperCase());
		char z;
		System.out.printf("%nDigite um caractere: ");
		z = sc.next().charAt(0);
		System.out.printf("A primeira letra ou caracter é: %s",z);
		sc.close();
	}
	

}
