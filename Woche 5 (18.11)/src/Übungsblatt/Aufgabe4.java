package Übungsblatt;

import java.util.Scanner;

public class Aufgabe4 {

	static String eingabeWort(Scanner eingabe) {

		System.out.println("Wort (0 zum beenden): ");
		String gewaehltesWort = eingabe.nextLine();
		String gewaehltesWortFinal = gewaehltesWort.toLowerCase();

		return gewaehltesWortFinal;

	}

	static boolean palindromCheck(String gewaehltesWort) {

		char[] buchstabenListe = gewaehltesWort.toCharArray();

		char[] buchstabenListeGedreht = new char[gewaehltesWort.length()];

		for (int i = 0; i < gewaehltesWort.length(); i++) {

			buchstabenListeGedreht[i] = buchstabenListe[gewaehltesWort.length() - 1 - i];

		}

		for (int i = 0; i < gewaehltesWort.length(); i++) {

			if (buchstabenListe[i] != buchstabenListeGedreht[i]) {

				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		String gewaehltesWort = "";

		while (!gewaehltesWort.equals("0")) {

			gewaehltesWort = eingabeWort(eingabe);

			if (gewaehltesWort.equals("0")) {

				System.out.println("Programm wird beendet.");
				break;

			} else {

				boolean istWortPalindrom = palindromCheck(gewaehltesWort);

				if (istWortPalindrom) {

					System.out.println("Palindrom!");

				} else {

					System.out.println("Kein Palindrom!");

				}
			}

		}
	}

}
