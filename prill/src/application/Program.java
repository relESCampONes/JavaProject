package application;

public class Program {
	
	static int i;

	public static void main(String[] args) {
		for (i = 0; i < 3; i++) {
			System.out.print(i);
		}
		
		for (int i = 2; i < 3; i++) {
			System.out.print(i);
		}
		
		int i;
		for (i = 0; i < 2; i++) {
			System.out.print(i);
		}
		
		System.out.print(Program.i);
//		System.out.println(i);
	}
	
}
