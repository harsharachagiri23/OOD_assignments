package edu.neu.csye6200;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericQueue<T> {
	private T arr[];
	private int capacity;
	private int front;
	private int rear;
	private int count;
	public GenericQueue(Class<T> tclass, int size) {
		arr = (T[]) Array.newInstance(tclass, size);
		capacity = size; 
		front = 0;
		rear = -1;
		count = 0; 
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
	public void enqueue(T item) {
		if (isFull()) {
			System.exit(1); 
		}
		System.out.println("Insert " + item);
		this.rear = (this.rear + 1) % capacity; 
		this.arr[rear] = item;
		count++;
	}

	public T dequeue() {
		if (isEmpty()) {
		System.exit(1); 
		}
		T e = arr[front];
		System.out.println("Remove " + e);
		front = (front + 1) % capacity; 
		count--;
		return e;
	}
	public T peek() {
		if (isEmpty()) {
			System.exit(1); 
		}
		return arr[front];
	}
	@Override
	public String toString() {
		if(isEmpty()) {
			return "";
		}
		String a = "";
		for(int i=rear; i<front; i++) {
			a = a + String.valueOf(arr[i]) + "->";
		}
		a = a + String.valueOf(arr[front]);
		return a;
	}
}
