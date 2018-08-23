
public class Car extends Vehicle {

	private String make;
	
	public void setmake(String make) {
		this.make=make;
	}
	

	public String getmake() {
		return make;
		
		
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", vehicleID=" + getvehicleID() + ", colour=" + colour + ", weight=" + weight + "]\n";
	}












	
	
	
}
