package Übungsblatt4;

import java.util.Scanner;

public class Aufgabe6 {

	static char verschlüsselung(char buchstabe, int n) {

		int neuerBuchstabe = buchstabe + n;

		return (char) neuerBuchstabe;

	}

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		System.out.println("Caesar Verschlüsselung - Wort:");
		String eingabeWort = eingabe.next();
		char[] wort = eingabeWort.toCharArray();

		System.out.println("Caesar Verschlüsselung - n:");
		int n = eingabe.nextInt();

		for (char buchstabe : wort) {
			System.out.print(verschlüsselung(buchstabe, n));

		eingabe.close();

		}

	}

}
