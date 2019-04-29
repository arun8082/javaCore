package stack.app.core;

import stack.app.custExc.StackException;

public class StackArray {
	public int SIZE;
	public int TOP;
	public int[] array;
	public StackArray() {
		SIZE = 3;
		array = new int[SIZE];
		TOP = -1;
	}
	public StackArray(int size) {
		SIZE = size;
		array = new int[SIZE];
		TOP = -1;
	}

	public boolean push(int data) throws StackException {
		if (TOP == SIZE - 1) {
			throw new StackException("Stack is overflow");
		}
		TOP++;
		array[TOP] = data;
		return true;
	}

	public int pop() throws StackException {
		if (TOP == -1) {
			throw new StackException("Stack Underflow");
		}
		return array[TOP--];
	}
	public int peep() throws StackException{
		if (TOP == -1) {
			throw new StackException("Stack Underflow");
		}
		return array[TOP];
	}
}
