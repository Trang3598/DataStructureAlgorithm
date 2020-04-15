package Week5;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {
	private E[] queue;
	private int n = 0;
	private int top = 0;
	private int count = 0;
	private int default_size = 100;

	public ArrayQueue(int capacity) {
		n = capacity;
		queue = (E[]) new Object[capacity];
	}

	public ArrayQueue() {
		n = default_size;
		queue = (E[]) new Object[default_size];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> test = new ArrayQueue<>();
		test.enqueue(3);
		test.enqueue(2);
		test.enqueue(1);
		System.out.println("Remove " + test.dequeue() + " from queue");
		System.out.println("Size of queue = " + test.size());
		System.out.println("The current listing is : ");
		for (Integer integer : test) {
			System.out.print(integer + " ");
		}

	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new ArrayQueueIterator();
	}

	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		if (size() == queue.length) {
			throw new IllegalStateException("Queue is full");
		} else {
			int temp = (top + count) % queue.length;
			queue[temp] = element;
			count++;
		}
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			return null;
		} else {
			E temp = queue[top];
			top = (top + 1) % queue.length;
			count--;
			return temp;
		}

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public int size() {
		return count;
	}

	class ArrayQueueIterator implements Iterator<E> {
		private int current = top;
		private int num = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return num < count;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E data = queue[(current + num) % n];
			num++;
			return data;
		}

	}

}
