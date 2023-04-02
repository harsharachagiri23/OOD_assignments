package edu.neu.csye6200;

public class Student extends Person{
private double gpa;

public Student(long person_id, String first_name, String last_name, int age, String gender, double gpa) {
	super(person_id, first_name, last_name, age, gender);
	this.gpa = gpa;
}


public double getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}


@Override
public String toString() {
	return "Student [Person ID =" + super.getPerson_id() + ", First Name = " + super.getFirst_name() + ", Last Name = " + super.getLast_name()  + 
			 ", GPA = " + gpa + ", Age = " + super.getAge() + "]";
}
}
