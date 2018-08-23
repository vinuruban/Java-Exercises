
public class Vehicle {
	
	private int vehicleID;
	public String colour;
	public int weight;
	
	public void setvehicleID(int vehicleID) {
		this.vehicleID=vehicleID;
	}
	
	public void setcolour(String colour) {
		this.colour=colour;
	}
	
	public void setweight(int weight) {
		this.weight=weight;
	}
	
	public int getvehicleID() {
		return vehicleID;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public int getweight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", colour=" + colour + ", weight=" + weight + "]\n";
	}



	
}
