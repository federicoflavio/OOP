package beispieleVL;

import java.util.Scanner;

public class quadratzahlen {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		int[] quadratzahlen = new int[11];

		for (int i = 0; i < quadratzahlen.length; i++) {

			quadratzahlen[i] = i * i;

		}

		while (true) {

			System.out.println("Quadrat einer Zahl von 1-10 (0 - Programm beenden): ");
			int zahl = eingabe.nextInt();

			if (zahl >= 1 && zahl <= 10) {

				System.out.println("Das Quadrat der Zahl " + zahl + " ist: " + quadratzahlen[zahl]);
			}

			if (zahl == 0) {

				System.out.println("Programm wird beendet!");
				break;
			}

		}

		eingabe.close();
	}

}
