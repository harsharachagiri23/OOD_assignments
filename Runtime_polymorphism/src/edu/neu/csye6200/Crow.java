package edu.neu.csye6200;

public class Crow extends AbstractAnimalAPI{

	@Override
	public void canFly() {
		System.out.println("Crow says, I can fly\n");
	}
	
	public void eats() {
		System.out.println("Crow eats all kinds of food\n");
	}
}
