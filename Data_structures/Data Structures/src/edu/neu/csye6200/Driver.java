package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println(Driver.class.toString()+".main()...");
		Demo.run();
		System.out.println(Driver.class.toString()+".main()...done");
	}

}
// OUTPUT
/*  class edu.neu.csye6200.Driver.main()...
Implement Queue with primitive datatype
Adding 1
Adding 2
Adding 3
First member: 1
Removing 1
First member: 2
Queue size2
Removing 2
Removing 3
Queue Is Null
Implement Stack with primitive datatype
Inserting 1
Inserting 2
Removing 2
Removing 1
Inserting 2
Top element is: 2
Stack size is 1
Removing 2
Stack Is Null
Implement Queue with Generic type
Insert Harsha
Insert Rahul
Insert Herika
First member: Harsha
Remove Harsha
First member: Rahul
Queue size2
Remove Rahul
Remove Herika
Queue Is Null
Implement Stack with Generic datatype
Insert::Esabella
Insert::Laura
Stack after member insertion: Esabella->Laura
Remove::Laura
Remove::Esabella
Insert::Yolo
Top member: Yolo
Remove::Yolo
Stack Is Null
class edu.neu.csye6200.Driver.main()...done
 */