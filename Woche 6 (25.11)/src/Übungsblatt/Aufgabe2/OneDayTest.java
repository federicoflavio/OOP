package Übungsblatt.Aufgabe2;

public class OneDayTest {

	public static void main(String[] args) {
		
		OneDay day = new OneDay(10, 2002, "messi");
		
		System.out.println(day.getTag());
		System.out.println(day.getMonat());
		System.out.println(day.getJahr());
		
		day.displayDate();
	}

}
