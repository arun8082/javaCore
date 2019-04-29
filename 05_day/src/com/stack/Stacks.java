package com.stack;

public class Stacks implements Stack {
	private static final int SIZE=4;//Size of stack
	private int[] stack;//stack reference
	private static int top;//top index

	//initialize instance variables
	public Stacks() {
		stack = new int[4];
		top = -1;
	}
	
	public boolean push(int element) {
		if (top+1 < SIZE) {
			stack[++top] = element;
			return true;
		}
		return false;
	}

	public int pop() {
		if (top > -1) {
			int temp = stack[top];
			stack[top] = 0;
			top--;
			return temp;
		}
		return 0;
	}

	public int peep() {
		if (top > -1) {
			return stack[top];
		}
		return 0;
	}
}
