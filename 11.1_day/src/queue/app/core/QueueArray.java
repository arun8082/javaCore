package queue.app.core;

import queue.app.custExc.QueueException;

public class QueueArray {
	public int SIZE;
	public int FRONT;
	public int REAR;
	public int[] array;

	public QueueArray() {
		SIZE = 3;
		array = new int[SIZE];
		FRONT = -1;
		REAR = -1;
	}

	public QueueArray(int size) {
		SIZE = size;
		array = new int[SIZE];
		FRONT = -1;
		REAR = -1;
	}

	public boolean push(int data) throws QueueException {
		if (REAR == SIZE - 1) {
			throw new QueueException("Queue is overflow");
		}
		if (REAR == -1)
			FRONT++;
		REAR++;
		array[REAR] = data;
		System.out.println("front: "+FRONT+" REAR: "+REAR);
		return true;
	}

	public int pop() throws QueueException {
		if (FRONT!=0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return array[FRONT++];
	}

	public int peep() throws QueueException {
		if (FRONT!=0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return array[FRONT];
	}
}