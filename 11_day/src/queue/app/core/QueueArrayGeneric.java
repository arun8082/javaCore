package queue.app.core;

import queue.app.custExc.QueueException;

@SuppressWarnings("unchecked")
public class QueueArrayGeneric<T> {
	public int SIZE;
	public int FRONT;
	public int REAR;
	public T[] array;

	public QueueArrayGeneric() {
		SIZE = 3;
		array = (T[]) new Object[SIZE];
		FRONT = -1;
		REAR = -1;
	}

	public QueueArrayGeneric(int size) {
		SIZE = size;
		array = (T[]) new Object[SIZE];
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
		array[REAR] = data;
		System.out.println("front: " + FRONT + " REAR: " + REAR);
		return true;
	}

	public T pop() throws QueueException {
		if (FRONT != 0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return array[FRONT++];
	}

	public T peep() throws QueueException {
		if (FRONT != 0 && FRONT == SIZE) {
			throw new QueueException("Queue Underflow");
		}
		return array[FRONT];
	}
}