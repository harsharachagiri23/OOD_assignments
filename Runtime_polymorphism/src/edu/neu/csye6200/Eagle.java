package edu.neu.csye6200;

public class Eagle extends AbstractAnimalAPI{

	@Override
	public void canFly() {
		System.out.println("Eagle says, I can fly\n");
	}
	
	public void eats() {
		System.out.println("Eagle eats all kinds of food\n");
	}
}
