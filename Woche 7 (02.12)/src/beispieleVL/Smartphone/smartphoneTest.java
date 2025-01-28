package beispieleVL.Smartphone;

public class smartphoneTest {

	public static void main(String[] args) {
		
		Smartphone iphone = new Smartphone(6.12, "black", 60);
		
		iphone.chargePhone(10);
		
		iphone.currentBatteryCharge();

	}

}
