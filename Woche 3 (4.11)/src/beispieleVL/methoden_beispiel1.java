package beispieleVL;

public class methoden_beispiel1 {

	public static void main(String[] args) {
		
		String name = "Mustermann";
		int age = 21;
		hello(name,age);
		

	}
	
	static void hello(String name, int age) {
		
		System.out.println("Hallo " + name);
		System.out.println("You are " + age);
		
	}

}
