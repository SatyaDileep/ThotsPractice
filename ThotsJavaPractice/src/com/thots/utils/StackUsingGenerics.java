package com.thots.utils;

class MyGenericStack<T extends Object> {
	private int sizeOfStack;
	private int top;
	private T[] ourStack;

	@SuppressWarnings("unchecked")
	public MyGenericStack(int size) {
		this.sizeOfStack = size;
		this.top = -1;
		this.ourStack = (T[]) new Object[size];
	}

	public void push(T entry) {
		// check for overflow
		if (isStackFull()) {
			System.out.println("Stack is full..! let's increase the size..");
			increaseStackSize(2);
		}
		this.ourStack[++top] = entry;
		System.out.println("Added " + entry);
	}

	public T peek() {
		return isStackEmpty() ? null : this.ourStack[this.top];
	}

	public T pop() {
		return isStackEmpty() ? null : this.ourStack[this.top--];
	}

	public void readTheStack() {
		tellMeTheStats();
	}

	/**
	 * 
	 */
	private boolean isStackFull() {
		return top == sizeOfStack - 1;
	}

	private boolean isStackEmpty() {
		return top == -1 ? true : false;
	}

	private void tellMeTheStats() {
		System.out.println("Top is at : " + this.top + " -- Size of the stack is " + this.sizeOfStack);
		for (T eachEntry : this.ourStack) {
			System.out.println(eachEntry);
		}
	}

	private void increaseStackSize(int multiplierFactor) {
		@SuppressWarnings("unchecked")
		T[] newStack = (T[]) new Object[this.sizeOfStack * multiplierFactor];
		for (int i = 0; i < this.sizeOfStack; i++) {
			newStack[i] = this.ourStack[i];
		}
		this.ourStack = newStack;
		this.sizeOfStack = newStack.length;
	}
}

public class StackUsingGenerics {

	public StackUsingGenerics() {
	}

	public static void main(String[] args) {
		MyGenericStack<String> myStringStack = new MyGenericStack<String>(5);
		myStringStack.push("Hello world..!");
		myStringStack.push("This is my stack implemented by generics");
		myStringStack.push("filling 1");
		myStringStack.push("filling 2");
		myStringStack.push("filling 3");
		myStringStack.readTheStack();
		System.out.println("lets peek at the stack : " + myStringStack.peek());
		System.out.println("lets pop an element " + myStringStack.pop() + " is popped..!");
		System.out.println("lets peek again : " + myStringStack.peek());
		myStringStack.readTheStack();
	}

}
