package com.stack;

public class Stackd implements Stack {
	private int[] stack;
	private static int top;
	private static int SIZE = 2;
	public Stackd(){
		stack=new int[SIZE];
		top=-1;
	}

	public boolean push(int element) {
		if (top+1 == SIZE) {
			stack = growStack();
		}
		if (top + 1 < SIZE) {
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

	private int[] growStack() {
		SIZE = SIZE * 2;
		int temp[] = new int[SIZE];
		for (int i = 0; i < stack.length; i++) {
			temp[i] = stack[i];
		}
		return temp;
	}

}
