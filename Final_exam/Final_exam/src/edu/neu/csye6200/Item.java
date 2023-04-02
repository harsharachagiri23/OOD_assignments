package edu.neu.csye6200;

public class Item extends AbstractItemAPI {

	private int id;
	private String name;
	private double price;
	private String description;
	
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Item() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Item getObject(int id, String name, double price) {
		return new Item(id, name, price);
	}
	
	public abstract class AbstractFactoryAPI {
		
		public abstract class AbstractItemFactory extends AbstractFactoryAPI {
			// private instance, so that it can be
			  // accessed by only by getInstance() method
			  private static Item instance;
			 
			  private AbstractItemFactory()
			  {
			    // private constructor
			  }
			 
			  //method to return instance of class
			  public static Item getInstance()
			  {
			    if (instance == null)
			    {
			      // if instance is null, initialize
			      instance = new Item();
			    }
			    return instance;
			  }
			  
		}
		
	}
	
	@Override
	public String toString() {
		return "ItemAPI [ID=" + this.id + ", Item Price=" + this.price + ", Item Name=" + this.name + ", Item Description="
				+ this.description + "]";
	}
	
}