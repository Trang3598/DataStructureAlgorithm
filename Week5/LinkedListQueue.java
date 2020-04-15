package Week5;

import java.util.Iterator;

import Week5.LinkedListStack.Node;

public class LinkedListQueue<E> implements QueueInterface<E> {
	class Node {
		E element;
		Node next;
	}

	Node front = null; // node dau tien
	Node rear = null;  // node cuoi
	private int n = 0;

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}

	@Override
	public void enqueue(E element) {
		// add (store) an item to the queue.
		Node newNode = new Node();
		newNode.element = element;
		if (this.rear == null) {
			this.rear = this.front = newNode;
		} else {
			this.rear.next = newNode;
			this.rear = newNode;
		}
		n++;
	}

	@Override
	public E dequeue() {
		// remove (access) an item from the queue.
		if (front == null) {
			return null;
		} else {
			Node newNode = front;
			front = front.next;
			if (front == null) {
				rear = null;
			}
		}
		n--;
		return null;
	}

	@Override
	public boolean isEmpty() {
		// Checks if the queue is empty.
		return size() == 0;
	}

	@Override
	public int size() {
		return n;
	}

	class QueueIterator implements Iterator<E> {
		private Node currentNode = front;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E data = currentNode.element;
			currentNode = currentNode.next;
			return data;
		}

	}

	public static void main(String[] args) {
		LinkedListQueue<Integer> q = new LinkedListQueue<>();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		System.out.println("Size of stack = " + q.size());
		System.out.println("Queue Front : " + q.front.element);
		System.out.println("Queue Rear : " + q.rear.element);
		for (Integer integer : q) {
			System.out.println(integer);
		}
	}
}
