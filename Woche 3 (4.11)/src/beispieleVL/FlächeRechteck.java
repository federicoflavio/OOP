package beispieleVL;

import java.util.Scanner;

public class FlächeRechteck {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		System.out.println("Zahl 1:");
		double zahl1 = eingabe.nextDouble();

		System.out.println("Zahl 2:");
		double zahl2 = eingabe.nextDouble();

		double y = flächeBerechnen(zahl1, zahl2);
		System.out.printf("Der Flächeninhalt beträgt %.2f Quadratmeter!", y);

		eingabe.close();
	}

	static double flächeBerechnen(double zahl1, double zahl2) {

		double y = zahl1 * zahl2;
		return y;
	}

}
