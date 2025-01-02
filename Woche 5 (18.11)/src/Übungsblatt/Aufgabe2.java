package Übungsblatt;

import java.util.Scanner;

public class Aufgabe2 {

	static double[] kontostandEinlesen() {

		Scanner eingabe = new Scanner(System.in);
		double[] kontostaende = new double[7];

		for (int i = 0; i < kontostaende.length; i++) {

			System.out.println((i + 1) + ".Kontostand: ");
			kontostaende[i] = eingabe.nextDouble();

		}
		eingabe.close();
		return kontostaende;

	}

	static int[] umrechnungSterne(double alleKontostaende[]) {

		int[] mengeSterne = new int[alleKontostaende.length];

		for (int i = 0; i < alleKontostaende.length; i++) {

			mengeSterne[i] = (int) (Math.floor(alleKontostaende[i]) / 10);
		}

		return mengeSterne;

	}

	static String[] sternenAusgabe(int umgerechneteSterne[]) {

		String[] sterneListe = new String[umgerechneteSterne.length];

		for (int i = 0; i < umgerechneteSterne.length; i++) {

			String aktuellerString = "";
			String stern = "*";

			for (int x = 0; x < umgerechneteSterne[i]; x++) {

				aktuellerString = aktuellerString.concat(stern);

			}

			sterneListe[i] = aktuellerString;

		}
		return sterneListe;
	}

	public static void main(String[] args) {

		double listeKontostaende[] = kontostandEinlesen();
		int umgerechneteSterne[] = umrechnungSterne(listeKontostaende);
		String sterneListe[] = sternenAusgabe(umgerechneteSterne);

		for (int i = 0; i < listeKontostaende.length; i++) {

			System.out.println((i + 1) + ".Kontostand: " + sterneListe[i]);

		}

	}

}
