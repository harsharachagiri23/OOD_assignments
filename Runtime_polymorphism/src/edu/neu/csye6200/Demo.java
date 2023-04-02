package edu.neu.csye6200;

public class Demo {
      public static void run() {
    	ZooAnimals zooAnimals = new ZooAnimals();
  		zooAnimals.addAnimals();
  		System.out.println(zooAnimals.toString());
  		
  		ZooAbstractAnimals abstractAnimals = new ZooAbstractAnimals();
  		abstractAnimals.addAnimals();
  		System.out.println(abstractAnimals.toString());
  		
  		ZooAnamalisticAnimals animals = new ZooAnamalisticAnimals();
  		animals.addAnimals();
  		System.out.println(animals.toString());
      }
}
