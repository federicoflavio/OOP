package Übungsblatt.Aufgabe3;

public class KundeTest {

	public static void main(String[] args) {
		
		Kunde dodig = new Kunde("dodig", "dodig@dogig.dodig");
		Kunde sinner = new Kunde("sinner", "sinner@sinner.sinner");
		Kunde dodig2 = new Kunde("dodig", "dodig@dogig.dodig");
		
		System.out.println(sinner);
		
		System.out.println(dodig.equals(dodig));
		
		System.out.println(dodig.equals(dodig2));
		
		
	}


}

