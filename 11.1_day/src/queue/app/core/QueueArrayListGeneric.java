package queue.app.core;

import java.util.ArrayList;

import queue.app.custExc.QueueException;

public class QueueArrayListGeneric<T> {
	public int SIZE;
	public int FRONT;
	public int REAR;
	public ArrayList<T> list;

	public QueueArrayListGeneric() {
		SIZE = 3;
		list = new ArrayList<T>();
		FRONT = -1;
		REAR = -1;
	}

	public QueueArrayListGeneric(int size) {
		SIZE = size;
		list = new ArrayList<T>();
		FRONT = -1;
		REAR = -1;
	}

	public boolean push(T data) throws QueueException {
		if (REAR == SIZE - 1) {
			throw new QueueException("Queue is overflow");
		}
		if (REAR == -1)
			FRONT++;
		REAR++;
		list.add(data);
		System.out.println("front: " + FRONT + " REAR: " + REAR);
		return true;
	}

	public T pop() throws QueueException {
		if (FRONT != 0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return list.get(FRONT++);
	}

	public T peep() throws QueueException {
		if (FRONT != 0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return list.get(FRONT);
	}
}