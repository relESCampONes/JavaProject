
public class ProgramString {

	public static void main(String[] args) {
		String textEnter = "thE VampirE DiarieS       ";
		String s0 = "potato apple lemon";
		String s1 = textEnter.toLowerCase();
		String s2 = textEnter.toUpperCase();
		String s3 = textEnter.trim(); // retirar espaços em branco após a última string 
		String s4 = textEnter.substring(2); // exibe a partir da posição 2
		String s5 = textEnter.substring(2, 8); // exibe entre a posição 2 e 8
		String s6 = textEnter.replace("a", "u");
		int i = textEnter.indexOf("Va"); // posição da primeira ocorrência
		int j = textEnter.lastIndexOf("E"); // posição da última ocorrência
		
		String [] vect = s0.split(" "); // desmembrando uma string por espaço e armazenando numa lista
		System.out.println("Original: -" + textEnter + "-");
		System.out.println("toLowerCase: -" + s1 + "-");
		System.out.println("toUpperCase: -" + s2 + "-");
		System.out.println("trim: -" + s3 + "-");
		System.out.println("substring(2): -" + s4 + "-");
		System.out.println("substring(2,8): -" + s5 + "-");
		System.out.println("replace('a','u'); -" + s6 + "-");
		System.out.println("indexOf('Va'): -" + i + "-");
		System.out.println("lastIndexOf('E'): -" + j + "-");
		System.out.printf("Lista separada por split(' '): %n%s%n%s%n%s",vect[0],vect[1],vect[2]); 
		
	}

}
