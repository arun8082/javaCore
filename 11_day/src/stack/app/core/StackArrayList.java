package stack.app.core;

import java.util.ArrayList;
import java.util.List;

import stack.app.custExc.StackException;

public class StackArrayList {
	public int SIZE;
	public int TOP;
	public List<Integer> list;

	public StackArrayList() {
		SIZE = 3;
		list = new ArrayList<Integer>(SIZE);
		TOP = -1;
	}

	public StackArrayList(int size) {
		SIZE = size;
		list = new ArrayList<Integer>(SIZE);
		TOP = -1;
	}

	public boolean push(int data) throws StackException {
		if (TOP == SIZE - 1) {
			throw new StackException("Stack is overflow");
		}
		TOP++;
		list.add(data);
		return true;
	}

	public int pop() throws StackException {
		try {
			return list.get(TOP--);
		} catch (IndexOutOfBoundsException e) {
			throw new StackException("Stack Underflow");
		}
	}

	public int peep() throws StackException {
		try {
			return list.get(TOP);
		} catch (IndexOutOfBoundsException e) {
			throw new StackException("Stack Underflow");
		}
	}
}
