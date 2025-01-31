package Übungsblatt.Aufgabe2;

public class Truck {

	protected static int nextTruckID = 0;

	protected int truckID;
	protected String bezeichnung;
	protected String kennZeichen;
	protected double ladeVolumen;

	public Truck(String bezeichnung, String kennZeichen, double ladeVolumen) {

		super();

		this.truckID = nextTruckID++;
		this.bezeichnung = bezeichnung;
		this.kennZeichen = kennZeichen;
		this.ladeVolumen = ladeVolumen;

	}

	public double getLadeVolumen() {

		return this.ladeVolumen;
	}

}
