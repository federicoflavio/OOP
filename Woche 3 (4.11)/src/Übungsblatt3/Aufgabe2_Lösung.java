package Übungsblatt3;

import java.util.Scanner;

/**
 * Aufgabe 2 - Herr Schmidt moechte seine Kaufentscheidung fuer ein Auto, ob er
 * ein Auto mit Diesel- oder Benzinmotor anschaffen will, unter wirtschaftlichen
 * Gesichtspunkten treffen.
 * 
 * Folgende Bedingungen werden dazu angenommen:
 * 
 * Benzinfahrzeug: Anschaffungswert 25000 Euro, Steuer 125 Euro jaehrlich,
 * Benzinverbrauch 8,6l/100km.
 * 
 * Dieselfahrzeug: Anschaffungswert 28500 Euro, Steuer 310 Euro jaehrlich,
 * Dieselverbrauch 6,4l/100km.
 * 
 * Der Benzinpreis pro Liter sei 1,31 Euro und der Dieselpreis pro Liter mit
 * 1,12 Euro.
 * 
 * Erstellen Sie ein Programm, das die Kosten aus Anschaffung, aufsummierter
 * Steuer und aufsummiertem Spritverbrauch pro Auto ueber 6 Jahre darstellt,
 * wenn:
 * 
 * a) die jaehrliche Fahrleistung 17000 km
 * 
 * b) die jaehrliche Fahrleistung 25000 km
 * 
 * ...betraegt.
 * 
 * Die jaehrlichen Fahrleistungen sind waehrend der Programmausfuehrung von der
 * Tastatur einzulesen. Das Ergebnis der Auswertung soll in einer moeglichst
 * uebersichtlichen Ausgabeform dargestellt werden.
 * 
 * Setzen Sie bei der Programmierung moeglichst das Konzept der Methode ein!
 * 
 * Option: Die Loesung laesst sich weiter flexibilisieren, indem
 * Anschaffungswert, jaehrliche Steuer, Benzin/Dieselverbrauch ebenfalls
 * waehrend der Programmausfuehrung einzugeben sind.
 * 
 * Mit dieser Aufgabe soll gezeigt werden, welche komplexen Aufgabenstellungen
 * sich bereits nach dem ersten Kapitel der Vorlesung loesen lassen.
 */
public class Aufgabe2_Lösung {

    static double berechneSteuer(double jahressteuer, double jahre) {
        return jahressteuer * jahre;
    }

    static double berechneSpritkosten(double jahresfahrleistung, double verbrauch, double literpreis, double jahre) {
        return jahresfahrleistung * verbrauch * literpreis / 100 * jahre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Werte für Benzin-Auto
        double benzinPKWAnschaffungswert = 25000;
        double benzinPKWSteuer = 125;
        double benzinPKWVerbrauch = 8.6;

        // Werte für Diesel-Auto
        double dieselPKWAnschaffungswert = 28500;
        double dieselPKWSteuer = 310;
        double dieselPKWVerbrauch = 6.4;

        double benzinpreis = 1.31;
        double dieselpreis = 1.12;

        // Eingabe der Fahrleistung
        System.out.print("Bitte Fahrleistung/Jahr eingeben: ");
        double fahrleistung = sc.nextDouble();
        System.out.println();

        double benzinPKWGesamtkosten = 0.0;
        double dieselPKWGesamtkosten = 0.0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Jahr " + i + ": ");

            // Berechnung der Gesamtkosten Benzin-Auto in dem Jahr i
            benzinPKWGesamtkosten = benzinPKWAnschaffungswert + berechneSteuer(benzinPKWSteuer, i)
                    + berechneSpritkosten(fahrleistung, benzinPKWVerbrauch, benzinpreis, i);
            System.out.print("Benzin - Gesamt: " + benzinPKWGesamtkosten);
            System.out.print(" (Anschaffung: " + benzinPKWAnschaffungswert);
            System.out.print(", Steuer: " + berechneSteuer(benzinPKWSteuer, i));
            System.out.println(
                    ", Sprit: " + berechneSpritkosten(fahrleistung, benzinPKWVerbrauch, benzinpreis, i) + ")");

            // Berechnung der Gesamtkosten Diesel-Auto in dem Jahr i
            dieselPKWGesamtkosten = dieselPKWAnschaffungswert + berechneSteuer(dieselPKWSteuer, i)
                    + berechneSpritkosten(fahrleistung, dieselPKWVerbrauch, dieselpreis, i);
            System.out.print("Diesel - Gesamt: " + dieselPKWGesamtkosten);
            System.out.print(" (Anschaffung: " + dieselPKWAnschaffungswert + ", Steuer: "
                    + berechneSteuer(dieselPKWSteuer, i));
            System.out.println(
                    ", Sprit: " + berechneSpritkosten(fahrleistung, dieselPKWVerbrauch, dieselpreis, i) + ")");
        }
        System.out.println();
        System.out.println("Benzinfahrzeug Gesamtkosten: " + benzinPKWGesamtkosten);
        System.out.println("Dieselfahrzeug Gesamtkosten: " + dieselPKWGesamtkosten);
        sc.close();

    }
}
