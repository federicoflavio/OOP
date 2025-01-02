package Übungsblatt3;

import java.util.Scanner;

public class Aufgabe3 {

	static double Holzbox1(double Grundfläche, double Höhe) {

		return Grundfläche * Höhe;

	}

	static double Holzbox2(double Länge, double Breite, double Höhe) {

		return Länge * Breite * Höhe;

	}

	static double Holzbox3(double durchmesser, double Höhe) {

		return 3.1416 * (durchmesser / 2) * (durchmesser / 2) * Höhe;

	}

	public static void main(String[] args) {

		try (Scanner eingabe = new Scanner(System.in)) {
			
			System.out.print("Anzahl Boxen:\n");
			int anzahlBoxen = eingabe.nextInt();

			for (; anzahlBoxen > 0; anzahlBoxen--) {

				System.out.println("Wähle Box:");
				int auswahlBox = eingabe.nextInt();

				switch (auswahlBox) {

				case 1:

					System.out.print("Gewählte Box 1:\nHöhe angeben: ");
					double höhe1 = eingabe.nextDouble();
					Holzbox1(1000, höhe1);
					break;

				case 2:

					System.out.print("Gewählte Box 2:\nLänge angeben: ");
					double länge2 = eingabe.nextDouble();

					System.out.println("Breite angeben: ");
					double breite2 = eingabe.nextDouble();

					System.out.println("Höhe angeben: ");
					double höhe2 = eingabe.nextDouble();

					Holzbox2(länge2, breite2, höhe2);
					break;

				case 3:

					System.out.println("Gewählte Box 3:\nDurchmesser angeben: ");
					double durchmesser3 = eingabe.nextDouble();

					System.out.println("Höhe angeben: ");
					double höhe3 = eingabe.nextDouble();

					Holzbox3(durchmesser3, höhe3);
					break;

				default:
					System.out.println("Ungültige Eingabe!");

				}

			}

			eingabe.close();
		}
	}

}
