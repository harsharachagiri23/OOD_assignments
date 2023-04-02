package edu.neu.csye6200;

public class Duck extends AnimalAPI {
	
	@Override
	public void canFly() {
		System.out.println("Duck says, I can't fly\n");
	}
	
	public void eats() {
		System.out.println("Duck eats all kinds of sea food\n");
	}
	

}
