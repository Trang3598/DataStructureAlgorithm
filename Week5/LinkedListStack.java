package Week5;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
	class Node {
		E element;
		Node next;
	}

	Node stack = null; // node dau tien
	private int n = 0;

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<E>) new StackIterator();
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.element = element;
		if (stack == null) {
			stack = newNode;
		} else {
			Node temp = stack;
			stack =  newNode;
			newNode.next = temp;
		}
		n++;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			return null;
		} else {
			stack = stack.next;
		}
		n--;
		return stack.element;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (stack == null) {
			return true;
		}
		return false;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if (stack == null) {
			return null;
		}
		return stack.element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	class StackIterator implements Iterator<E> {
		private Node currentNode = stack;

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
		LinkedListStack<Integer> stack = new LinkedListStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println("Top = " + stack.top());
		System.out.println("Size of stack = " + stack.size());
		System.out.println("The current listing is: ");
		for (Integer integer : stack) {
			System.out.print(integer + " ");
		}
	}

	@Override
	public void set(int i, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
