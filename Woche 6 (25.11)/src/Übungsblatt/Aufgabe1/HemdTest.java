package Übungsblatt.Aufgabe1;

public class HemdTest {

	public static void main(String[] args) {

		Hemd myHemd = new Hemd(5, "schoen", 'b', 10, 20000);

		displayInformation(myHemd);
	}

	public static void displayInformation(Hemd myHemd) {
		myHemd.printInformation();

	}

}
