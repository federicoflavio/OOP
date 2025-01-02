package Übungsblatt3;

import java.util.Scanner;

public class Aufgabe4 {

	static double addition_5(double Summand1) {

		return Summand1 + 5;
	}

	static double subtraktion_2(double Subtrahent1) {

		return Subtrahent1 - 2;

	}

	static double division_2(double divident1) {

		return divident1 / 2;

	}

	static double multiplikation_3(double Multiplikator1) {

		return Multiplikator1 * 3;

	}

	static double quadratZahl(double zahl1) {

		return zahl1 * zahl1;

	}

	public static void main(String[] args) {

		try (Scanner eingabe = new Scanner(System.in)) {

			System.out.print("Bitte geben Sie eine Zahl ein:\n");
			double anfangsZahl = eingabe.nextInt();

			while (true) {

				if (anfangsZahl == 0) {

					System.out.println("Sie haben gewonnen!");
					break;

				}

				System.out.println("1 - +5");
				System.out.println("2 - -2");
				System.out.println("3 - /2");
				System.out.println("4 - *3");
				System.out.println("5 - x²");

				System.out.println("Rechenoperation: ");
				int gewählteOperation = eingabe.nextInt();

				switch (gewählteOperation) {

				case 1:
					anfangsZahl = addition_5(anfangsZahl);
					System.out.println(anfangsZahl);
					break;

				case 2:
					anfangsZahl = subtraktion_2(anfangsZahl);
					System.out.println(anfangsZahl);
					break;

				case 3:
					anfangsZahl = division_2(anfangsZahl);
					System.out.println(anfangsZahl);
					break;

				case 4:
					anfangsZahl = multiplikation_3(anfangsZahl);
					System.out.println(anfangsZahl);
					break;

				case 5:
					anfangsZahl = quadratZahl(anfangsZahl);
					System.out.println(anfangsZahl);
					break;

				default:
					System.out.println("Ungültige Eingabe! Bitte erneut angeben: ");

				}
			}

		}

	}

}
