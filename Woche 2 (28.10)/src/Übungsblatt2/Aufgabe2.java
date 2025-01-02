package Übungsblatt2;
import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		Scanner KBM = new Scanner(System.in);
		System.out.printf("Wie viele Jahre arbeiten Sie schon bei uns?%n");
		int Zdauer = KBM.nextInt();
		
		
		switch(Zdauer) {
		
		case 0,1: System.out.println("Ihr Urlaubsanspruch beläuft sich auf 15 Tage!");
		break;
		
		case 2,3: System.out.println("Ihr Urlaubsanspruch beläuft sich auf 20 Tage!");
		break;
		
		case 4,5: System.out.println("Ihr Urlaubsanspruch beläuft sich auf 25 Tage!");
		break;
		
		default: 
			
			if (Zdauer >= 6) {
				
				System.out.println("Ihr Urlaubsanspruch beläuft sich auf 30 Tage!");
				
			}				
		
		}
		
		KBM.close();
	
	}

}
