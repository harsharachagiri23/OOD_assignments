package edu.neu.csye6200;

public class Item {
	private int itemId;
	private String itemName;
	private int quantity;
	private double price;
	
	public Item(int itemId, String itemName, int quantity, double price) {
		this.itemId=itemId ;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price; 
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void demo() {
		System.out.println("I am inside static method");
		
		Item itemcookie = new Item(1,"chocolatecookie", 2, 3.00);
		Item itemmocha = new Item(2, "hot mocha", 1, 2.34);
		Item itemmuffin = new Item(3,"blueberry muffin", 1, 4.00);
		
    Item[] arrayList = {itemcookie,itemmocha,itemmuffin};
    // iterating over an array
   Cart myCart = new Cart(20,0,0 );
   System.out.println("*******Shopping bill*********\n ");
   
   System.out.println("Using pass by reference");
    
    for (int i = 0; i < arrayList.length; i++) {
    	// Cart myCart = new Cart(20,0,0 );
    	
    	  System.out.println("");
    	  Item x =  arrayList[i];
    	  double remainChange = myCart.Checkout(myCart, x);
    	  System.out.println("Change remaining after pass by reference:" + " " + remainChange + "\n");
    	  
    	
    	}
    Cart myCart1 = new Cart(20,0 ,0);
    for (int i = 0; i < arrayList.length; i++) {
    	// Cart myCart = new Cart(20,0,0 );
    	  Item x =  arrayList[i];
    	  myCart1.sillyCheckout(20.0, x.getPrice(),0.0, 0.0);
    	  System.out.println("Change remaining after pass by value:" + " " + myCart1.getMyChange()+ "\n");
    }
    
//	Cart myCart = new Cart(20,0,0 );
//	double remainChange = myCart.Checkout(myCart, itemmuffin);
	//System.out.println(remainChange);

//	
//	Cart myCart1 = new Cart(20,0 ,0);
//	myCart1.sillyCheckout(20.0, itemmocha.getPrice(),0,0);
//    System.out.println(myCart1.getMyChange());	
	
		}
	


}

