package car;
public class Car {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	private static int count = 1;
	
	public Car() {
			color = "White";
			horsePower = 250;
			engineSize = 4.0;
			make = "Toyota";
			
	}
	
	public Car(String color, int horesPower, double engineSize, String make) {
			this.color = color;
			this.horsePower = horsePower;
			this.engineSize = engineSize;
			this.make = make;
			count++;
	}
	public static int getCount() {
		return count;
	
}
	public void setColor(String color) {
		this.color = color;
		
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
		
	}
	public void setMake(String make) {
		this.make = make;
		
	}
	public String getColor() {
		return color;
	
	}
	public int getHorsePower() {
		return horsePower;
		
	}
	public double getEngineSize() {
		return engineSize;
		
	}
	public String getMake() {
		return make;
		
	}
	
	public boolean equals(Car obj) {
		boolean status=false;
		status = this.getColor().equals(obj.getColor()) && this.getEngineSize() ==obj.getEngineSize() && this.horsePower == (obj.getHorsePower()) && this.make.equals(obj.getMake());
		return status;
	}
	
	@Override
	public String toString() {
		return  "Make: " + make + " " + "Color: " + color + " " + "Engine Size: " + engineSize + " " + "Horse Power: " + horsePower;
		
	}
}
