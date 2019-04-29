package stack.app.core;

import java.util.ArrayList;
import java.util.List;

import stack.app.custExc.StackException;

public class StackArrayListGeneric<T> {
	public int SIZE;
	public int TOP;
	public List<T> list;

	public StackArrayListGeneric() {
		SIZE = 3;
		list = new ArrayList<T>(SIZE);
		TOP = -1;
	}

	public StackArrayListGeneric(int size) {
		SIZE = size;
		list = new ArrayList<T>(SIZE);
		TOP = -1;
	}

	public boolean push(T data) throws StackException {
		if (TOP == SIZE-1) {//list.size()==SIZE
			throw new StackException("Stack is overflow");
		}
		TOP++;
		list.add(data);
		return true;
	}

	public T pop() throws StackException {
		try {
			return list.get(TOP--);
		} catch (IndexOutOfBoundsException e) {
			throw new StackException("Stack Underflow");
		}
	}

	public T peep() throws StackException {
		try {
			return list.get(TOP);
		} catch (IndexOutOfBoundsException e) {
			throw new StackException("Stack Underflow");
		}
	}
}
