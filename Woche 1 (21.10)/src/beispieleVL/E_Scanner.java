package beispieleVL;

import java.util.Scanner;

public class E_Scanner {

	public static void main(String[] args) {

		Scanner KBM = new Scanner(System.in);

		System.out.printf("Tippe Zahl ein:%n");
		int input = KBM.nextInt();
		
		System.out.printf("Ihre Zahl lautet: %n%d", input);
		
		KBM.close();
		}

}
