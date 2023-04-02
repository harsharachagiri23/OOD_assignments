package edu.neu.csye6200;

public class Demo {
	public static void run() {
		System.out.println("Implement Queue with primitive datatype");
		Queue q = new Queue(5);
		q.enqueue(1); 
		q.enqueue(2); 
		q.enqueue(3); 
		System.out.println("First member: " + q.peek());
		q.dequeue();
		System.out.println("First member: " + q.peek());
		System.out.println("Queue size" + q.size());
		q.dequeue();
		q.dequeue();
		if ( q.isEmpty() )
		     System.out.println("Queue Is Null");
		else
		     System.out.println("Queue Is not Null");
		System.out.println("Implement Stack with primitive datatype");
		Stack s = new Stack(5);
		s.push(1); 
		s.push(2); 
		s.pop(); 
		s.pop(); 
		s.push(2);
		System.out.println("Top element is: " + s.peek());
		System.out.println("Stack size is " + s.size());
		s.pop(); 
		if ( s.isEmpty() )
		     System.out.println("Stack Is Null");
		else
		     System.out.println("Stack Is not Null");
		
		System.out.println("Implement Queue with Generic type");
		GenericQueue queue = new GenericQueue(String.class, 5);
		queue.enqueue("Harsha"); 
		queue.enqueue("Rahul"); 
		queue.enqueue("Herika"); 
		System.out.println("First member: " + queue.peek());
		queue.dequeue();
		System.out.println("First member: " + queue.peek());
		System.out.println("Queue size" + queue.size());
		queue.dequeue();
		queue.dequeue();
		if ( queue.isEmpty() )
		     System.out.println("Queue Is Null");
		else
		     System.out.println("Queue Is not Null");
		
		System.out.println("Implement Stack with Generic datatype");
		GenericStack stack = new GenericStack(String.class, 5);
		stack.push("Esabella"); 
		stack.push("Laura"); 
		System.out.println("Stack after member insertion: " + stack);
		stack.pop(); 
		stack.pop(); 
		stack.push("Yolo"); 
		System.out.println("Top member: " + stack.peek());
		stack.pop();
		if ( stack.isEmpty() )
		     System.out.println("Stack Is Null");
		else
		     System.out.println("Stack Is not Null");
	}
	
}
