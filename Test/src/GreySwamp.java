// What I wanted to do: Once importing the p1 (me) and t1 (treasure), i wanted to use the initial location of p1 and display 
// the distance away from the treasure. I wanted to create 4 methods (using getter and setter); to change the coordinates of the p1,  
// back i couldn't try that after the pc crashed.
// From t1, i wanted to extract the coordinates of the treasure (1,5) and implement that in the loop. 
// to calculate the distance, i initially planned to apply parathagos' theorem, but couldnt execute it.





import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class GreySwamp {
	
	static ArrayList<Player> playerList = new ArrayList<Player>(); 
	static ArrayList<Treasure> treasureList = new ArrayList<Treasure>(); 
	
	public static void main(String[] args) {
		
		GreySwamp gs = new GreySwamp();
		
		Player p1 = new Player(1, "Vinu", 0, 0);
		gs.addPlayer(p1);
		
		Treasure t1 = new Treasure("GoldenPot", 1, 5);
		gs.addTreasure(t1);
		

		System.out.println(gs.location(1,5));
		System.out.println(gs.location(1,0));
		System.out.println(gs.location(6,5));
		System.out.println(gs.location(p1.getStartPointX(),p1.getStartPointY()));

	}
	
	public void addPlayer(Player pl) {
		playerList.add(pl);
	}
	
	public void addTreasure(Treasure tr) {
		treasureList.add(tr);
	}
	
	public String location(int a, int b) { 
		String msg = null;
			if (a==1 && b==5) { // i manually added the coordinates of the treasure
				msg = "You see a box sitting on the plain. Its filled with treasure!  You win!  The end.​";
			}
			else if (a!=1 && b==5) { 
				msg = "You're there yet. Go North or South for " + (1-a) + "m";
			}
			else if (a==1 && b!=5) { 
				msg = "You're there yet. Go West or East for " + (5-b) + "m";
			}
			else
				msg = "You're there yet. You're " + (1-a) + "m in the X-direction and " + (5-b) + "m in the Y-direction";
			return msg;
			
		}
}
