package Übungsblatt.Aufgabe1;

public class Hemd {

	private int hemdID;
	private String beschreibung;
	private char farbCode;
	private double preis;
	private int mengeAufLager;

	public Hemd(int hemdID, String beschreibung, char farbCode, double preis, int mengeAufLager) {

		super();
		this.hemdID = hemdID;
		this.beschreibung = beschreibung;
		this.farbCode = farbCode;
		this.preis = preis;
		this.mengeAufLager = mengeAufLager;

	}

	public int getID() {
		return hemdID;
	}

	public String getLook() {
		return beschreibung;
	}

	public String getColour() {

		switch (farbCode) {

			case 'r':
				return "red";

			case 'g':
				return "green";

			case 'b':
				return "blue";

			default:
				return "none";

		}

	}

	public double getPrice() {
		return preis;
	}

	public int getStock() {
		return mengeAufLager;
	}
	
	public void printInformation() {
		
		System.out.println("Hemd-ID: " + this.getID());
		System.out.println("Beschreibung: " + this.getLook());
		System.out.println("Farb-Code : " + this.getColour());
		System.out.println("Preis: " + this.getPrice());
		System.out.println("Lagerbestand: " + this.getStock());
		
	}

}
