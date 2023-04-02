package edu.neu.csye6200;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericStack<T> {
	private T arr[];
	private int capacity;
	private int top;
	public GenericStack(Class<T> tclass, int size) {
		this.arr = (T[]) Array.newInstance(tclass, size);
		this.capacity = size;
		this.top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return (top == capacity - 1);
	}
	public void push(T item) {
		if (isFull()) {
		System.exit(1); 
		}
		System.out.println("Insert::" + item);
		arr[++top] = item;
	}
	public T pop() {
		if (isEmpty()) {
		System.exit(1); 
		}
		System.out.println("Remove::" + peek());
		return arr[top--];
	}
	public T peek() {
		if (!isEmpty()) {
		return arr[top];
		} 
		else {
		System.exit(1); // ERROR
		}
		return null;
	}

	@Override
	public String toString() {
		if(isEmpty()) {
			return "";
		}
		String a = "";
		for(int i=0; i<top; i++) {
			a = a + String.valueOf(arr[i]) + "->";
		}
		a = a + String.valueOf(arr[top]);
		return a;
	}
	
}
