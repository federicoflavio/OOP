package Übungsblatt2;
import java.util.Scanner;

public class Aufgabe3b {

	public static void main(String[] args) {
		
		Scanner Eingabe = new Scanner(System.in);
		
		System.out.println("Breite Quadrat angeben:");
		int i = Eingabe.nextInt();
		
		
		for (int z = 1; z <= i; z++) {
			
			for (int s = 1; s <= i; s++) {
				
				System.out.print("*");
				
			}
				
			System.out.println();
			
			}
		
		Eingabe.close();
					

	}

}
