package queue.app.core;

import java.util.ArrayList;

import queue.app.custExc.QueueException;

public class QueueArrayList {
	public int SIZE;
	public int FRONT;
	public int REAR;
	public ArrayList<Integer> list;

	public QueueArrayList() {
		SIZE = 3;
		list = new ArrayList<Integer>(3);
		FRONT = -1;
		REAR = -1;
	}

	public QueueArrayList(int size) {
		SIZE = size;
		list = new ArrayList<Integer>();
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
		list.add(data);
		System.out.println("front: "+FRONT+" REAR: "+REAR);
		return true;
	}

	public int pop() throws QueueException {
		if (FRONT!=0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return list.get(FRONT++);
	}

	public int peep() throws QueueException {
		if (FRONT!=0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return list.get(FRONT);
	}
}