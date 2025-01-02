package Übungsblatt;

import java.util.Scanner;

public class Aufgabe1 {

	static int offeneKlammerErkennen(String satz) {

		for (int i = 0; i < satz.length(); i++) {

			if (satz.charAt(i) == '(') {
				return i + 1;

			}

		}
		return -1;
	}

	static int geschlosseneKlammerErkennen(String satz, int startIndex) {

		for (int i = startIndex; i < satz.length(); i++) {

			if (satz.charAt(i) == ')') {
				return i;

			}

		}
		return -1;
	}

	static int klammerPositionÜberprüfen(int indexOffeneKlammer, int indexGeschlosseneKlammer) {

		if (indexGeschlosseneKlammer < indexOffeneKlammer) {

		}

		return 1;
	}

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		

		while (true) {

			System.out.println("String eingeben: ");
			String satz = eingabe.nextLine();
			
			int indexOffeneKlammer = offeneKlammerErkennen(satz);
			
			if (indexOffeneKlammer == -1) {

				System.out.println("Keine öffnende Klammer gefunden!");
				continue;

			} else {

				int indexGeschlosseneKlammer = geschlosseneKlammerErkennen(satz, indexOffeneKlammer);
				System.out.println(satz.substring(indexOffeneKlammer, indexGeschlosseneKlammer));

			}
			
			eingabe.close();
		}
		
	}
}



/*
 * 
 * Step 1: erste öffnende Klammer erkennen Step 2: erste schließende Klammer
 * erkennen Step 3: Indizes beider klammern speichern Step 4: String zwischen
 * den Indizes extrahieren Step 5: String ausgeben
 * 
 * 
 */