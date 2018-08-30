import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Runner {

	private ArrayList<Paint> paintList = new ArrayList<>();
	private ArrayList<Room> roomList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner r = new Runner();
		
		Paint p1 = new Paint("CheapoMax",19.00,20,10);
		r.paintList.add(p1);
		Paint p2 = new Paint("AverageJoes",17.99,15,11);
		r.paintList.add(p2);
		Paint p3 = new Paint("DuluxourousPaints",25.00,10,20);
		r.paintList.add(p3);
		
		Room r1 = new Room(1,21);
		r.roomList.add(r1);
		
		Room r2 = new Room(2,10);
		r.roomList.add(r2);
		
//		System.out.println(r.bestPaint(1));
//		System.out.println(r.bestPaint(2));		


		Scanner s = new Scanner(System.in);
		System.out.println("What is the Room ID?");
		int nmd = s.nextInt();
		System.out.println(r.bestPaint(nmd));


		
	}
	
	public int bestPaint(int no) {
		int result = 10000; 
		int checker=0; 
		for (Room r : roomList) {	
					if (r.getRoomid()==no) {
						for (Paint p : paintList) {											
								checker = r.getCoverage()-p.getCoverage();
								if (checker >= 0 && checker < result ) { // THIS CHECKS WITH PREVIOUS DIFFERENCE AND ONLY  REPLACES IF THE VALUE IS SMALLER
									result=checker;
								}
						}
					}
		}
		return result;		
	}
	

	

	
	
//	public String bestPaint(int no) {
//		String plc=null;
//		for (Room r : roomList) {
//				for (Paint p : paintList) {
//					if (r.getRoomid()==no) {
//						if (p.getCoverage()==r.getCoverage()) {
//							plc = p.getName();
//							break;
//						}
//						
//					}
//				}
////			
//		}
//		return plc;		
//	}

}
