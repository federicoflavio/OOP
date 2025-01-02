package Übungsblatt2;
import java.util.Scanner;

public class Aufgabe3a {

	public static void main(String[] args) {
		
		Scanner Eingabe = new Scanner(System.in);
		System.out.printf("Quadratzahl-Ausgabe (Bereich von 1 --> n)%nWähle n!:%n");
		int n = Eingabe.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.printf("%d:%d%n", i, i*i);
		
		Eingabe.close();	
		
		}
		
	}

}
