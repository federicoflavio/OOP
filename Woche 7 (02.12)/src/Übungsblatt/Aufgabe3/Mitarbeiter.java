package Übungsblatt.Aufgabe3;

import java.util.ArrayList;

public class Mitarbeiter {

	private int persNr;
	private String name;
	private String vorname;
	

	public Mitarbeiter(int persNr, String name, String vorname) {

		super();

		this.persNr = persNr;
		this.name = name;
		this.vorname = vorname;
		
	}

	public String toString(Mitarbeiter mitarbeiter) {

		return "Mitarbeiter:\nVorname: " + vorname + "\nNachname: " + name + "\nPersonal-Nummer: " + persNr;

	}

}
