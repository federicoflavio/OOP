package Übungsblatt;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		String nutzerZahl = umwandlungEinstelligeZahl(eingabeSpieler(eingabe));
		String rndmZahl = umwandlungEinstelligeZahl("5");
		
		System.out.println("Lotterie-Zahl: " + rndmZahl);
		System.out.println(errechnungPreisgeld(perfectGuessCheck(nutzerZahl, rndmZahl), closeGuessCheck(nutzerZahl, rndmZahl), luckyLoserCheck(nutzerZahl, rndmZahl)));
		
		eingabe.close();
	}

	// generiert eine zufällige Zahl
	static String rndmZahlGenerieren() {

		int rndmZahl = (int) (Math.random() * 100);
		String rndmZahlFinal = Integer.toString(rndmZahl);

		return rndmZahlFinal;

	}

	// ermöglicht Eingabe der Zahl
	static String eingabeSpieler(Scanner eingabe) {

		System.out.println("Zahl (1-100): ");
		String gewaehlteZahl = eingabe.nextLine();

		return gewaehlteZahl;
	}
	
	// führende 0 
	static String umwandlungEinstelligeZahl(String umwandlungZahl) {
		
		char[] ziffernListe = umwandlungZahl.toCharArray();												
		
		if (ziffernListe.length < 2) {
			
			String korrigierteZahl = "0" + umwandlungZahl;
			return korrigierteZahl;
		}
		return umwandlungZahl;
		
	}

// Überprüfung der Win-Conditions

	// 1. hat der Nutzer die Lotteriezahl genau erraten?
	static boolean perfectGuessCheck(String gewaehlteZahl, String rndmZahl) {

		if (gewaehlteZahl.equals(rndmZahl)) {
			return true;
		}
		return false;
	}

	// 2. entsprechen die Ziffern der Nutzer-Zahl genau den Ziffern der
	// Lotteriezahl?
	static boolean closeGuessCheck(String gewaehlteZahl, String rndmZahl) {

		char[] gewaehlteZahlZiffern = gewaehlteZahl.toCharArray();
		char[] rndmZahlZiffern = rndmZahl.toCharArray();

		if (gewaehlteZahlZiffern[0] == rndmZahlZiffern[1]) {

			if (gewaehlteZahlZiffern[1] == rndmZahlZiffern[0]) {

				return true;
			}
		}

		return false;
	}

	// 3. mindestens eine Ziffer der Nutzerzahl in Lotterie-Zahl
	static boolean luckyLoserCheck(String gewaehlteZahl, String rndmZahl) {

		char[] gewaehlteZahlZiffern = gewaehlteZahl.toCharArray();
		char[] rndmZahlZiffern = rndmZahl.toCharArray();

		for (int i = 0; i < gewaehlteZahlZiffern.length; i++) {

			char zifferEingabe = gewaehlteZahlZiffern[i];
			for (int j = 0; j < rndmZahlZiffern.length; j++) {

				if (zifferEingabe == rndmZahlZiffern[j]) {
					return true;
				}

			}

		}
		return false;
	}

	// Errechnung des Preisgelds
	static String errechnungPreisgeld(boolean perfectGuessCheck, boolean closeGuessCheck, boolean luckyLoserCheck) {

		if (perfectGuessCheck) {

			return "10k gewonnen!";
		}

		if (closeGuessCheck) {

			return "3k gewonnen!";
		}

		if (luckyLoserCheck) {

			return "1k gewonnen!";
		}

		return "Leider nichts gewonnen!";

	}

}
