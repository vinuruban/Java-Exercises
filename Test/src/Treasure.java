
public class Treasure {

	
	private String treasureName;
	private int treasureLocX ;
	private int treasureLocY ;
	
	
	public Treasure(String treasureName, int treasureLocX, int treasureLocY) {
		this.treasureName = treasureName;
		this.treasureLocX = treasureLocX;
		this.treasureLocY = treasureLocY;
	}	
	
	
	public String getTreasureName() {
		return treasureName;
	}
	
	public void setTreasureName(String treasureName) {
		this.treasureName = treasureName;
	}

	public int getTreasureLocX() {
		return treasureLocX;
	}

	public void setTreasureLocX(int treasureLocX) {
		this.treasureLocX = treasureLocX;
	}

	public int getTreasureLocY() {
		return treasureLocY;
	}

	public void setTreasureLocY(int treasureLocy) {
		this.treasureLocY = treasureLocy;
	}


	

	
}
