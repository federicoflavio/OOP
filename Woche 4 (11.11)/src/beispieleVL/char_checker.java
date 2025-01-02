package beispieleVL;

import java.util.Scanner;

public class char_checker {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		while (true) {

			System.out.println("Zeichen eingeben (0 - Beende Programm): ");
			char zeichen = eingabe.nextLine().charAt(0);

			if (zeichen == '0') {

				System.out.println("Programm wird beendet...");
				break;

			}

			if (Character.isLetter(zeichen)) {

				System.out.println("Es wurde ein Buchstabe eingegeben!");

			}

			if (Character.isDigit(zeichen)) {

				System.out.println("Es wurde eine Ziffer eingegeben!");

			}

		}
		eingabe.close();
	}

}
