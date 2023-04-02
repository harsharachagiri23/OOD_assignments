package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;
public class ZooAbstractAnimals {
	private List<AbstractAnimalAPI> animals = new ArrayList<>();
	
	public void addAnimals() {
		AbstractAnimalAPI parrot = new Parrot();
		AbstractAnimalAPI eagle = new Eagle();
		AbstractAnimalAPI crow = new Crow();
		add(parrot);
		add(eagle);
		add(crow);
	}
	/*
	 * add method to add objects to animals list
	 */
	public void add(AbstractAnimalAPI animal) {
		this.animals.add(animal);
	}

	@Override
	public String toString() {
		System.out.println(animals.size() + "  animal objects in ZooAbstractAnimals class\n");
		for(AbstractAnimalAPI animal: animals) {
			animal.canFly();
			animal.eats();
		}
		return " For holding and showing animal objects derived from AbstractAnimalAPI\n";
	}
}

