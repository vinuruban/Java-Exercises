
public class Player {
	
	
	private int playerID;
	private String name;
	private int startPointX;
	private int startPointY;
	
	
	public Player(int playerID, String name, int startPointX, int startPointY) {
		this.playerID = playerID;
		this.name = name;
		this.startPointX = startPointX;
		this.startPointY = startPointY;
	}	
	
	
	public int getPlayerID() {
		return playerID;
	}


	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStartPointX() {
		return startPointX;
	}


	public void setStartPointX(int startPointX) {
		this.startPointX = startPointX;
	}


	public int getStartPointY() {
		return startPointY;
	}


	public void setStartPointY(int startPointY) {
		this.startPointY = startPointY;
	}

	
}
