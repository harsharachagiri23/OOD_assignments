package neu.edu.csye6200;

public class ItemAPI {
	
	private int id;
	private double itemPrice;
	private String itemName;
	private String itemDescription;
	
	public ItemAPI() {
		super();
	}
	
	public ItemAPI(int id, double price, String name, String description) {
		super();
		this.id = id;
		this.itemPrice = price;
		this.itemName = name;
		this.itemDescription = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "ItemAPI [ID=" + this.id + ", Item Price=" + this.itemPrice + ", Item Name=" + this.itemName + ", Item Description="
				+ this.itemDescription + "]";
	}
	
}
