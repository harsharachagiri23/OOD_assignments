package edu.neu.csye6200;


public class Teacher extends Person{
private double hourlyWage;

public Teacher(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
		double hourlyWage) {
	super(id, age, firstName, lastName, parentFirstName, parentLastName);
	this.hourlyWage = hourlyWage;
}

public Teacher() {
	super();
}

public double getHourlyWage() {
	return hourlyWage;
}

public void setHourlyWage(double hourlyWage) {
	this.hourlyWage = hourlyWage;
}

@Override
public String toString() {
	return "Teacher [ID= " + super.getId() + ", First Name= " + super.getFirstName() + ", Last Name= " + super.getLastName()
			+ ", Age= " + super.getAge() + ", Hourly wage= $" + this.hourlyWage
			+ "]";
}

}
