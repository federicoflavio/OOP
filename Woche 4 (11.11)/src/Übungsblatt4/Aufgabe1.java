package Übungsblatt4;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		double[] kontoStand = new double[6];

		for (int i = 0; i <= 5; i++) {

			System.out.println("Geben sie den " + (i + 1) + ". Kontostand an: ");
			kontoStand[i] = eingabe.nextDouble();

		}
		
		System.out.println("Alle Kontostände:\n");
		for (int i = 0; i <= 5; i++) {

			System.out.println("Kontostand Konto " + (i + 1) + ": " + kontoStand[i]);

		}

		System.out.println("\nZusätzliche Abfragen:\n");
		System.out.println("Kontostand Konto " + (3) + ": " + kontoStand[2]);
		System.out.println("Kontostand Konto " + (5) + ": " + kontoStand[4]);

		eingabe.close();
	}

}
