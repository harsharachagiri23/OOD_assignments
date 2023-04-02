package edu.neu.csye6200;

import java.util.ArrayList;

import java.util.List;

public class ZooAnimals {
	private List<AnimalAPI> animals = new ArrayList<AnimalAPI>();
	
	public void addAnimals() {
	AnimalAPI duck = new Duck();
	AnimalAPI turtle = new Turtle();
	AnimalAPI shark = new Shark();
	add(duck);
	add(turtle);
	add(shark);
}
	/*
	 * add method to add objects to animals list
	 */
public void add(AnimalAPI animal) {
	this.animals.add(animal);
}

@Override
public String toString() {
	System.out.println(animals.size() + "  animals objects in ZooAnimals class\n");
	for(AnimalAPI animal: animals) {
		animal.canFly();
		animal.eats();
	}
	return "For holding and showing animal objects derived from AnimalAPI\n";
}

}
