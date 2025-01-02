package Übungsblatt2;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {

		Scanner Eingabe = new Scanner(System.in);

		System.out.print("Startkapital:\n");
		double Kapital = Eingabe.nextDouble();

		System.out.print("Zinssatz in %:\n");
		double Zinssatz = Eingabe.nextDouble() / 100;

		System.out.print("Laufzeit:\n");
		int laufzeit = Eingabe.nextInt();

		double endkapital = Kapital;

		for (int i = 1; i <= laufzeit; i++) {

			endkapital = endkapital + (endkapital * Zinssatz);

			System.out.printf("Nach Jahr %d: %.2f Euro\n", i, endkapital);

		}

		System.out.printf("\nEndkapital nach %d Jahren: %.2f Euro\n", laufzeit, endkapital);
		Eingabe.close();

	}

}
