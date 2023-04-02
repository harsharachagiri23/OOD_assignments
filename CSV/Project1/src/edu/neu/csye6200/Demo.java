package edu.neu.csye6200;

import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void run() {
		Teacher teacher = new Teacher(20, 45, "Anupam", "Agarwal", "Kishore", "Agarwal", 20);
		System.out.println("Teacher: " + teacher);
		Student student = new Student();
		student.createStudentCSVFile();
		List<Student> students = student.createStudentObjects();
		System.out.println("\nStudent objects created: \n");
		for(Student item: students) {
			System.out.println(item);
		}
		
		System.out.println("\n----------" + students.size() + " STUDENTS in the following collection: SORTED BY ID.----------");
		Collections.sort(students, Student::compareTo);
		students.forEach(System.out::println);
		
		System.out.println("\n-----------" + students.size() + " STUDENTS in the following collection: SORTED BY STUDENT ID.----------");
		Collections.sort(students, Student::compareByStudentId);
		students.forEach(System.out::println);
		
		System.out.println("\n----------" + students.size() + " STUDENTS in the following collection: SORTED BY FIRST NAME.----------");
		Collections.sort(students, Student::compareByFirstName);
		students.forEach(System.out::println);
	
		System.out.println("\n----------" + students.size() + " STUDENTS in the following collection: SORTED BY LAST NAME.----------");
		Collections.sort(students, Student::compareByLastName);
		students.forEach(System.out::println);
	
		System.out.println("\n----------" + students.size() + " STUDENTS in the following collection: SORTED BY GPA.-----------");
		Collections.sort(students, Student::compareByGPA);
		students.forEach(System.out::println);
	}
}
