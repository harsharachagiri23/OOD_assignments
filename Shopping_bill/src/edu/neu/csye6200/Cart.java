package edu.neu.csye6200;

public class Cart {
	private int myCash;
	private int myTotal;
	private int myChange;
	
	public Cart(int myCash, int myTotal, int myChange) {
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}

	public int getMyCash() {
		return myCash;
	}

	public void setMyCash(int myCash) {
		this.myCash = myCash;
	}

	public int getMyTotal() {
		return myTotal;
	}

	public void setMyTotal(int myTotal) {
		this.myTotal = myTotal;
	}

	public int getMyChange() {
		return myChange;
	}

	public void setMyChange(int myChange) {
		this.myChange = myChange;
	}
	
	public void sillyCheckout(double cash, double price, double total, double change) {
		total = total + price;
		change = cash - total;
		
	}
	
	public double Checkout(Cart myCart, Item myItem){
		int total = (int)myItem.getPrice()+ myCart.myTotal;
		myCart.setMyTotal(total);
		int change = myCart.myCash - total;
		myCart.setMyChange(change);
			return change;
	
	}
	



@Override
public String toString() {
	return "Cart myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]"; 
	}
}



	
