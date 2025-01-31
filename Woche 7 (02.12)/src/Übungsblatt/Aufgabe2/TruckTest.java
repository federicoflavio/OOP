package Übungsblatt.Aufgabe2;

import java.util.ArrayList;

public class TruckTest {

	public static void main(String[] args) {

		ArrayList<Truck> truckList = new ArrayList<>();

		Truck truck1 = new Truck("Mercedes Actros", "B-AB 1234", 25.5);
		Truck truck2 = new Truck("MAN TGX", "M-MA 5678", 30.0);
		Truck truck3 = new Truck("Volvo FH", "HH-VF 4321", 28.7);
		Truck truck4 = new Truck("Scania R500", "S-SC 9876", 32.2);
		Truck truck5 = new Truck("DAF XF", "D-DA 6543", 27.8);

		truckList.add(truck1);
		truckList.add(truck2);
		truckList.add(truck3);
		truckList.add(truck4);
		truckList.add(truck5);

		Truck truck6 = new Truck("Volvo BE1", "OF - FV 106", 18.3);
		Truck truck7 = new Truck("DAF X", "F - SJ 182", 22.7);

		truckList.add(truck6);
		truckList.add(truck7);

		System.out.println("Gesamtanzahl der Trucks: " + truckList.size());

		double maxLadeVolumen = 0;
		Truck maxTruck = null;

		for (Truck truck : truckList) {

			if (truck.getLadeVolumen() > maxLadeVolumen) {

				maxLadeVolumen = truck.getLadeVolumen();
				maxTruck = truck;
			}
		}

		System.out.println(maxTruck.getLadeVolumen());

	}

}
