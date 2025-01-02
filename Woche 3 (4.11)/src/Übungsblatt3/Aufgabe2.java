package Übungsblatt3;

import java.util.Scanner;

public class Aufgabe2 {

	static double berechneSteuer(double jahres_steuer, double jahre) {
		return jahres_steuer * jahre;
	}

	static double berechneSpritkosten(double laufleistung, double verbrauch, double spritpreis, double jahre) {
		return laufleistung * verbrauch * spritpreis * jahre;
	}

	public static void main(String[] args) {

		double Anschaffungswert_Benziner = 25000;
		double Steuer_Benziner = 125;
		double Verbrauch_Benziner = 8.6 / 100;

		double Anschaffungswert_Diesel = 28500;
		double Steuer_Diesel = 310;
		double Verbrauch_Diesel = 6.4 / 100;

		double benzinpreis = 1.31;
		double dieselpreis = 1.12;

		double gesamtKostenBenzin = 0.0;
		double gesamtKostenDiesel = 0.0;

		Scanner eingabe = new Scanner(System.in);

		System.out.println("Jährliche Laufleistung: ");
		double laufleistung = eingabe.nextDouble();

		for (int jahr = 1; jahr <= 6; jahr++) {

			System.out.println("Jahr " + jahr + ": ");

			gesamtKostenBenzin = Anschaffungswert_Benziner + berechneSteuer(Steuer_Benziner, jahr)
					+ berechneSpritkosten(laufleistung, Verbrauch_Benziner, benzinpreis, jahr);
			
			gesamtKostenDiesel = Anschaffungswert_Diesel + berechneSteuer(Steuer_Diesel, jahr)
					+ berechneSpritkosten(laufleistung, Verbrauch_Diesel, dieselpreis, jahr);

			System.out.printf("Benziner - Gesamt: %.2f (Anschaffung: %.2f, Steuer: %.2f, Sprit: %.2f)\n", gesamtKostenBenzin,
					Anschaffungswert_Benziner, berechneSteuer(Steuer_Benziner, jahr),
					berechneSpritkosten(laufleistung, Verbrauch_Benziner, benzinpreis, jahr));
			
			System.out.printf("Diesel - Gesamt: %.2f (Anschaffung: %.2f, Steuer: %.2f, Sprit: %.2f)\n", gesamtKostenDiesel,
					Anschaffungswert_Diesel, berechneSteuer(Steuer_Diesel, jahr),
					berechneSpritkosten(laufleistung, Verbrauch_Diesel, dieselpreis, jahr));

			
			
		eingabe.close();

		}
		
		System.out.printf("\nBenzinfahrzeug Gesamtkosten: %.2f", gesamtKostenBenzin);
		System.out.printf("\nDieselfahrzeug Gesamtkosten: %.2f", gesamtKostenDiesel);

	}

}
