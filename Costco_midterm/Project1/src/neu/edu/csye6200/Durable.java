package neu.edu.csye6200;

public class Durable extends ItemAPI{
	
	private double weight;
	private String units;

	public Durable() {
		super();

	}
	
	public Durable(int serialNumber, double price, String name, String description) {
		super(serialNumber, price, name, description);
	}

	public Durable(int serialNumber, double price, String name, String description, double weight, String units) {
		super(serialNumber, price, name, description);
		this.weight = weight;
		this.units = units;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Durable [weight=" + weight + ", units=" + units + ", getId()=" + getId()
				+ ", getItemPrice()=" + getItemPrice() + ", getItemName()=" + getItemName() + ", getItemDescription()=" + getItemDescription()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}

