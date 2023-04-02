package edu.neu.csye6200;

public class Parrot extends AbstractAnimalAPI{
 
	@Override
	public void canFly() {
		System.out.println("Parrot says, I can fly\n");
	}
	
	public void eats() {
		System.out.println("Parrot eats all kinds of food\n");
	}
}
