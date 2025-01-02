package Übungsblatt2;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {

		Scanner Eingabe = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Kontostand:");
			double Kontostand = Eingabe.nextInt();
			double Unterschreitung = 100 - Kontostand;

			if (Kontostand >= 100) {

				System.out.printf("Der Betrag in Höhe von %.2f Euro wurde eingelesen!\n", Kontostand);
				
			} else if (Kontostand <= 100) {
				
				System.out.printf("Eingabe-Fehler! - Unterschreitung um %.2f Euro\n", Unterschreitung);
			}
			
		Eingabe.close();	
		}
	}

}
