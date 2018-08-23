import java.util.ArrayList;

public class VehicleManager {

	private ArrayList<Vehicle> vehicleList = new ArrayList<>();

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public String searchForID(int search) {
		for (Vehicle p : vehicleList) {
			if (p.getvehicleID()==search) { // getvehicleID().get(search) for STRINGGGGGGGGGGGGGGGGG
				return "Found the vehicle";
			}
			else
				return "Not found";
		}
		
	return null;
	}
}
