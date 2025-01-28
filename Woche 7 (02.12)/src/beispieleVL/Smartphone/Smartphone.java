package beispieleVL.Smartphone;

public class Smartphone {

	private double screenSize;
	private String colour;
	private int batteryCharge;
	
	public Smartphone(double screenSize, String colour, int batteryCharge) {
		
		super();
		
		this.screenSize = screenSize;
		this.colour = colour;
		this.batteryCharge = batteryCharge;
		
	}
	
	public int getBatteryCharge() {
		
		return this.batteryCharge;
	}
	
	public void setBatteryCharge(int chargeAmount) {
		
		this.batteryCharge = chargeAmount;
	}
	
	public void chargePhone(int chargeAmount) {
		
		this.batteryCharge += chargeAmount;
	}
	
	public void currentBatteryCharge() {
		
		System.out.println(this.batteryCharge);
	}
}
