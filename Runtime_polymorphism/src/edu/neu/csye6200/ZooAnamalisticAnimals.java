package edu.neu.csye6200;

import java.util.ArrayList; 

import java.util.List;

public class ZooAnamalisticAnimals {
	private List<AnimalisticAPI> animals = new ArrayList<AnimalisticAPI>();
	
	public void addAnimals() {
	AnimalisticAPI lion = new Lion();
	AnimalisticAPI tiger = new Tiger();
	AnimalisticAPI cheetah = new Cheetah();
	add(lion);
	add(tiger);
	add(cheetah);
}
	/*
	 * add method to add objects to animals list
	 */
public void add(AnimalisticAPI animal) {
	this.animals.add(animal);
}

@Override
public String toString() {
	System.out.println(animals.size() + " objects in ZooAnamalisticAnimals class\n");
	for(AnimalisticAPI animal: animals) {
		animal.canFly();
		animal.eats();
	}
	return "For holding and showing animal objects derived from AnimalisticAPI\n";
}
}
