package Übungsblatt4;

import java.util.Scanner;

public class Aufgabe7 {

	static double[] rechnungenEingeben(double[] rechnungsposten) {

		Scanner eingabe = new Scanner(System.in);

		for (int i = 0; i < rechnungsposten.length; i++) {

			System.out.println("Rechnungsposten " + (i + 1) + "/" + rechnungsposten.length + " eingeben");
			rechnungsposten[i] = eingabe.nextDouble();

		}

		eingabe.close();
		return rechnungsposten;
	}

	static double gesamtBetragErmitteln(double[] rechnungsposten) {

		double summe = 0;
		for (int i = 0; i < rechnungsposten.length; i++) {

			summe = summe + rechnungsposten[i];

		}

		return summe;
	}

	static void ohneSteuernAusgeben(double gesamtBetrag, double[] rechnungsposten) {

		double STEUER = 0.19;

		for (int i = 0; i < rechnungsposten.length; i++) {

			System.out.println((i + 1) + ". steuerfreier Rechnungsposten: " + rechnungsposten[i] * (1 - STEUER));
			

		}

		System.out.println("steuerfreier Gesamtbetrag: " + (gesamtBetrag * (1-STEUER)));
	}

	public static void main(String[] args) {

		// Einlesen der Anzahl der Rechnungsposten
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Anzahl der Rechnungsposten ein");
		int anzahlRechnungsposten = scan.nextInt();
		double[] rechnungsposten = new double[anzahlRechnungsposten];

		// Einlesen der Rechnungsposten
		rechnungsposten = rechnungenEingeben(rechnungsposten);

		// Gesamtbetrag der Rechnung
		double gesamtbetrag = gesamtBetragErmitteln(rechnungsposten);
		System.out.println("Der Gesamtbetrag ist: " + gesamtbetrag + "€");

		// Abzug der Steuern für jeden Rechnungsposten
		ohneSteuernAusgeben(gesamtbetrag, rechnungsposten);
		scan.close();

	}

}
