
public class Paint {
	
	
	private String name;
	private double price;
	private int litres;
	private int coverage;
	
	
	public Paint(String name, double price, int litres, int coverage) {
		this.name = name;
		this.price = price;
		this.litres = litres;
		this.coverage = coverage;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getLitres() {
		return litres;
	}
	public void setLitres(int litres) {
		this.litres = litres;
	}
	public int getCoverage() {
		return coverage;
	}
	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	
}
