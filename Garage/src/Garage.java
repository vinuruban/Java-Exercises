import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	
	static ArrayList<Vehicle> vehicleList = new ArrayList<>(); //we want to import all the people created in an array. Note that PEOPLE is plural because the array will carry a list of each person

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage gar = new Garage();
		
		Car c1 = new Car();
		Car c2 = new Car();
		Plane p1 = new Plane();
		Bicycle b1 = new Bicycle();
		
		c1.setvehicleID(1);
		c1.setmake("BMW");
		c1.setcolour("Grey");
		c1.setweight(1000);
		
		c2.setvehicleID(2);
		c2.setmake("Audi");
		c2.setcolour("Blue");
		c2.setweight(800);
		
		p1.setvehicleID(3);
		p1.setcolour("white");
		p1.setweight(10000);
		
		b1.setvehicleID(4);
		b1.setcolour("red");
		b1.setweight(5000);
		
		
		gar.addVeh(c1);
		gar.addVeh(c2);
		gar.addVeh(p1);
		gar.addVeh(b1);
		
		
		
		gar.removeVeh(c2); //(c2.getvehicleID()); < if you wanna remove my ID, do this and add a loop in the method, USE SEARCHFORID LOOP FOR HELP


		System.out.println(vehicleList.toString()); //this should print out the array, but only after defining toString (see outside/below the main)

		gar.emptyGar();		
		
		System.out.println(gar.searchForID(1));
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Name?");
		String name = scan.nextLine();
		
		System.out.println("hey babes, say my name" + name);
				
		
	}
	
	public void addVeh(Vehicle veh) {
		vehicleList.add(veh);
	}
		
	public void removeVeh(Vehicle veh) {
		vehicleList.remove(veh);
	}
	
	public void emptyGar() {
		vehicleList.removeAll(vehicleList);
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
	
//	public void bill(ArrayList<Vehicle> veh) {
//		for (int i=0; i<veh.size(); i++) {
//			veh.get(i).
//		}               //REMEMBER WHAT KARUN SAID. THINK LOGICALLY!
	

	
	

}
