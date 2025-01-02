package Übungsblatt4;

import java.util.Scanner;

public class Aufgabe2und3 {

//	Methode, um Minimum zu errechnen
	static double minimumErrechnen(double Zahl1, double Zahl2, double Zahl3, double Zahl4, double Zahl5) {

		double kleinsterWert = Zahl1;

		if (Zahl2 < kleinsterWert) {
			kleinsterWert = Zahl2;
		}

		if (Zahl3 < kleinsterWert) {
			kleinsterWert = Zahl3;
		}

		if (Zahl4 < kleinsterWert) {
			kleinsterWert = Zahl4;
		}

		if (Zahl5 < kleinsterWert) {
			kleinsterWert = Zahl5;
		}

		return kleinsterWert;

	}

//	Methode, um Maximum zu errechnen
	static double maximumErrechnen(double Zahl1, double Zahl2, double Zahl3, double Zahl4, double Zahl5) {

		double grössterWert = Zahl1;

		if (Zahl2 > grössterWert) {
			grössterWert = Zahl2;
		}

		if (Zahl3 > grössterWert) {
			grössterWert = Zahl3;
		}

		if (Zahl4 > grössterWert) {
			grössterWert = Zahl4;
		}

		if (Zahl5 > grössterWert) {
			grössterWert = Zahl5;
		}

		return grössterWert;

	}

//	Methode um Durchschnitt zu errechnen
	static double durchschnittErrechnen(double Zahl1, double Zahl2, double Zahl3, double Zahl4, double Zahl5) {

		double schnitt = (Zahl1 + Zahl2 + Zahl3 + Zahl4 + Zahl5) / 5;

		return schnitt;

	}

	public static void main(String[] args) {

// 		Initialisierung Scanner & Erstellung Array
		Scanner eingabe = new Scanner(System.in);
		double[] aktienKurse = new double[5];

//		Eingabe der Aktienkurse & Speicherung im Array
		for (int i = 0; i < aktienKurse.length; i++) {

			System.out.println("Kurs zum " + (i + 1) + ". Zeitpunkt angeben: ");
			aktienKurse[i] = eingabe.nextDouble();

		}

//		Ausgabe der eingelesenen Aktienkurse
		System.out.println("Folgende Aktienkurse wurden eingelesen: ");
		for (int i = 0; i < aktienKurse.length; i++) {

			System.out.println(aktienKurse[i]);

		}

//		Ausgabe Minimum, Maximum & Durchschnitt
		double minimum = minimumErrechnen(aktienKurse[0], aktienKurse[1], aktienKurse[2], aktienKurse[3],
				aktienKurse[4]);
		double maximum = maximumErrechnen(aktienKurse[0], aktienKurse[1], aktienKurse[2], aktienKurse[3],
				aktienKurse[4]);
		double durchschnitt = durchschnittErrechnen(aktienKurse[0], aktienKurse[1], aktienKurse[2], aktienKurse[3],
				aktienKurse[4]);

		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		System.out.println("Durchschnitt: " + durchschnitt);

		eingabe.close();
	}

}
