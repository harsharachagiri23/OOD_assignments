package edu.neu.csye6200;

public class Queue {
private int array[];
private int capacity;
private int front;
private int rear;
private int count;
public Queue(int size) {
	super();
	this.array = new int[size];
	this.capacity = size;
	this.front = 0;
	this.rear = -1;
	this.count = 0;
}

public int size() {
	return count;
}

public boolean isEmpty() {
	return (size() == 0);
}

public boolean isFull() {
	return (size() == capacity);
}

public void enqueue(int item) {
if (isFull()) {
	System.exit(1); 
}
System.out.println("Adding " + item);
rear = (rear + 1) % capacity; 
array[rear] = item;
count++;
}

public int dequeue() {
	if (isEmpty()) {
		System.exit(1); 
		}
		int e = array[front];
		System.out.println("Removing " + e);
		front = (front + 1) % capacity; 
		count--;
		return e;
}
public int peek() {
if (isEmpty()) {
	System.exit(1); 
}
return array[front];
}
}
