package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
	 List<Person> personRoster = new ArrayList<>();
	 List<Student> studentRoster = new ArrayList<>();
	
	public void run() {
		 Person Harsha = new Student(10001, "Harsha", "vardhani", 20, "Male", 2.8);
		 Person Yahu = new Student(10002, "Yahu", "Bieber", 22, "female", 2);
		 Person olivia = new Student(10003, "Olivia", "O'brien", 27, "Female", 3.7);
		 Person bruniya = new Student(10004, "Bruniya", "Mars", 28, "Male", 3.3);
		 Person edum = new Student(10005, "Edum", "Sheera", 32, "Female", 3.0);
		 
		 addPerson(Harsha);
		 addPerson(Yahu);
		 addPerson(olivia);
		 addPerson(bruniya);
		 addPerson(edum);
		 
		 Student taylor = new Student(11011, "Taylor", "Swift", 21, "Female", 3.2);
		 Student dora = new Student(11012, "Dora", "Lipa", 34, "Female", 3.8);
		 Student ratna = new Student(11013, "ratna", "Dominic", 23, "Female", 3.5);
		 Student charlie = new Student(11014, "Charlie", "Puth", 29, "Male", 4.0);
		 Student ariya = new Student(11015, "Ariya", "Grande", 30, "Female", 3.0);
		 
		 addStudent(taylor);
		 addStudent(dora);
		 addStudent(ratna);
		 addStudent(charlie);
		 addStudent(ariya);
		 
		 sortStudents();
		 sortPersons();
	}
	
	public void addPerson(Person person) {
		this.personRoster.add(person);
	}
	
	public void addStudent(Student student) {
		this.studentRoster.add(student);
	}
	
	public void sortStudents() {
		
		System.out.println("----------" + studentRoster.size() + " STUDENTS in the following collection: SORTED BY ID.----------");
		Collections.sort(studentRoster, Person::compareByID);
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n----------" + studentRoster.size() + " STUDENTS in the following collection: SORTED BY LAST NAME.----------");
		Collections.sort(studentRoster, Person::compareByLastName);
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n-----------" + studentRoster.size() + " STUDENTS in the following collection: SORTED BY AGE.----------");
		Collections.sort(studentRoster, Person::compareTo);
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n----------" + studentRoster.size() + " STUDENTS in the following collection: SORTED BY GPA.-----------");
		Collections.sort(studentRoster, Person::compareByGPA);
		studentRoster.forEach(System.out::println);
	}
	
	public void sortPersons() {
		
		System.out.println("\n------------" + personRoster.size() + " PERSONS in the following collection: SORTED BY ID.------------");
		Collections.sort(personRoster, Person::compareByID);
		personRoster.forEach(System.out::println);
		
		System.out.println("\n------------" + personRoster.size() + " PERSONS in the following collection: SORTED BY AGE.------------");
		Collections.sort(personRoster, null);
		personRoster.forEach(System.out::println);
		
		System.out.println("\n-----------" + personRoster.size() + " PERSONS in the following collection: SORTED BY LAST NAME.------------");
		Collections.sort(personRoster, Person::compareByLastName);
		personRoster.forEach(System.out::println);
		
		System.out.println("\n------------" + personRoster.size() + " PERSONS in the following collection: SORTED BY GPA.------------");
		Collections.sort(personRoster, Person::compareByGPA);
		personRoster.forEach(System.out::println);
	}
}
