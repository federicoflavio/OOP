package Übungsblatt;

import java.util.Scanner;

public class Aufgabe3 {

	static String eingabeNutzername(Scanner eingabe) {

		System.out.println("Nutzername: ");
		String eingegebenerNutzername = eingabe.nextLine();

		return eingegebenerNutzername;
	}

	static boolean istBenutzerBekannt(String eingegebenerNutzername) {

		String gespeicherterUser = "flavio";
		if (eingegebenerNutzername.equals(gespeicherterUser)) {

			return true;
		} else {

			return false;

		}
	}

	static String eingabePasswort(Scanner eingabe) {

		System.out.println("Passwort: ");
		String gewähltesPasswort = eingabe.next();

		return gewähltesPasswort;
	}

	static char[] buchstabenListeErstellen(String gewaehltesPasswort) {

		char[] buchstabenListe = new char[gewaehltesPasswort.length()];

		for (int i = 0; i < gewaehltesPasswort.length(); i++) {

			buchstabenListe[i] = gewaehltesPasswort.charAt(i);

		}

		return buchstabenListe;
	}

	static boolean passwortCheckMindestlaenge(String gewaehltesPasswort) {

		if (gewaehltesPasswort.length() >= 8) {

			return true;

		} else {

			return false;

		}
	}

	static boolean passwortCheckGrossbuchstabeUndZahl(String gewaehltesPasswort, char[] buchstabenListe) {

		for (int i = 0; i < gewaehltesPasswort.length(); i++) {

			buchstabenListe[i] = gewaehltesPasswort.charAt(i);

			if (Character.isUpperCase(buchstabenListe[i])) {

				return true;

			}

		}

		return false;

	}

	static boolean passwortCheckGrBuchstabeUndSonderzeichen(char[] buchstabenListe) {

		for (char buchstabe : buchstabenListe) {

			if (Character.isUpperCase(buchstabenListe[0]) || !Character.isLetterOrDigit(buchstabe)) {

				return true;
			}

		}
		return false;
	}

	static String ausgabeSicherheitslevel(String gewaehltesPasswort, char[] buchstabenListe) {

		boolean hatMindestlaenge = passwortCheckMindestlaenge(gewaehltesPasswort);
		boolean hatGrBuUndZahl =  passwortCheckGrossbuchstabeUndZahl(gewaehltesPasswort, buchstabenListe);
		boolean hatGrBuAmAnfangUndSonderzeichen = passwortCheckGrBuchstabeUndSonderzeichen(buchstabenListe);
		
		if (hatMindestlaenge && hatGrBuUndZahl && hatGrBuAmAnfangUndSonderzeichen) {
			
			return "Sicherheitslevel: ***";
		}
		
		if (hatMindestlaenge && hatGrBuUndZahl) {
			
			return "Sicherheitslevel: **";
		}
		
		if (hatMindestlaenge) {
			
			return "Sicherheitslevel: *";
		}
		
		else {
			
			return "Sicherheitslevel: 0";
		}
		
	}

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		boolean nutzerAkzeptiert = false;

		while (!nutzerAkzeptiert) {

			String gewaehlterNutzername = eingabeNutzername(eingabe);

			if (istBenutzerBekannt(gewaehlterNutzername)) {

				nutzerAkzeptiert = true;
				System.out.println("Herzlich Willkommen, " + gewaehlterNutzername + "!");

				boolean passwortAkzeptiert = false;

				while (!passwortAkzeptiert) {

					String gewaehltesPasswort = eingabePasswort(eingabe);
					char[] buchstabenListe = buchstabenListeErstellen(gewaehltesPasswort);

					if (passwortCheckMindestlaenge(gewaehltesPasswort)) {

						System.out.println("Gültiges Passwort!");
						System.out.println(ausgabeSicherheitslevel(gewaehltesPasswort, buchstabenListe));
						passwortAkzeptiert = true;

					} else {

						System.out.println("Passwort ungültig! Muss min. 8 Zeichen lang sein!");

					}

				}

			} else {

				System.out.println("User unbekannt!");

			}

		}

	}

}

/*
 * 
 * Step 1: benutzer hinterlegt?
 * 
 * Step 2: wenn hinterlegt, Eingabe eines neuen Passworts
 * 
 * Step 3: Passwort wird nur akzeptiert, wenn mind. 8 Zeichen lang ist
 * 
 * Step 4: Annahme des Passworts
 * 
 * Step 5: Ausgabe Sicherheitslevel 1 als Stern
 * 
 * Step 6: wenn ungültig --> Ausgabe Meldung & erneute Eingabeaufforderung
 */