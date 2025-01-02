package Übungsblatt3;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		System.out.println("Euro-Betrag: ");
		double EuroBetrag = eingabe.nextDouble();

		double mehrwertSteuer = BerechnungMehrwertsteuer(EuroBetrag);
		double umrechnung = Währungsumrechnung(mehrwertSteuer);

		System.out.println("Betrag zuzüglich Mehrwertsteuer: " + mehrwertSteuer + " EURO");
		System.out.println("Betrag insgesamt: " + umrechnung + " USD");

		eingabe.close();

	}

	public static double BerechnungMehrwertsteuer(double EuroBetrag) {

		double mehrwertSteuer = EuroBetrag * 1.2;
		return mehrwertSteuer;
	}

	public static double Währungsumrechnung(double EuroBetrag) {

		double umrechnung = EuroBetrag * 1.0971;
		return umrechnung;
	}

}
