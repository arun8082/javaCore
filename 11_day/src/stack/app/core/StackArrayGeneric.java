package stack.app.core;

import stack.app.custExc.StackException;

@SuppressWarnings("unchecked")
public class StackArrayGeneric<T> {
	public int SIZE;
	public int TOP;
	public T[] array;
	public StackArrayGeneric() {
		SIZE = 3;
		array = (T[])new Object[SIZE];
		TOP = -1;
	}
	public StackArrayGeneric(int size) {
		SIZE = size;
		array = (T[])new Object[SIZE];
		TOP = -1;
	}

	public boolean push(T data) throws StackException {
		if (TOP == SIZE - 1) {
			throw new StackException("Stack is overflow");
		}
		TOP++;
		array[TOP] = data;
		return true;
	}

	public T pop() throws StackException {
		if (TOP == -1) {
			throw new StackException("Stack Underflow");
		}
		return array[TOP--];
	}
	public T peep() throws StackException{
		if (TOP == -1) {
			throw new StackException("Stack Underflow");
		}
		return array[TOP];
	}
}
